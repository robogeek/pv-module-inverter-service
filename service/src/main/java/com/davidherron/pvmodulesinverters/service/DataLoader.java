package com.davidherron.pvmodulesinverters.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseDouble;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.CsvListReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.io.ICsvListReader;
import org.supercsv.prefs.CsvPreference;

import com.davidherron.pvmodulesinverters.model.Inverter;
import com.davidherron.pvmodulesinverters.model.Module;
import com.davidherron.pvmodulesinverters.repository.InvertersRepository;
import com.davidherron.pvmodulesinverters.repository.ModulesRepository;

@Service
public class DataLoader {

    private static final Logger logger = LoggerFactory.getLogger(DataLoader.class);

    @Value("${pvdata.inverters}")
    private String pvDataInvertersCSV;

    @Value("${pvdata.modules}")
    private String pvDataModulesCSV;

    private InvertersRepository invertersRepository;
    private ModulesRepository modulesRepository;

    @Autowired
    public DataLoader(InvertersRepository invertersRepository, ModulesRepository modulesRepository) {
        this.invertersRepository = invertersRepository;
        this.modulesRepository = modulesRepository;
    }

    private static CellProcessor[] getInverterProcessors() {
        final CellProcessor[] processors = new CellProcessor[] {
            new Optional(), // ManufacturerName
            new Optional(), // ModelNumber
            new Optional(), // Description
            new Optional(new ParseDouble()), // PowerRatingContinuous
            new Optional(), // NominalVoltage
            new Optional(new ParseDouble()), // WeightedEfficiency
            new Optional(), // UL1741SupplementACertification
            new Optional(), // FirmwareVersionTested
            new Optional(), // BuiltInMeter
            new Optional(), // Microinverter
            new Optional(), // Notes
            new Optional(new ParseDouble()), // NightTareLoss
            new Optional(new ParseDouble()), // PowerRatingContinuous40degC
            new Optional(new ParseDouble()), // NightTareLoss40degC
            new Optional(new ParseDouble()), // VoltageMinimum
            new Optional(new ParseDouble()), // VoltageNominal
            new Optional(new ParseDouble()), // VoltageMaximum
            new Optional(new ParseDouble()), // PowerLevel10
            new Optional(new ParseDouble()), // PowerLevel20
            new Optional(new ParseDouble()), // PowerLevel30
            new Optional(new ParseDouble()), // PowerLevel50
            new Optional(new ParseDouble()), // PowerLevel75
            new Optional(new ParseDouble()), // PowerLevel100
            new Optional(new ParseDouble()), // EfficiencyVmin10
            new Optional(new ParseDouble()), // EfficiencyVmin20
            new Optional(new ParseDouble()), // EfficiencyVmin30
            new Optional(new ParseDouble()), // EfficiencyVmin50
            new Optional(new ParseDouble()), // EfficiencyVmin75
            new Optional(new ParseDouble()), // EfficiencyVmin100
            new Optional(new ParseDouble()), // EfficiencyVmin
            new Optional(new ParseDouble()), // EfficiencyVnom10
            new Optional(new ParseDouble()), // EfficiencyVnom20
            new Optional(new ParseDouble()), // EfficiencyVnom30
            new Optional(new ParseDouble()), // EfficiencyVnom50
            new Optional(new ParseDouble()), // EfficiencyVnom75
            new Optional(new ParseDouble()), // EfficiencyVnom100
            new Optional(new ParseDouble()), // EfficiencyVnom
            new Optional(new ParseDouble()), // EfficiencyVmax10
            new Optional(new ParseDouble()), // EfficiencyVmax20
            new Optional(new ParseDouble()), // EfficiencyVmax30
            new Optional(new ParseDouble()), // EfficiencyVmax50
            new Optional(new ParseDouble()), // EfficiencyVmax75
            new Optional(new ParseDouble()), // EfficiencyVmax100
            new Optional(new ParseDouble()), // EfficiencyVmax
            new Optional(), // SortOrder
            new Optional(), // CECListingDate
            new Optional() // LastUpdate
        };
        return processors;
    }

