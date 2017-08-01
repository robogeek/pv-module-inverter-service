package com.davidherron.pvmodulesinverters.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.davidherron.pvmodulesinverters.model.Inverter;

@Repository
public class InvertersRepository {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private SimpleJdbcInsert insertInverter;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        this.insertInverter = new SimpleJdbcInsert(dataSource)
                .withTableName("inverters")
                .usingGeneratedKeyColumns("id");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Inverter> searchForInverters(
            String manufacturer, String model, Float minpower,
            Float maxpower, Float minvoltage, Float maxvoltage,
            String hasmeter, String microinverter) {

        String sql = "SELECT * FROM inverters ";
        String where = "";
        MapSqlParameterSource namedParameters = new MapSqlParameterSource();

        if (manufacturer != null) {
            where += "ManufacturerName = :manufacturer";
            namedParameters.addValue("manufacturer", manufacturer);
        }
        if (model != null) {
            if (where != "") where += " AND ";
            where += "ModelNumber = :model";
            namedParameters.addValue("model", model);
        }
        if (minpower != null) {
            if (where != "") where += " AND ";
            where += "PowerRatingContinuous >= :minpower";
            namedParameters.addValue("minpower", minpower);
        }
        if (maxpower != null) {
            if (where != "") where += " AND ";
            where += "PowerRatingContinuous <= :maxpower";
            namedParameters.addValue("maxpower", maxpower);
        }
        if (minvoltage != null) {
            if (where != "") where += " AND ";
            where += "NominalVoltage >= :minvoltage";
            namedParameters.addValue("minvoltage", minvoltage);
        }
        if (maxvoltage != null) {
            if (where != "") where += " AND ";
            where += "NominalVoltage <= :maxvoltage";
            namedParameters.addValue("maxvoltage", maxvoltage);
        }
        if (hasmeter != null) {
            if (where != "") where += " AND ";
            where += "BuiltInMeter = :hasmeter";
            namedParameters.addValue("hasmeter", hasmeter);
        }
        if (microinverter != null) {
            if (where != "") where += " AND ";
            where += "Microinverter = :microinverter";
            namedParameters.addValue("microinverter", microinverter);
        }

        if (where != "") where = " WHERE "+ where;
        sql = sql + where + " ORDER BY sortOrder";

        return this.namedParameterJdbcTemplate.query(sql, namedParameters, new RowMapper() {

            @Override
            public Object mapRow(ResultSet arg0, int arg1) throws SQLException {
                Inverter inverter = new Inverter();
                inverter
                    .manufacturerName(arg0.getString("ManufacturerName"))
                    .modelNumber(arg0.getString("ModelNumber"))
                    .description(arg0.getString("Description"))
                    .powerRating(arg0.getDouble("PowerRatingContinuous"))
                    .nominalVoltage(arg0.getString("NominalVoltage"))
                    .weightedEfficiency(arg0.getDouble("WeightedEfficiency"))
                    .ul1741SA(arg0.getString("UL1741SupplementACertification"))
                    .firmwareVersionTested(arg0.getString("FirmwareVersionTested"))
                    .builtInMeter(arg0.getString("BuiltInMeter"))
                    .microInverter(arg0.getString("Microinverter"))
                    .notes(arg0.getString("Notes"))
                    .nightTareLoss(arg0.getDouble("NightTareLoss"))
                    .powerRatingContinuous40degC(arg0.getDouble("PowerRatingContinuous40degC"))
                    .nightTareLoss40degC(arg0.getDouble("NightTareLoss40degC"))
                    .voltageMinDC(arg0.getDouble("VoltageMinimum"))
                    .voltageNominalDC(arg0.getDouble("VoltageNominal"))
                    .voltageMaxDC(arg0.getDouble("VoltageMaximum"))
                    .powerLevel10(arg0.getDouble("PowerLevel10"))
                    .powerLevel20(arg0.getDouble("PowerLevel20"))
                    .powerLevel30(arg0.getDouble("PowerLevel30"))
                    .powerLevel50(arg0.getDouble("PowerLevel50"))
                    .powerLevel75(arg0.getDouble("PowerLevel75"))
                    .powerLevel100(arg0.getDouble("PowerLevel100"))
                    .efficiencyVmin10(arg0.getDouble("EfficiencyVmin10"))
                    .efficiencyVmin20(arg0.getDouble("EfficiencyVmin20"))
                    .efficiencyVmin30(arg0.getDouble("EfficiencyVmin30"))
                    .efficiencyVmin50(arg0.getDouble("EfficiencyVmin50"))
                    .efficiencyVmin75(arg0.getDouble("EfficiencyVmin75"))
                    .efficiencyVmin100(arg0.getDouble("EfficiencyVmin100"))
                    .efficiencyVnom10(arg0.getDouble("EfficiencyVnom10"))
                    .efficiencyVnom20(arg0.getDouble("EfficiencyVnom20"))
                    .efficiencyVnom30(arg0.getDouble("EfficiencyVnom30"))
                    .efficiencyVnom50(arg0.getDouble("EfficiencyVnom50"))
                    .efficiencyVnom75(arg0.getDouble("EfficiencyVnom75"))
                    .efficiencyVnom100(arg0.getDouble("EfficiencyVnom100"))
                    .efficiencyVmax10(arg0.getDouble("EfficiencyVmax10"))
                    .efficiencyVmax20(arg0.getDouble("EfficiencyVmax20"))
                    .efficiencyVmax30(arg0.getDouble("EfficiencyVmax30"))
                    .efficiencyVmax50(arg0.getDouble("EfficiencyVmax50"))
                    .efficiencyVmax75(arg0.getDouble("EfficiencyVmax75"))
                    .efficiencyVmax100(arg0.getDouble("EfficiencyVmax100"))
                    .sortOrder(arg0.getString("SortOrder"))
                    .cecListingDate(arg0.getString("CECListingDate"))
                    .lastUpdate(arg0.getString("LastUpdate"));
                return inverter;
            }
        });
    }

    public void save(Inverter inverter) {
        SqlParameterSource parameters = new BeanPropertySqlParameterSource(inverter);
        insertInverter.execute(parameters);
    }

}
