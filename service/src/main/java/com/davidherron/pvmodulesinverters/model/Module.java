package com.davidherron.pvmodulesinverters.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import org.springframework.data.annotation.Id;

/**
 * Module
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-25T02:09:48.524Z")
@ApiModel(description="Information model for photovoltaic solar panels")
public class Module {

	@Id
	// @GeneratedValue
	int id;

	@JsonProperty("manufacturer")
	@JsonPropertyDescription("Manufacturer name")
	private String manufacturer = null;

	@JsonProperty("modelNumber")
	@JsonPropertyDescription("Manufacturer-assigned model number")
	private String modelNumber = null;

	@JsonProperty("description")
	@JsonPropertyDescription("Manufacturer's description")
	private String description = null;

	@JsonProperty("bipv")
	@JsonPropertyDescription("Building Integrated Photovoltaic Module")
	private String BIPV = null;

	@JsonProperty("nameplatePmax")
	@JsonPropertyDescription("Maximum power at standard test conditions")
	private Double nameplatePmax = null;

	@JsonProperty("ptc")
	@JsonPropertyDescription("Power value at PV USA Test Conditions")
	private Double PTC = null;

	@JsonProperty("notes")
	@JsonPropertyDescription("Manufacturer's notes")
	private String notes = null;

	@JsonProperty("nameplateVpmax")
	@JsonPropertyDescription("Voltage at Maximum Power (Vpmax)")
	private Double nameplateVpmax = null;

	@JsonProperty("nameplateIpmax")
	@JsonPropertyDescription("Current at Maximum Power (Ip max)")
	private Double nameplateIpmax = null;

	@JsonProperty("nameplateVoc")
	@JsonPropertyDescription("Open Circuit Voltage (Voc)")
	private Double nameplateVoc = null;

	@JsonProperty("nameplateIsc")
	@JsonPropertyDescription("Short Circuit Current (Isc)")
	private Double nameplateIsc = null;

	@JsonProperty("averageNOCT")
	@JsonPropertyDescription("Nominal Operating Cell Temperature. The temperature reached by open circuited cells in a PV "
			+ "module under the following conditions: 800 watts per square meter irradiance on cell surface, 20 "
			+ "degrees Celsius air temperature, 1 meter per second wind velocity, and open back side mounting")
	private Double averageNOCT = null;

	@JsonProperty("betaVoc")
	@JsonPropertyDescription("Temperature Coefficient of Open Circuit Voltage, percent per degrees Celsius (β Voc)")
	private Double betaVoc = null;

	@JsonProperty("betaVpmax")
	@JsonPropertyDescription("Temperature Coefficient of Voltage at Maximum Power, percent per degrees Celsius (β Vp max)")
	private Double betaVpmax = null;

	@JsonProperty("alphaIsc")
	@JsonPropertyDescription("Temperature Coefficient of Short Circuit Current, percent per degrees Celsius (α Isc)")
	private Double alphaIsc = null;

	@JsonProperty("alphaIpmax")
	@JsonPropertyDescription("Temperature Coefficient of Current at Maximum Power, percent per degrees Celsius (α Ip max)")
	private Double alphaIpmax = null;

	@JsonProperty("gammaPmax")
	@JsonPropertyDescription("Temperature Coefficient of Maximum Power, percent per degrees Celsius (γ Pmax)")
	private Double gammaPmax = null;

	@JsonProperty("VPmaxlow")
	@JsonPropertyDescription("Voltage at Maximum Power and Low Irradiance (V Pmax, low)")
	private Double vpmaxlow = null;

	@JsonProperty("IPmaxlow")
	@JsonPropertyDescription("Current at Maximum Power and Low Irradiance (I Pmax, low)")
	private Double ipmaxlow = null;

	@JsonProperty("VPmaxNOCT")
	@JsonPropertyDescription("Voltage at Maximum Power and NOCT. (V Pmax, NOCT)")
	private Double vpmaxNOCT = null;

	@JsonProperty("IPmaxNOCT")
	@JsonPropertyDescription("Current at Maximum Power and NOCT (I Pmax, NOCT)")
	private Double ipmaxNOCT = null;

	@JsonProperty("shortSide")
	@JsonPropertyDescription("Size on short side, in Meters")
	private Double shortSide = null;

	@JsonProperty("longSide")
	@JsonPropertyDescription("Size on long side, in Meters")
	private Double longSide = null;

	@JsonProperty("geometricMultiplier")
	@JsonPropertyDescription("Geometric Multiplier")
	private Double geometricMultiplier = null;

	@JsonProperty("apertureArea")
	@JsonPropertyDescription("")
	private Double ApertureArea = null;

	@JsonProperty("numberCellsSeries")
	@JsonPropertyDescription("Number of Cells in Series")
	private Double NumberCellsSeries = null;

	@JsonProperty("numberCellsParallel")
	@JsonPropertyDescription("Number of Cells in Parallel")
	private Double NumberCellsParallel = null;

	@JsonProperty("type")
	@JsonPropertyDescription("Module type")
	private String type = null;

	@JsonProperty("family")
	@JsonPropertyDescription("Cell Technology family")
	private String family = null;

	@JsonProperty("technology")
	@JsonPropertyDescription("Cell Technology type")
	private String technology = null;

	@JsonProperty("p2pref")
	@JsonPropertyDescription("P2Pref")
	private String p2pref = null;

	@JsonProperty("percentNonlin")
	@JsonPropertyDescription("PercentNonlin")
	private String percentNonlin = null;

	@JsonProperty("a_ref")
	@JsonPropertyDescription("a_ref")
	private String a_ref = null;

	@JsonProperty("I_o_ref")
	@JsonPropertyDescription("I_o_ref")
	private String I_o_ref = null;

	@JsonProperty("I_L_ref")
	@JsonPropertyDescription("I_L_ref")
	private String I_L_ref = null;

	@JsonProperty("R_s_ref")
	@JsonPropertyDescription("R_s_ref")
	private String R_s_ref = null;

	@JsonProperty("R_sh_ref")
	@JsonPropertyDescription("R_sh_ref")
	private String R_sh_ref = null;

	@JsonProperty("delta")
	@JsonPropertyDescription("delta")
	private String delta = null;

	@JsonProperty("I_sc_adj")
	@JsonPropertyDescription("I_sc_adj")
	private String I_sc_adj = null;

	@JsonProperty("time")
	@JsonPropertyDescription("Time")
	private String time = null;

	@JsonProperty("version")
	@JsonPropertyDescription("Version")
	private String version = null;

	@JsonProperty("mounting")
	@JsonPropertyDescription("How the module is mounted")
	private String mounting = null;

	@JsonProperty("lastUpdate")
	@JsonPropertyDescription("Last update")
	private String lastUpdate = null;

	@JsonProperty("cecListingDate")
	@JsonPropertyDescription("Listing date with California Energy Commission")
	private String cecListingDate = null;

	public Module id(int id) {
		this.id = id;
		return this;
	}

	/**
	 * ID
	 * 
	 * @return
	 */
	@ApiModelProperty(value = "ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Module manufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}

	/**
	 * Manufacturer name
	 * 
	 * @return manufacturer
	 **/
	@ApiModelProperty(value = "Manufacturer name")

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Module modelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
		return this;
	}

	/**
	 * Manufacturer-assigned model number
	 * 
	 * @return modelNumber
	 **/
	@ApiModelProperty(value = "Manufacturer-assigned model number")

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public Module description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Manufacturer's description
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Manufacturer's description")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Module BIPV(String BIPV) {
		this.BIPV = BIPV;
		return this;
	}

	/**
	 * Building Integrated PV
	 * 
	 * @return BIPV
	 **/
	@ApiModelProperty(value = "Building Integrated PV")

	public String getBIPV() {
		return BIPV;
	}

	public void setBIPV(String BIPV) {
		this.BIPV = BIPV;
	}

	public Module nameplatePmax(Double nameplatePmax) {
		this.nameplatePmax = nameplatePmax;
		return this;
	}

	/**
	 * Pmax
	 * 
	 * @return nameplatePmax
	 **/
	@ApiModelProperty(value = "Maximum power at standard test conditions")

	public Double getNameplatePmax() {
		return nameplatePmax;
	}

	public void setNameplatePmax(Double nameplatePmax) {
		this.nameplatePmax = nameplatePmax;
	}

	public Module PTC(Double PTC) {
		this.PTC = PTC;
		return this;
	}

	/**
	 * PVUSA Test Conditions, which were developed to test and compare PV systems as
	 * part of the PVUSA (Photovoltaics for Utility Scale Applications) project. PTC
	 * are 1,000 Watts per square meter solar irradiance, 20 degrees C air
	 * temperature, and wind speed of 1 meter per second at 10 meters above ground
	 * level. PV manufacturers use Standard Test Conditions, or STC, to rate their
	 * PV products. STC are 1,000 Watts per square meter solar irradiance, 25
	 * degrees C cell temperature, air mass equal to 1.5, and ASTM G173-03 standard
	 * spectrum. The PTC rating, which is lower than the STC rating, is generally
	 * recognized as a more realistic measure of PV output because the test
	 * conditions better reflect \"real-world\" solar and climatic conditions,
	 * compared to the STC rating. All ratings in the list are DC (direct current)
	 * watts.
	 * 
	 * @return PTC
	 **/
	@ApiModelProperty(value = "Power value at PV USA Test Conditionss. This value is automatically calculated based on Ac, Pmax, "
			+ "NOCT and γpmax. The test conditions are 1,000 watts per square meter solar irradiance, 20 degrees "
			+ "Celsius air temperature, and 1 meter per second wind speed at 10 meters above ground level")

	public Double getPTC() {
		return PTC;
	}

	public void setPTC(Double PTC) {
		this.PTC = PTC;
	}

	public Module notes(String notes) {
		this.notes = notes;
		return this;
	}

	/**
	 * Manufacturer's notes
	 * 
	 * @return notes
	 **/
	@ApiModelProperty(value = "Manufacturer's notes")

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Module nameplateVpmax(Double nameplateVpmax) {
		this.nameplateVpmax = nameplateVpmax;
		return this;
	}

	/**
	 * Voltage at Maximum Power (Vpmax)
	 * 
	 * @return nameplateVpmax
	 **/
	@ApiModelProperty(value = "Voltage at Maximum Power (Vpmax)")

	public Double getNameplateVpmax() {
		return nameplateVpmax;
	}

	public void setNameplateVpmax(Double nameplateVpmax) {
		this.nameplateVpmax = nameplateVpmax;
	}

	public Module nameplateIpmax(Double nameplateIpmax) {
		this.nameplateIpmax = nameplateIpmax;
		return this;
	}

	/**
	 * Current at Maximum Power (Ip max)
	 * 
	 * @return nameplateIpmax
	 **/
	@ApiModelProperty(value = "Current at Maximum Power (Ip max)")

	public Double getNameplateIpmax() {
		return nameplateIpmax;
	}

	public void setNameplateIpmax(Double nameplateIpmax) {
		this.nameplateIpmax = nameplateIpmax;
	}

	public Module nameplateVoc(Double nameplateVoc) {
		this.nameplateVoc = nameplateVoc;
		return this;
	}

	/**
	 * Open Circuit Voltage (Voc)
	 * 
	 * @return nameplateVoc
	 **/
	@ApiModelProperty(value = "Open Circuit Voltage (Voc)")

	public Double getNameplateVoc() {
		return nameplateVoc;
	}

	public void setNameplateVoc(Double nameplateVoc) {
		this.nameplateVoc = nameplateVoc;
	}

	public Module nameplateIsc(Double nameplateIsc) {
		this.nameplateIsc = nameplateIsc;
		return this;
	}

	/**
	 * Short Circuit Current (Isc)
	 * 
	 * @return nameplateIsc
	 **/
	@ApiModelProperty(value = "Short Circuit Current (Isc)")

	public Double getNameplateIsc() {
		return nameplateIsc;
	}

	public void setNameplateIsc(Double nameplateIsc) {
		this.nameplateIsc = nameplateIsc;
	}

	public Module averageNOCT(Double averageNOCT) {
		this.averageNOCT = averageNOCT;
		return this;
	}

	/**
	 * Nominal Operating Cell Temperature. The temperature reached by open circuited
	 * cells in a PV module under the following conditions: 800 watts per square
	 * meter irradiance on cell surface, 20 degrees Celsius air temperature, 1 meter
	 * per second wind velocity, and open back side mounting
	 * 
	 * @return averageNOCT
	 **/
	@ApiModelProperty(value = "Nominal Operating Cell Temperature. The temperature reached by open circuited cells in a PV "
			+ "module under the following conditions: 800 watts per square meter irradiance on cell surface, 20 "
			+ "degrees Celsius air temperature, 1 meter per second wind velocity, and open back side mounting")

	public Double getAverageNOCT() {
		return averageNOCT;
	}

	public void setAverageNOCT(Double averageNOCT) {
		this.averageNOCT = averageNOCT;
	}

	public Module betaVoc(Double betaVoc) {
		this.betaVoc = betaVoc;
		return this;
	}

	/**
	 * Temperature Coefficient of Open Circuit Voltage, percent per degrees Celsius
	 * (β Voc)
	 * 
	 * @return betaVoc
	 **/
	@ApiModelProperty(value = "Temperature Coefficient of Open Circuit Voltage, percent per degrees Celsius (β Voc)")

	public Double getBetaVoc() {
		return betaVoc;
	}

	public void setBetaVoc(Double betaVoc) {
		this.betaVoc = betaVoc;
	}

	public Module betaVpmax(Double betaVpmax) {
		this.betaVpmax = betaVpmax;
		return this;
	}

	/**
	 * Temperature Coefficient of Voltage at Maximum Power, percent per degrees
	 * Celsius (β Vp max)
	 * 
	 * @return betaVpmax
	 **/
	@ApiModelProperty(value = "Temperature Coefficient of Voltage at Maximum Power, percent per degrees Celsius (β Vp max)")

	public Double getBetaVpmax() {
		return betaVpmax;
	}

	public void setBetaVpmax(Double betaVpmax) {
		this.betaVpmax = betaVpmax;
	}

	public Module alphaIsc(Double alphaIsc) {
		this.alphaIsc = alphaIsc;
		return this;
	}

	/**
	 * Temperature Coefficient of Short Circuit Current, percent per degrees Celsius
	 * (α Isc)
	 * 
	 * @return alphaIsc
	 **/
	@ApiModelProperty(value = "Temperature Coefficient of Short Circuit Current, percent per degrees Celsius (α Isc)")

	public Double getAlphaIsc() {
		return alphaIsc;
	}

	public void setAlphaIsc(Double alphaIsc) {
		this.alphaIsc = alphaIsc;
	}

	public Module alphaIpmax(Double alphaIpmax) {
		this.alphaIpmax = alphaIpmax;
		return this;
	}

	/**
	 * Temperature Coefficient of Current at Maximum Power, percent per degrees
	 * Celsius (α Ip max)
	 * 
	 * @return alphaIpmax
	 **/
	@ApiModelProperty(value = "Temperature Coefficient of Current at Maximum Power, percent per degrees Celsius (α Ip max)")

	public Double getAlphaIpmax() {
		return alphaIpmax;
	}

	public void setAlphaIpmax(Double alphaIpmax) {
		this.alphaIpmax = alphaIpmax;
	}

	public Module gammaPmax(Double gammaPmax) {
		this.gammaPmax = gammaPmax;
		return this;
	}

	/**
	 * Temperature Coefficient of Maximum Power, percent per degrees Celsius (γ
	 * Pmax)
	 * 
	 * @return gammaPmax
	 **/
	@ApiModelProperty(value = "Temperature Coefficient of Maximum Power, percent per degrees Celsius (γ Pmax)")

	public Double getGammaPmax() {
		return gammaPmax;
	}

	public void setGammaPmax(Double gammaPmax) {
		this.gammaPmax = gammaPmax;
	}

	public Module vpmaxlow(Double vpmaxlow) {
		this.vpmaxlow = vpmaxlow;
		return this;
	}

	/**
	 * Voltage at Maximum Power and Low Irradiance (V Pmax, low)
	 * 
	 * @return vpmaxlow
	 **/
	@ApiModelProperty(value = "Voltage at Maximum Power and Low Irradiance (V Pmax, low)")

	public Double getVpmaxlow() {
		return vpmaxlow;
	}

	public void setVpmaxlow(Double vpmaxlow) {
		this.vpmaxlow = vpmaxlow;
	}

	public Module ipmaxlow(Double ipmaxlow) {
		this.ipmaxlow = ipmaxlow;
		return this;
	}

	/**
	 * Current at Maximum Power and Low Irradiance (I Pmax, low)
	 * 
	 * @return ipmaxlow
	 **/
	@ApiModelProperty(value = "Current at Maximum Power and Low Irradiance (I Pmax, low)")

	public Double getIpmaxlow() {
		return ipmaxlow;
	}

	public void setIpmaxlow(Double ipmaxlow) {
		this.ipmaxlow = ipmaxlow;
	}

	public Module vpmaxNOCT(Double vpmaxNOCT) {
		this.vpmaxNOCT = vpmaxNOCT;
		return this;
	}

	/**
	 * Voltage at Maximum Power and NOCT. (V Pmax, NOCT)
	 * 
	 * @return vpmaxNOCT
	 **/
	@ApiModelProperty(value = "Voltage at Maximum Power and NOCT. (V Pmax, NOCT)")

	public Double getVpmaxNOCT() {
		return vpmaxNOCT;
	}

	public void setVpmaxNOCT(Double vpmaxNOCT) {
		this.vpmaxNOCT = vpmaxNOCT;
	}

	public Module ipmaxNOCT(Double ipmaxNOCT) {
		this.ipmaxNOCT = ipmaxNOCT;
		return this;
	}

	/**
	 * Current at Maximum Power and NOCT (I Pmax, NOCT)
	 * 
	 * @return ipmaxNOCT
	 **/
	@ApiModelProperty(value = "Current at Maximum Power and NOCT (I Pmax, NOCT)")

	public Double getIpmaxNOCT() {
		return ipmaxNOCT;
	}

	public void setIpmaxNOCT(Double ipmaxNOCT) {
		this.ipmaxNOCT = ipmaxNOCT;
	}

	public Module shortSide(Double shortSide) {
		this.shortSide = shortSide;
		return this;
	}

	/**
	 * Size on short side, in Meters
	 * 
	 * @return shortSide
	 **/
	@ApiModelProperty(value = "Size on short side, in Meters")

	public Double getShortSide() {
		return shortSide;
	}

	public void setShortSide(Double shortSide) {
		this.shortSide = shortSide;
	}

	public Module longSide(Double longSide) {
		this.longSide = longSide;
		return this;
	}

	/**
	 * Size on long side, in Meters
	 * 
	 * @return longSide
	 **/
	@ApiModelProperty(value = "Size on long side, in Meters")

	public Double getLongSide() {
		return longSide;
	}

	public void setLongSide(Double longSide) {
		this.longSide = longSide;
	}

	public Module geometricMultiplier(Double geometricMultiplier) {
		this.geometricMultiplier = geometricMultiplier;
		return this;
	}

	/**
	 * Geometric Multiplier
	 * 
	 * @return geometricMultiplier
	 **/
	@ApiModelProperty(value = "Geometric Multiplier")

	public Double getGeometricMultiplier() {
		return geometricMultiplier;
	}

	public void setGeometricMultiplier(Double geometricMultiplier) {
		this.geometricMultiplier = geometricMultiplier;
	}

	public Module apertureArea(Double ApertureArea) {
		this.ApertureArea = ApertureArea;
		return this;
	}

	/**
	 * Aperture Area (A_c)
	 * 
	 * @return ApertureArea
	 **/
	@ApiModelProperty(value = "Aperture Area (A_c)")

	public Double getApertureArea() {
		return ApertureArea;
	}

	public void setApertureArea(Double ApertureArea) {
		this.ApertureArea = ApertureArea;
	}

	public Module numberCellsSeries(Double NumberCellsSeries) {
		this.NumberCellsSeries = NumberCellsSeries;
		return this;
	}

	/**
	 * Number cells in series
	 * 
	 * @return NumberCellsSeries
	 **/
	@ApiModelProperty(value = "Number cells in series")

	public Double getNumberCellsSeries() {
		return NumberCellsSeries;
	}

	public void setNumberCellsSeries(Double NumberCellsSeries) {
		this.NumberCellsSeries = NumberCellsSeries;
	}

	public Module numberCellsParallel(Double NumberCellsParallel) {
		this.NumberCellsParallel = NumberCellsParallel;
		return this;
	}

	/**
	 * Number of Cells in Parallel
	 * 
	 * @return NumberCellsParallel
	 **/
	@ApiModelProperty(value = "Number of Cells in Parallel")

	public Double getNumberCellsParallel() {
		return NumberCellsParallel;
	}

	public void setNumberCellsParallel(Double NumberCellsParallel) {
		this.NumberCellsParallel = NumberCellsParallel;
	}

	public Module type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Module type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "Module type")

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Module family(String family) {
		this.family = family;
		return this;
	}

	/**
	 * Cell Technology family
	 * 
	 * @return technology
	 **/
	@ApiModelProperty(value = "Cell Technology family")

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public Module technology(String technology) {
		this.technology = technology;
		return this;
	}

	/**
	 * Cell Technology type
	 * 
	 * @return technology
	 **/
	@ApiModelProperty(value = "Cell Technology type")

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Module p2pref(String p2pref) {
		this.p2pref = p2pref;
		return this;
	}

	public String getP2pref() {
		return p2pref;
	}

	public void setP2pref(String p2pref) {
		this.p2pref = p2pref;
	}

	public Module percentNonlin(String percentNonlin) {
		this.percentNonlin = percentNonlin;
		return this;
	}

	public String getPercentNonlin() {
		return percentNonlin;
	}

	public void setPercentNonlin(String percentNonlin) {
		this.percentNonlin = percentNonlin;
	}

	public Module a_ref(String a_ref) {
		this.a_ref = a_ref;
		return this;
	}

	public String getA_ref() {
		return a_ref;
	}

	public void setA_ref(String a_ref) {
		this.a_ref = a_ref;
	}

	public Module I_o_ref(String I_o_ref) {
		this.I_o_ref = I_o_ref;
		return this;
	}

	public String getI_o_ref() {
		return I_o_ref;
	}

	public void setI_o_ref(String i_o_ref) {
		I_o_ref = i_o_ref;
	}

	public Module I_L_ref(String I_L_ref) {
		this.I_L_ref = I_L_ref;
		return this;
	}

	public String getI_L_ref() {
		return I_L_ref;
	}

	public void setI_L_ref(String i_L_ref) {
		I_L_ref = i_L_ref;
	}

	public Module R_s_ref(String R_s_ref) {
		this.R_s_ref = R_s_ref;
		return this;
	}

	public String getR_s_ref() {
		return R_s_ref;
	}

	public void setR_s_ref(String r_s_ref) {
		R_s_ref = r_s_ref;
	}

	public Module R_sh_ref(String R_sh_ref) {
		this.R_sh_ref = R_sh_ref;
		return this;
	}

	public String getR_sh_ref() {
		return R_sh_ref;
	}

	public void setR_sh_ref(String r_sh_ref) {
		R_sh_ref = r_sh_ref;
	}

	public Module delta(String delta) {
		this.delta = delta;
		return this;
	}

	public String getDelta() {
		return delta;
	}

	public void setDelta(String delta) {
		this.delta = delta;
	}

	public String getI_sc_adj() {
		return I_sc_adj;
	}

	public Module I_sc_adj(String I_sc_adj) {
		this.I_sc_adj = I_sc_adj;
		return this;
	}

	public void setI_sc_adj(String i_sc_adj) {
		I_sc_adj = i_sc_adj;
	}

	public Module time(String time) {
		this.time = time;
		return this;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Module version(String version) {
		this.version = version;
		return this;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Module mounting(String mounting) {
		this.mounting = mounting;
		return this;
	}

	/**
	 * How the module is mounted
	 * 
	 * @return mounting
	 **/
	@ApiModelProperty(value = "How the module is mounted")

	public String getMounting() {
		return mounting;
	}

	public void setMounting(String mounting) {
		this.mounting = mounting;
	}

	public Module lastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
		return this;
	}

	/**
	 * Last update
	 * 
	 * @return lastUpdate
	 **/
	@ApiModelProperty(value = "Last update")

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Module cecListingDate(String cecListingDate) {
		this.cecListingDate = cecListingDate;
		return this;
	}

	/**
	 * Listing date with California Energy Commission
	 * 
	 * @return cecListingDate
	 **/
	@ApiModelProperty(value = "Listing date with California Energy Commission")

	public String getCecListingDate() {
		return cecListingDate;
	}

	public void setCecListingDate(String cecListingDate) {
		this.cecListingDate = cecListingDate;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Module module = (Module) o;
		return Objects.equals(this.id, module.id) && Objects.equals(this.manufacturer, module.manufacturer)
				&& Objects.equals(this.modelNumber, module.modelNumber)
				&& Objects.equals(this.description, module.description) && Objects.equals(this.BIPV, module.BIPV)
				&& Objects.equals(this.nameplatePmax, module.nameplatePmax) && Objects.equals(this.PTC, module.PTC)
				&& Objects.equals(this.notes, module.notes)
				&& Objects.equals(this.nameplateVpmax, module.nameplateVpmax)
				&& Objects.equals(this.nameplateIpmax, module.nameplateIpmax)
				&& Objects.equals(this.nameplateVoc, module.nameplateVoc)
				&& Objects.equals(this.nameplateIsc, module.nameplateIsc)
				&& Objects.equals(this.averageNOCT, module.averageNOCT) && Objects.equals(this.betaVoc, module.betaVoc)
				&& Objects.equals(this.betaVpmax, module.betaVpmax) && Objects.equals(this.alphaIsc, module.alphaIsc)
				&& Objects.equals(this.alphaIpmax, module.alphaIpmax)
				&& Objects.equals(this.gammaPmax, module.gammaPmax) && Objects.equals(this.vpmaxlow, module.vpmaxlow)
				&& Objects.equals(this.ipmaxlow, module.ipmaxlow) && Objects.equals(this.vpmaxNOCT, module.vpmaxNOCT)
				&& Objects.equals(this.ipmaxNOCT, module.ipmaxNOCT) && Objects.equals(this.shortSide, module.shortSide)
				&& Objects.equals(this.longSide, module.longSide)
				&& Objects.equals(this.geometricMultiplier, module.geometricMultiplier)
				&& Objects.equals(this.ApertureArea, module.ApertureArea)
				&& Objects.equals(this.NumberCellsSeries, module.NumberCellsSeries)
				&& Objects.equals(this.NumberCellsParallel, module.NumberCellsParallel)
				&& Objects.equals(this.type, module.type) && Objects.equals(this.family, module.family)
				&& Objects.equals(this.technology, module.technology) && Objects.equals(this.mounting, module.mounting)
				&& Objects.equals(this.lastUpdate, module.lastUpdate)
				&& Objects.equals(this.cecListingDate, module.cecListingDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, manufacturer, modelNumber, description, BIPV, nameplatePmax, PTC, notes, nameplateVpmax,
				nameplateIpmax, nameplateVoc, nameplateIsc, averageNOCT, betaVoc, betaVpmax, alphaIsc, alphaIpmax,
				gammaPmax, vpmaxlow, ipmaxlow, vpmaxNOCT, ipmaxNOCT, shortSide, longSide, geometricMultiplier,
				ApertureArea, NumberCellsSeries, NumberCellsParallel, type, family, technology, mounting, lastUpdate,
				cecListingDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Module {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
		sb.append("    modelNumber: ").append(toIndentedString(modelNumber)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    BIPV: ").append(toIndentedString(BIPV)).append("\n");
		sb.append("    nameplatePmax: ").append(toIndentedString(nameplatePmax)).append("\n");
		sb.append("    PTC: ").append(toIndentedString(PTC)).append("\n");
		sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
		sb.append("    nameplateVpmax: ").append(toIndentedString(nameplateVpmax)).append("\n");
		sb.append("    nameplateIpmax: ").append(toIndentedString(nameplateIpmax)).append("\n");
		sb.append("    nameplateVoc: ").append(toIndentedString(nameplateVoc)).append("\n");
		sb.append("    nameplateIsc: ").append(toIndentedString(nameplateIsc)).append("\n");
		sb.append("    averageNOCT: ").append(toIndentedString(averageNOCT)).append("\n");
		sb.append("    betaVoc: ").append(toIndentedString(betaVoc)).append("\n");
		sb.append("    betaVpmax: ").append(toIndentedString(betaVpmax)).append("\n");
		sb.append("    alphaIsc: ").append(toIndentedString(alphaIsc)).append("\n");
		sb.append("    alphaIpmax: ").append(toIndentedString(alphaIpmax)).append("\n");
		sb.append("    gammaPmax: ").append(toIndentedString(gammaPmax)).append("\n");
		sb.append("    vpmaxlow: ").append(toIndentedString(vpmaxlow)).append("\n");
		sb.append("    ipmaxlow: ").append(toIndentedString(ipmaxlow)).append("\n");
		sb.append("    vpmaxNOCT: ").append(toIndentedString(vpmaxNOCT)).append("\n");
		sb.append("    ipmaxNOCT: ").append(toIndentedString(ipmaxNOCT)).append("\n");
		sb.append("    shortSide: ").append(toIndentedString(shortSide)).append("\n");
		sb.append("    longSide: ").append(toIndentedString(longSide)).append("\n");
		sb.append("    geometricMultiplier: ").append(toIndentedString(geometricMultiplier)).append("\n");
		sb.append("    ApertureArea: ").append(toIndentedString(ApertureArea)).append("\n");
		sb.append("    NumberCellsSeries: ").append(toIndentedString(NumberCellsSeries)).append("\n");
		sb.append("    NumberCellsParallel: ").append(toIndentedString(NumberCellsParallel)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    family: ").append(toIndentedString(family)).append("\n");
		sb.append("    technology: ").append(toIndentedString(technology)).append("\n");
		sb.append("    mounting: ").append(toIndentedString(mounting)).append("\n");
		sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
		sb.append("    cecListingDate: ").append(toIndentedString(cecListingDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