    private static CellProcessor[] getModuleProcessors() {
        final CellProcessor[] processors = new CellProcessor[] {
            new Optional(), // Manufacturer
            new Optional(), // ModelNumber
            new Optional(), // Description
            new Optional(), // BIPV
            new Optional(new ParseDouble()), // NameplatePmax
            new Optional(new ParseDouble()), // PTC
            new Optional(), // Notes
            new Optional(new ParseDouble()), // NameplateVpmax
            new Optional(new ParseDouble()), // NameplateIpmax
            new Optional(new ParseDouble()), // NameplateVoc
            new Optional(new ParseDouble()), // NameplateIsc
            new Optional(new ParseDouble()), // AverageNOCT
            new Optional(new ParseDouble()), // betaVoc
            new Optional(new ParseDouble()), // betaVpmax
            new Optional(new ParseDouble()), // alphaIsc
            new Optional(new ParseDouble()), // alphaIpmax
            new Optional(new ParseDouble()), // gammaPmax
            new Optional(new ParseDouble()), // VPmaxlow
            new Optional(new ParseDouble()), // IPmaxlow
            new Optional(new ParseDouble()), // VPmaxNOCT
            new Optional(new ParseDouble()), // IPmaxNOCT
            new Optional(new ParseDouble()), // ShortSide
            new Optional(new ParseDouble()), // LongSide
            new Optional(new ParseDouble()), // GeometricMultiplier
            new Optional(new ParseDouble()), // ApertureArea
            new Optional(new ParseDouble()), // NumberCellsSeries
            new Optional(new ParseDouble()), // NumberCellsParallel
            new Optional(), // Type
            new Optional(), // Family
            new Optional(), // Technology
            new Optional(), // P2Pref
            new Optional(), // PercentNonlin
            new Optional(), // a_ref
            new Optional(), // I_o_ref
            new Optional(), // I_L_ref
            new Optional(), // R_s_ref
            new Optional(), // R_sh_ref
            new Optional(), // delta
            new Optional(), // I_sc_adj
            new Optional(), // Time
            new Optional(), // Version
            new Optional(), // Mounting
            new Optional(), // LastUpdate
            new Optional() // CECListingDate
        };
        return processors;
    }

    @PostConstruct
    private void loadData() throws IOException {

        ICsvBeanReader beanReader = null;
        try {
        		// logger.info("loadData pvDataInvertersCSV="+ pvDataInvertersCSV);
            Resource resource = new ClassPathResource(pvDataInvertersCSV);
			// logger.info("loadData pvDataInvertersCSV resource="+ resource.getFilename());
            beanReader = new CsvBeanReader(new InputStreamReader(resource.getInputStream()), CsvPreference.STANDARD_PREFERENCE);

            final String[] header = beanReader.getHeader(true);
            // int i = 0;
            // for (String hdr : header) {
    			//	logger.info("loadData pvDataInvertersCSV header["+Integer.toString(i++) +"]="+ hdr);
            // }
            final CellProcessor[] inverterProcessors = getInverterProcessors();
            // logger.info("inverterProcessors # = "+ inverterProcessors.length);

            Inverter inverter;
            while( (inverter = beanReader.read(Inverter.class, header, inverterProcessors)) != null ) {
                invertersRepository.save(inverter);
            }

        }
        finally {
                if( beanReader != null ) {
                    beanReader.close();
                }
        }
        try {
    			// logger.info("loadData pvDataModulesCSV="+ pvDataModulesCSV);
            Resource resource = new ClassPathResource(pvDataModulesCSV);
			// logger.info("loadData pvDataModulesCSV resource="+ resource.getFilename());
            beanReader = new CsvBeanReader(new InputStreamReader(resource.getInputStream()), CsvPreference.STANDARD_PREFERENCE);

            final String[] header = beanReader.getHeader(true);
            // int i = 0;
            // for (String hdr : header) {
    			//	logger.info("loadData pvDataModulesCSV header["+Integer.toString(i++) +"]="+ hdr);
            // }
            final CellProcessor[] moduleProcessors = getModuleProcessors();
            // logger.info("moduleProcessors # = "+ moduleProcessors.length);

            Module module;
            while( (module = beanReader.read(Module.class, header, moduleProcessors)) != null ) {
                modulesRepository.save(module);
            }

        }
        finally {
                if( beanReader != null ) {
                    beanReader.close();
                }
        }
    }
}
