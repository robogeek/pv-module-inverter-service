package com.davidherron.pvmodulesinverters.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.davidherron.pvmodulesinverters.model.Module;


@Repository
public class ModulesRepository {

    private static final Logger logger = LoggerFactory.getLogger(ModulesRepository.class);
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private SimpleJdbcInsert insertModule;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        this.insertModule = new SimpleJdbcInsert(dataSource)
            .withTableName("modules")
                .usingGeneratedKeyColumns("id");
    }

    @SuppressWarnings("unchecked")
    public List<Module> searchForModules(
            String manufacturer, String modelNumber, Float minPmax, Float maxPmax,
            Float minVpmax, Float maxVpmax, Float minVoc, Float maxVoc, Float minIsc,
            Float maxIsc, String family, String technology) {

        String sql = "SELECT * FROM modules ";
        String where = "";
        MapSqlParameterSource namedParameters = new MapSqlParameterSource();

        if (manufacturer != null) {
            where += "Manufacturer = :manufacturer";
            namedParameters.addValue("manufacturer", manufacturer);
        }
        if (modelNumber != null) {
            if (where != "") where += " AND ";
            where += "ModelNumber = :modelNumber";
            namedParameters.addValue("modelNumber", modelNumber);
        }
        if (minPmax != null) {
            if (where != "") where += " AND ";
            where += "NameplatePmax >= :minPmax";
            namedParameters.addValue("minPmax", minPmax);
        }
        if (maxPmax != null) {
            if (where != "") where += " AND ";
            where += "NameplatePmax <= :maxPmax";
            namedParameters.addValue("maxPmax", maxPmax);
        }
        if (minVpmax != null) {
            if (where != "") where += " AND ";
            where += "NameplateVpmax >= :minVpmax";
            namedParameters.addValue("minVpmax", minVpmax);
        }
        if (maxVpmax != null) {
            if (where != "") where += " AND ";
            where += "NameplateVpmax <= :maxVpmax";
            namedParameters.addValue("maxVpmax", maxVpmax);
        }
        if (minVoc != null) {
            if (where != "") where += " AND ";
            where += "NameplateVoc >= :minVoc";
            namedParameters.addValue("minVoc", minVoc);
        }
        if (maxVoc != null) {
            if (where != "") where += " AND ";
            where += "NameplateVoc <= :maxVoc";
            namedParameters.addValue("maxVoc", maxVoc);
        }
        if (minIsc != null) {
            if (where != "") where += " AND ";
            where += "NameplateIsc >= :minIsc";
            namedParameters.addValue("minIsc", minIsc);
        }
        if (maxIsc != null) {
            if (where != "") where += " AND ";
            where += "NameplateIsc <= :maxIsc";
            namedParameters.addValue("maxIsc", maxIsc);
        }
        if (family != null) {
            if (where != "") where += " AND ";
            where += "Family = :family";
            namedParameters.addValue("family", family);
        }
        if (technology != null) {
            if (where != "") where += " AND ";
            where += "Technology = :technology";
            namedParameters.addValue("technology", technology);
        }

        if (where != "") where = " WHERE "+ where;
        sql = sql + where;

        return (List<Module>) this.namedParameterJdbcTemplate.query(sql, namedParameters, new RowMapper<Module>() {

            @Override
            public Module mapRow(ResultSet arg0, int arg1) throws SQLException {
                Module module = new Module();
                module
                    .manufacturer(arg0.getString("Manufacturer"))
                    .modelNumber(arg0.getString("ModelNumber"))
                    .description(arg0.getString("Description"))
                    .BIPV(arg0.getString("BIPV"))
                    .nameplatePmax(arg0.getDouble("NameplatePmax"))
                    .PTC(arg0.getDouble("PTC"))
                    .notes(arg0.getString("Notes"))
                    .nameplateVpmax(arg0.getDouble("NameplateVpmax"))
                    .nameplateIpmax(arg0.getDouble("NameplateIpmax"))
                    .nameplateVoc(arg0.getDouble("NameplateVoc"))
                    .nameplateIsc(arg0.getDouble("NameplateIsc"))
                    .averageNOCT(arg0.getDouble("AverageNOCT"))
                    .betaVoc(arg0.getDouble("betaVoc"))
                    .betaVpmax(arg0.getDouble("betaVpmax"))
                    .alphaIsc(arg0.getDouble("alphaIsc"))
                    .alphaIpmax(arg0.getDouble("alphaIpmax"))
                    .gammaPmax(arg0.getDouble("gammaPmax"))
                    .vpmaxlow(arg0.getDouble("VPmaxlow"))
                    .ipmaxlow(arg0.getDouble("IPmaxlow"))
                    .vpmaxNOCT(arg0.getDouble("VPmaxNOCT"))
                    .ipmaxNOCT(arg0.getDouble("IPmaxNOCT"))
                    .shortSide(arg0.getDouble("ShortSide"))
                    .longSide(arg0.getDouble("LongSide"))
                    .geometricMultiplier(arg0.getDouble("GeometricMultiplier"))
                    .apertureArea(arg0.getDouble("ApertureArea"))
                    .numberCellsSeries(arg0.getDouble("NumberCellsSeries"))
                    .numberCellsParallel(arg0.getDouble("NumberCellsParallel"))
                    .type(arg0.getString("Type"))
                    .family(arg0.getString("Family"))
                    .technology(arg0.getString("Technology"))
                    .p2pref(arg0.getString("P2Pref"))
                    .percentNonlin(arg0.getString("PercentNonlin"))
                    .a_ref(arg0.getString("a_ref"))
                    .I_o_ref(arg0.getString("I_o_ref"))
                    .I_L_ref(arg0.getString("I_L_ref"))
                    .R_s_ref(arg0.getString("R_s_ref"))
                    .R_sh_ref(arg0.getString("R_sh_ref"))
                    .delta(arg0.getString("delta"))
                    .I_sc_adj(arg0.getString("I_sc_adj"))
                    .time(arg0.getString("Time"))
                    .version(arg0.getString("Version"))
                    .mounting(arg0.getString("Mounting"))
                    .lastUpdate(arg0.getString("LastUpdate"))
                    .cecListingDate(arg0.getString("CECListingDate"));
                return module;
            }

        });
    }

    public void save(Module module) {
        SqlParameterSource parameters = new BeanPropertySqlParameterSource(module);
        insertModule.execute(parameters);
    }
}
