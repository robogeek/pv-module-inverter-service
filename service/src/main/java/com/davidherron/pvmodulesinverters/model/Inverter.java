package com.davidherron.pvmodulesinverters.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Inverter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-25T02:09:48.524Z")
@ApiModel(description="Information model for Solar Inverters")
public class Inverter   {

  @Id
  // @GeneratedValue
  int id;
		
  @JsonProperty("manufacturerName")
  @JsonPropertyDescription("Manufacturer name")
  private String manufacturerName = null;

  @JsonProperty("modelNumber")
  @JsonPropertyDescription("Manufacturer-assigned model number")
  private String modelNumber = null;

  @JsonProperty("description")
  @JsonPropertyDescription("Manufacturer's description")
  private String description = null;

  @JsonProperty("powerRating")
  @JsonPropertyDescription("Power Rating, Continuous at Unity Power Factor (kW)")
  private Double powerRating = null;

  @JsonProperty("nominalVoltage")
  @JsonPropertyDescription("Nominal Voltage (Vac)")
  private String nominalVoltage = null;

  @JsonProperty("weightedEfficiency")
  @JsonPropertyDescription("Weighted Efficiency (%)")
  private Double weightedEfficiency = null;

  @JsonProperty("UL1741SA")
  @JsonPropertyDescription("UL 1741 Supplement A Certification*** (Certification Date)")
  private String ul1741SA = null;

  @JsonProperty("firmwareVersionTested")
  @JsonPropertyDescription("Firmware Version Tested")
  private String firmwareVersionTested = null;

  @JsonProperty("builtInMeter")
  @JsonPropertyDescription("")
  private String builtInMeter = null;

  @JsonProperty("microInverter")
  @JsonPropertyDescription("Built-In Meter")
  private String microInverter = null;

  @JsonProperty("notes")
  @JsonPropertyDescription("Manufacturer's notes")
  private String notes = null;

  @JsonProperty("nightTareLoss")
  @JsonPropertyDescription("Night Tare Loss (W)")
  private Double nightTareLoss = null;

  @JsonProperty("powerRatingContinuous40degC")
  @JsonPropertyDescription("Power Rating, Continuous, 40 deg C (kW)")
  private Double powerRatingContinuous40degC = null;

  @JsonProperty("nightTareLoss40degC")
  @JsonPropertyDescription("Night Tare Loss 40 deg C (W)")
  private Double nightTareLoss40degC = null;

  @JsonProperty("voltageMinDC")
  @JsonPropertyDescription("Voltage Minimum (Vdc)")
  private Double voltageMinDC = null;

  @JsonProperty("voltageNominalDC")
  @JsonPropertyDescription("Voltage Nominal (Vdc)")
  private Double voltageNominalDC = null;

  @JsonProperty("voltageMaxDC")
  @JsonPropertyDescription("Voltage Maximum (Vdc)")
  private Double voltageMaxDC = null;

  @JsonProperty("powerLevel10")
  @JsonPropertyDescription("Power Level 10% (kW)")
  private Double powerLevel10 = null;

  @JsonProperty("powerLevel20")
  @JsonPropertyDescription("Power Level 20% (kW)")
  private Double powerLevel20 = null;

  @JsonProperty("powerLevel30")
  @JsonPropertyDescription("Power Level 30% (kW)")
  private Double powerLevel30 = null;

  @JsonProperty("powerLevel50")
  @JsonPropertyDescription("Power Level 50% (kW)")
  private Double powerLevel50 = null;

  @JsonProperty("powerLevel75")
  @JsonPropertyDescription("Power Level 75% (kW)")
  private Double powerLevel75 = null;

  @JsonProperty("powerLevel100")
  @JsonPropertyDescription("Power Level 100% (kW)")
  private Double powerLevel100 = null;

  @JsonProperty("efficiencyVmin10")
  @JsonPropertyDescription("Efficiency @Vmin, 10% (%)")
  private Double efficiencyVmin10 = null;

  @JsonProperty("efficiencyVmin20")
  @JsonPropertyDescription("Efficiency @Vmin, 20% (%)")
  private Double efficiencyVmin20 = null;

  @JsonProperty("efficiencyVmin30")
  @JsonPropertyDescription("Efficiency @Vmin, 30% (%)")
  private Double efficiencyVmin30 = null;

  @JsonProperty("efficiencyVmin50")
  @JsonPropertyDescription("Efficiency @Vmin, 50% (%)")
  private Double efficiencyVmin50 = null;

  @JsonProperty("efficiencyVmin75")
  @JsonPropertyDescription("Efficiency @Vmin, 75% (%)")
  private Double efficiencyVmin75 = null;

  @JsonProperty("efficiencyVmin100")
  @JsonPropertyDescription("Efficiency @Vmin, 100% (%)")
  private Double efficiencyVmin100 = null;

  @JsonProperty("efficiencyVmin")
  @JsonPropertyDescription("Efficiency @Vmin")
  private Double efficiencyVmin = null;

  @JsonProperty("efficiencyVnom10")
  @JsonPropertyDescription("Efficiency @Vnom, 10% (%)")
  private Double efficiencyVnom10 = null;

  @JsonProperty("efficiencyVnom20")
  @JsonPropertyDescription("Efficiency @Vnom, 20% (%)")
  private Double efficiencyVnom20 = null;

  @JsonProperty("efficiencyVnom30")
  @JsonPropertyDescription("Efficiency @Vnom, 30% (%)")
  private Double efficiencyVnom30 = null;

  @JsonProperty("efficiencyVnom50")
  @JsonPropertyDescription("Efficiency @Vnom, 50% (%)")
  private Double efficiencyVnom50 = null;

  @JsonProperty("efficiencyVnom75")
  @JsonPropertyDescription("Efficiency @Vnom, 75% (%)")
  private Double efficiencyVnom75 = null;

  @JsonProperty("efficiencyVnom100")
  @JsonPropertyDescription("Efficiency @Vnom, 100% (%)")
  private Double efficiencyVnom100 = null;

  @JsonProperty("efficiencyVnom")
  @JsonPropertyDescription("Efficiency @Vnom")
  private Double efficiencyVnom = null;

  @JsonProperty("efficiencyVmax10")
  @JsonPropertyDescription("Efficiency @Vmax, 10% (%)")
  private Double efficiencyVmax10 = null;

  @JsonProperty("efficiencyVmax20")
  @JsonPropertyDescription("Efficiency @Vmax, 20% (%)")
  private Double efficiencyVmax20 = null;

  @JsonProperty("efficiencyVmax30")
  @JsonPropertyDescription("Efficiency @Vmax, 30% (%)")
  private Double efficiencyVmax30 = null;

  @JsonProperty("efficiencyVmax50")
  @JsonPropertyDescription("Efficiency @Vmax, 50% (%)")
  private Double efficiencyVmax50 = null;

  
  @JsonProperty("efficiencyVmax75")
  @JsonPropertyDescription("Efficiency @Vmax, 75% (%)")
  private Double efficiencyVmax75 = null;

  @JsonProperty("efficiencyVmax100")
  @JsonPropertyDescription("Efficiency @Vmax, 100% (%)")
  private Double efficiencyVmax100 = null;

  @JsonProperty("efficiencyVmax")
  @JsonPropertyDescription("Efficiency @Vmax")
  private Double efficiencyVmax = null;

  @JsonProperty("sortOrder")
  @JsonPropertyDescription("Sort order")
  private String sortOrder = null;

  @JsonProperty("cecListingDate")
  @JsonPropertyDescription("Listing date with California Energy Commission")
  private String cecListingDate = null;

  @JsonProperty("lastUpdate")
  @JsonPropertyDescription("Last update")
  private String lastUpdate = null;

  public Inverter id(int id) {
    this.id = id;
    return this;
  }

  /**
   * ID
   * @return
   */
  @ApiModelProperty(value = "ID")
  public int getId() {
	return id;
  }

  public void setId(int id) {
	this.id = id;
  }

  public Inverter manufacturerName(String manufacturerName) {
    this.manufacturerName = manufacturerName;
    return this;
  }

   /**
   * Manufacturer name
   * @return manufacturer
  **/
  @ApiModelProperty(value = "Manufacturer name")


  public String getManufacturerName() {
    return manufacturerName;
  }

  public void setManufacturerName(String manufacturerName) {
    this.manufacturerName = manufacturerName;
  }

  public Inverter modelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
    return this;
  }

   /**
   * Manufacturer-assigned model number
   * @return model
  **/
  @ApiModelProperty(value = "Manufacturer-assigned model number")


  public String getModelNumber() {
    return modelNumber;
  }

  public void setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
  }

  public Inverter description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Manufacturer's description
   * @return description
  **/
  @ApiModelProperty(value = "Manufacturer's description")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Inverter powerRating(Double powerRating) {
    this.powerRating = powerRating;
    return this;
  }

   /**
   * Power Rating, Continuous at Unity Power Factor (kW)
   * @return powerRating
  **/
  @ApiModelProperty(value = "Power Rating, Continuous at Unity Power Factor (kW)")


  public Double getPowerRating() {
    return powerRating;
  }

  public void setPowerRating(Double powerRating) {
    this.powerRating = powerRating;
  }

  public Inverter nominalVoltage(String nominalVoltage) {
    this.nominalVoltage = nominalVoltage;
    return this;
  }

   /**
   * Nominal Voltage (Vac)
   * @return nominalVoltage
  **/
  @ApiModelProperty(value = "Nominal Voltage (Vac)")


  public String getNominalVoltage() {
    return nominalVoltage;
  }

  public void setNominalVoltage(String nominalVoltage) {
    this.nominalVoltage = nominalVoltage;
  }

  /* public void setVoltageNominal(String voltageNominalAC) { // alias
    this.voltageNominalAC = voltageNominalAC;
  } */

  public Inverter weightedEfficiency(Double weightedEfficiency) {
    this.weightedEfficiency = weightedEfficiency;
    return this;
  }

   /**
   * Weighted Efficiency (%)
   * @return efficiency
  **/
  @ApiModelProperty(value = "Weighted Efficiency (%)")


  public Double getWeightedEfficiency() {
    return weightedEfficiency;
  }

  public void setWeightedEfficiency(Double efficiency) {
    this.weightedEfficiency = efficiency;
  }

  public Inverter ul1741SA(String ul1741SA) {
    this.ul1741SA = ul1741SA;
    return this;
  }

   /**
   * UL 1741 Supplement A Certification*** (Certification Date)
   * @return ul1741SA
  **/
  @ApiModelProperty(value = "UL 1741 Supplement A Certification*** (Certification Date)")


  public String getUl1741SA() {
    return ul1741SA;
  }

  public void setUl1741SA(String ul1741SA) {
    this.ul1741SA = ul1741SA;
  }

  public void setUL1741SupplementACertification(String ul1741SA) { // alias
    this.ul1741SA = ul1741SA;
  }

  public Inverter firmwareVersionTested(String firmwareVersionTested) {
    this.firmwareVersionTested = firmwareVersionTested;
    return this;
  }

   /**
   * Firmware Version Tested
   * @return firmwareVersionTested
  **/
  @ApiModelProperty(value = "Firmware Version Tested")


  public String getFirmwareVersionTested() {
    return firmwareVersionTested;
  }

  public void setFirmwareVersionTested(String firmwareVersionTested) {
    this.firmwareVersionTested = firmwareVersionTested;
  }

  public Inverter builtInMeter(String builtInMeter) {
    this.builtInMeter = builtInMeter;
    return this;
  }

   /**
   * Built-In Meter
   * @return builtInMeter
  **/
  @ApiModelProperty(value = "Built-In Meter")


  public String getBuiltInMeter() {
    return builtInMeter;
  }

  public void setBuiltInMeter(String builtInMeter) {
    this.builtInMeter = builtInMeter;
  }

  public Inverter microInverter(String microInverter) {
    this.microInverter = microInverter;
    return this;
  }

   /**
   * Microinverter
   * @return microInverter
  **/
  @ApiModelProperty(value = "Microinverter")


  public String getMicroInverter() {
    return microInverter;
  }

  public void setMicroInverter(String microInverter) {
    this.microInverter = microInverter;
  }

  public Inverter notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * notes
   * @return notes
  **/
  @ApiModelProperty(value = "notes")


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Inverter nightTareLoss(Double nightTareLoss) {
    this.nightTareLoss = nightTareLoss;
    return this;
  }

   /**
   * Night Tare Loss (W)
   * @return nightTareLoss
  **/
  @ApiModelProperty(value = "Night Tare Loss (W)")


  public Double getNightTareLoss() {
    return nightTareLoss;
  }

  public void setNightTareLoss(Double nightTareLoss) {
    this.nightTareLoss = nightTareLoss;
  }

  public Inverter powerRatingContinuous40degC(Double powerRatingContinuous40degC) {
    this.powerRatingContinuous40degC = powerRatingContinuous40degC;
    return this;
  }

   /**
   * Power Rating, Continuous, 40 deg C (kW)
   * @return powerRatingContinuous40degC
  **/
  @ApiModelProperty(value = "Power Rating, Continuous, 40 deg C (kW)")


  public Double getPowerRatingContinuous40degC() {
    return powerRatingContinuous40degC;
  }

  public void setPowerRatingContinuous40degC(Double powerRatingContinuous40degC) {
    this.powerRatingContinuous40degC = powerRatingContinuous40degC;
  }

  public void setPowerRatingContinuous(Double powerRatingContinuous40degC) { // alias
    this.powerRatingContinuous40degC = powerRatingContinuous40degC;
  }

  public Inverter nightTareLoss40degC(Double nightTareLoss40C) {
    this.nightTareLoss40degC = nightTareLoss40C;
    return this;
  }

   /**
   * Night Tare Loss 40 deg C (W)
   * @return nightTareLoss40degC
  **/
  @ApiModelProperty(value = "Night Tare Loss 40 deg C (W)")


  public Double getNightTareLoss40degC() {
    return nightTareLoss40degC;
  }

  public void setNightTareLoss40degC(Double nightTareLoss40degC) {
    this.nightTareLoss40degC = nightTareLoss40degC;
  }

  public void setNightTareLoss40C(Double nightTareLoss40degC) { // alias
    this.nightTareLoss40degC = nightTareLoss40degC;
  }

  public Inverter voltageMinDC(Double voltageMinDC) {
    this.voltageMinDC = voltageMinDC;
    return this;
  }

   /**
   * Voltage Minimum (Vdc)
   * @return voltageMinDC
  **/
  @ApiModelProperty(value = "Voltage Minimum (Vdc)")


  public Double getVoltageMinDC() {
    return voltageMinDC;
  }

  public void setVoltageMinDC(Double voltageMinDC) {
    this.voltageMinDC = voltageMinDC;
  }

  public void setVoltageMinimum(Double voltageMinDC) { // alias
    this.voltageMinDC = voltageMinDC;
  }

  public Inverter voltageNominalDC(Double voltageNominalDC) {
    this.voltageNominalDC = voltageNominalDC;
    return this;
  }

   /**
   * Voltage Nominal (Vdc)
   * @return voltageNominalDC
  **/
  @ApiModelProperty(value = "Voltage Nominal (Vdc)")


  public Double getVoltageNominalDC() {
    return voltageNominalDC;
  }

  public void setVoltageNominalDC(Double voltageNominalDC) {
    this.voltageNominalDC = voltageNominalDC;
  }

  public void setNominalVoltage(Double voltageNominalDC) { // alias
    this.voltageNominalDC = voltageNominalDC;
  }
  
  public void setVoltageNominal(Double voltageNominalDC) { // alias
	this.voltageNominalDC = voltageNominalDC;
  }
  
  public Inverter voltageMaxDC(Double voltageMaxDC) {
    this.voltageMaxDC = voltageMaxDC;
    return this;
  }

   /**
   * Voltage Maximum (Vdc)
   * @return voltageMaxDC
  **/
  @ApiModelProperty(value = "Voltage Maximum (Vdc)")


  public Double getVoltageMaxDC() {
    return voltageMaxDC;
  }

  public void setVoltageMaxDC(Double voltageMaxDC) {
    this.voltageMaxDC = voltageMaxDC;
  }

  public void setVoltageMaximum(Double voltageMaxDC) { // alias
    this.voltageMaxDC = voltageMaxDC;
  }

  public Inverter powerLevel10(Double powerLevel10) {
    this.powerLevel10 = powerLevel10;
    return this;
  }

   /**
   * Power Level 10% (kW)
   * @return powerLevel10
  **/
  @ApiModelProperty(value = "Power Level 10% (kW)")


  public Double getPowerLevel10() {
    return powerLevel10;
  }

  public void setPowerLevel10(Double powerLevel10) {
    this.powerLevel10 = powerLevel10;
  }

  public Inverter powerLevel20(Double powerLevel20) {
    this.powerLevel20 = powerLevel20;
    return this;
  }

   /**
   * Power Level 20% (kW)
   * @return powerLevel20
  **/
  @ApiModelProperty(value = "Power Level 20% (kW)")


  public Double getPowerLevel20() {
    return powerLevel20;
  }

  public void setPowerLevel20(Double powerLevel20) {
    this.powerLevel20 = powerLevel20;
  }

  public Inverter powerLevel30(Double powerLevel30) {
    this.powerLevel30 = powerLevel30;
    return this;
  }

  /**
   * Power Level 30% (kW)
   * @return powerLevel30
   **/
  @ApiModelProperty(value = "Power Level 30% (kW)")


  public Double getPowerLevel30() {
    return powerLevel30;
  }

  public void setPowerLevel30(Double powerLevel30) {
    this.powerLevel30 = powerLevel30;
  }

  public Inverter powerLevel50(Double powerLevel50) {
    this.powerLevel50 = powerLevel50;
    return this;
  }

   /**
   * Power Level 50% (kW)
   * @return powerLevel50
  **/
  @ApiModelProperty(value = "Power Level 50% (kW)")


  public Double getPowerLevel50() {
    return powerLevel50;
  }

  public void setPowerLevel50(Double powerLevel50) {
    this.powerLevel50 = powerLevel50;
  }

  public Inverter powerLevel75(Double powerLevel75) {
    this.powerLevel75 = powerLevel75;
    return this;
  }

   /**
   * Power Level 75% (kW)
   * @return powerLevel75
  **/
  @ApiModelProperty(value = "Power Level 75% (kW)")


  public Double getPowerLevel75() {
    return powerLevel75;
  }

  public void setPowerLevel75(Double powerLevel75) {
    this.powerLevel75 = powerLevel75;
  }

  public Inverter powerLevel100(Double powerLevel100) {
    this.powerLevel100 = powerLevel100;
    return this;
  }

   /**
   * Power Level 100% (kW)
   * @return powerLevel100
  **/
  @ApiModelProperty(value = "Power Level 100% (kW)")


  public Double getPowerLevel100() {
    return powerLevel100;
  }

  public void setPowerLevel100(Double powerLevel100) {
    this.powerLevel100 = powerLevel100;
  }

  public Inverter efficiencyVmin10(Double efficiencyVmin10) {
    this.efficiencyVmin10 = efficiencyVmin10;
    return this;
  }

   /**
   * Efficiency @Vmin, 10% (%)
   * @return efficiencyVmin10
  **/
  @ApiModelProperty(value = "Efficiency @Vmin, 10% (%)")


  public Double getEfficiencyVmin10() {
    return efficiencyVmin10;
  }

  public void setEfficiencyVmin10(Double efficiencyVmin10) {
    this.efficiencyVmin10 = efficiencyVmin10;
  }

  public Inverter efficiencyVmin20(Double efficiencyVmin20) {
    this.efficiencyVmin20 = efficiencyVmin20;
    return this;
  }

   /**
   * Efficiency @Vmin, 20% (%)
   * @return efficiencyVmin20
  **/
  @ApiModelProperty(value = "Efficiency @Vmin, 20% (%)")


  public Double getEfficiencyVmin20() {
    return efficiencyVmin20;
  }

  public void setEfficiencyVmin20(Double efficiencyVmin20) {
    this.efficiencyVmin20 = efficiencyVmin20;
  }

  public Inverter efficiencyVmin30(Double efficiencyVmin30) {
    this.efficiencyVmin30 = efficiencyVmin30;
    return this;
  }

   /**
   * Efficiency @Vmin, 30% (%)
   * @return efficiencyVmin30
  **/
  @ApiModelProperty(value = "Efficiency @Vmin, 30% (%)")


  public Double getEfficiencyVmin30() {
    return efficiencyVmin30;
  }

  public void setEfficiencyVmin30(Double efficiencyVmin30) {
    this.efficiencyVmin30 = efficiencyVmin30;
  }

  public Inverter efficiencyVmin50(Double efficiencyVmin50) {
    this.efficiencyVmin50 = efficiencyVmin50;
    return this;
  }

   /**
   * Efficiency @Vmin, 50% (%)
   * @return efficiencyVmin50
  **/
  @ApiModelProperty(value = "Efficiency @Vmin, 50% (%)")


  public Double getEfficiencyVmin50() {
    return efficiencyVmin50;
  }

  public void setEfficiencyVmin50(Double efficiencyVmin50) {
    this.efficiencyVmin50 = efficiencyVmin50;
  }

  public Inverter efficiencyVmin75(Double efficiencyVmin75) {
    this.efficiencyVmin75 = efficiencyVmin75;
    return this;
  }

   /**
   * Efficiency @Vmin, 75% (%)
   * @return efficiencyVmin75
  **/
  @ApiModelProperty(value = "Efficiency @Vmin, 75% (%)")


  public Double getEfficiencyVmin75() {
    return efficiencyVmin75;
  }

  public void setEfficiencyVmin75(Double efficiencyVmin75) {
    this.efficiencyVmin75 = efficiencyVmin75;
  }

  public Inverter efficiencyVmin100(Double efficiencyVmin100) {
    this.efficiencyVmin100 = efficiencyVmin100;
    return this;
  }

   /**
   * Efficiency @Vmin, 100% (%)
   * @return efficiencyVmin100
  **/
  @ApiModelProperty(value = "Efficiency @Vmin, 100% (%)")


  public Double getEfficiencyVmin100() {
    return efficiencyVmin100;
  }

  public void setEfficiencyVmin100(Double efficiencyVmin100) {
    this.efficiencyVmin100 = efficiencyVmin100;
  }

  public Inverter efficiencyVmin(Double efficiencyVmin) {
    this.efficiencyVmin = efficiencyVmin;
    return this;
  }

   /**
   * Efficiency @Vmin
   * @return efficiencyVmin
  **/
  @ApiModelProperty(value = "Efficiency @Vmin")


  public Double getEfficiencyVmin() {
    return efficiencyVmin;
  }

  public void setEfficiencyVmin(Double efficiencyVmin) {
    this.efficiencyVmin = efficiencyVmin;
  }

  public Inverter efficiencyVnom10(Double efficiencyVnom10) {
    this.efficiencyVnom10 = efficiencyVnom10;
    return this;
  }

   /**
   * Efficiency @Vnom, 10% (%)
   * @return efficiencyVnom10
  **/
  @ApiModelProperty(value = "Efficiency @Vnom, 10% (%)")


  public Double getEfficiencyVnom10() {
    return efficiencyVnom10;
  }

  public void setEfficiencyVnom10(Double efficiencyVnom10) {
    this.efficiencyVnom10 = efficiencyVnom10;
  }

  public Inverter efficiencyVnom20(Double efficiencyVnom20) {
    this.efficiencyVnom20 = efficiencyVnom20;
    return this;
  }

   /**
   * Efficiency @Vnom, 20% (%)
   * @return efficiencyVnom20
  **/
  @ApiModelProperty(value = "Efficiency @Vnom, 20% (%)")


  public Double getEfficiencyVnom20() {
    return efficiencyVnom20;
  }

  public void setEfficiencyVnom20(Double efficiencyVnom20) {
    this.efficiencyVnom20 = efficiencyVnom20;
  }

  public Inverter efficiencyVnom30(Double efficiencyVnom30) {
    this.efficiencyVnom30 = efficiencyVnom30;
    return this;
  }

   /**
   * Efficiency @Vnom, 30% (%)
   * @return efficiencyVnom30
  **/
  @ApiModelProperty(value = "Efficiency @Vnom, 30% (%)")


  public Double getEfficiencyVnom30() {
    return efficiencyVnom30;
  }

  public void setEfficiencyVnom30(Double efficiencyVnom30) {
    this.efficiencyVnom30 = efficiencyVnom30;
  }

  public Inverter efficiencyVnom50(Double efficiencyVnom50) {
    this.efficiencyVnom50 = efficiencyVnom50;
    return this;
  }

   /**
   * Efficiency @Vnom, 50% (%)
   * @return efficiencyVnom50
  **/
  @ApiModelProperty(value = "Efficiency @Vnom, 50% (%)")


  public Double getEfficiencyVnom50() {
    return efficiencyVnom50;
  }

  public void setEfficiencyVnom50(Double efficiencyVnom50) {
    this.efficiencyVnom50 = efficiencyVnom50;
  }

  public Inverter efficiencyVnom75(Double efficiencyVnom75) {
    this.efficiencyVnom75 = efficiencyVnom75;
    return this;
  }

   /**
   * Efficiency @Vnom, 75% (%)
   * @return efficiencyVnom75
  **/
  @ApiModelProperty(value = "Efficiency @Vnom, 75% (%)")


  public Double getEfficiencyVnom75() {
    return efficiencyVnom75;
  }

  public void setEfficiencyVnom75(Double efficiencyVnom75) {
    this.efficiencyVnom75 = efficiencyVnom75;
  }

  public Inverter efficiencyVnom100(Double efficiencyVnom100) {
    this.efficiencyVnom100 = efficiencyVnom100;
    return this;
  }

   /**
   * Efficiency @Vnom, 100% (%)
   * @return efficiencyVnom100
  **/
  @ApiModelProperty(value = "Efficiency @Vnom, 100% (%)")


  public Double getEfficiencyVnom100() {
    return efficiencyVnom100;
  }

  public void setEfficiencyVnom100(Double efficiencyVnom100) {
    this.efficiencyVnom100 = efficiencyVnom100;
  }

  public Inverter efficiencyVnom(Double efficiencyVnom) {
    this.efficiencyVnom = efficiencyVnom;
    return this;
  }

   /**
   * Efficiency @Vnom
   * @return efficiencyVnom
  **/
  @ApiModelProperty(value = "Efficiency @Vnom")


  public Double getEfficiencyVnom() {
    return efficiencyVnom;
  }

  public void setEfficiencyVnom(Double efficiencyVnom) {
    this.efficiencyVnom = efficiencyVnom;
  }

  public Inverter efficiencyVmax10(Double efficiencyVmax10) {
    this.efficiencyVmax10 = efficiencyVmax10;
    return this;
  }

   /**
   * Efficiency @Vmax, 10% (%)
   * @return efficiencyVmax10
  **/
  @ApiModelProperty(value = "Efficiency @Vmax, 10% (%)")


  public Double getEfficiencyVmax10() {
    return efficiencyVmax10;
  }

  public void setEfficiencyVmax10(Double efficiencyVmax10) {
    this.efficiencyVmax10 = efficiencyVmax10;
  }

  public Inverter efficiencyVmax20(Double efficiencyVmax20) {
    this.efficiencyVmax20 = efficiencyVmax20;
    return this;
  }

   /**
   * Efficiency @Vmax, 20% (%)
   * @return efficiencyVmax20
  **/
  @ApiModelProperty(value = "Efficiency @Vmax, 20% (%)")


  public Double getEfficiencyVmax20() {
    return efficiencyVmax20;
  }

  public void setEfficiencyVmax20(Double efficiencyVmax20) {
    this.efficiencyVmax20 = efficiencyVmax20;
  }

  public Inverter efficiencyVmax30(Double efficiencyVmax30) {
    this.efficiencyVmax30 = efficiencyVmax30;
    return this;
  }

   /**
   * Efficiency @Vmax, 30% (%)
   * @return efficiencyVmax30
  **/
  @ApiModelProperty(value = "Efficiency @Vmax, 30% (%)")


  public Double getEfficiencyVmax30() {
    return efficiencyVmax30;
  }

  public void setEfficiencyVmax30(Double efficiencyVmax30) {
    this.efficiencyVmax30 = efficiencyVmax30;
  }

  public Inverter efficiencyVmax50(Double efficiencyVmax50) {
    this.efficiencyVmax50 = efficiencyVmax50;
    return this;
  }

   /**
   * Efficiency @Vmax, 50% (%)
   * @return efficiencyVmax50
  **/
  @ApiModelProperty(value = "Efficiency @Vmax, 50% (%)")


  public Double getEfficiencyVmax50() {
    return efficiencyVmax50;
  }

  public void setEfficiencyVmax50(Double efficiencyVmax50) {
    this.efficiencyVmax50 = efficiencyVmax50;
  }

  public Inverter efficiencyVmax75(Double efficiencyVmax75) {
    this.efficiencyVmax75 = efficiencyVmax75;
    return this;
  }

   /**
   * Efficiency @Vmax, 75% (%)
   * @return efficiencyVmax75
  **/
  @ApiModelProperty(value = "Efficiency @Vmax, 75% (%)")


  public Double getEfficiencyVmax75() {
    return efficiencyVmax75;
  }

  public void setEfficiencyVmax75(Double efficiencyVmax75) {
    this.efficiencyVmax75 = efficiencyVmax75;
  }

  public Inverter efficiencyVmax100(Double efficiencyVmax100) {
    this.efficiencyVmax100 = efficiencyVmax100;
    return this;
  }

   /**
   * Efficiency @Vmax, 100% (%)
   * @return efficiencyVmax100
  **/
  @ApiModelProperty(value = "Efficiency @Vmax, 100% (%)")


  public Double getEfficiencyVmax100() {
    return efficiencyVmax100;
  }

  public void setEfficiencyVmax100(Double efficiencyVmax100) {
    this.efficiencyVmax100 = efficiencyVmax100;
  }

  public Inverter efficiencyVmax(Double efficiencyVmax) {
    this.efficiencyVmax = efficiencyVmax;
    return this;
  }

   /**
   * Efficiency @Vmax
   * @return efficiencyVmax
  **/
  @ApiModelProperty(value = "Efficiency @Vmax")


  public Double getEfficiencyVmax() {
    return efficiencyVmax;
  }

  public void setEfficiencyVmax(Double efficiencyVmax) {
    this.efficiencyVmax = efficiencyVmax;
  }

  public Inverter sortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Sort order
   * @return sortOrder
  **/
  @ApiModelProperty(value = "Sort order")


  public String getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
  }

  public Inverter cecListingDate(String cecListingDate) {
    this.cecListingDate = cecListingDate;
    return this;
  }

   /**
   * Listing date with California Energy Commission
   * @return cecListingDate
  **/
  @ApiModelProperty(value = "Listing date with California Energy Commission")


  public String getCecListingDate() {
    return cecListingDate;
  }

  public void setCecListingDate(String cecListingDate) {
    this.cecListingDate = cecListingDate;
  }

  public Inverter lastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Last update
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "Last update")


  public String getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inverter inverter = (Inverter) o;
    return
    		Objects.equals(this.id, inverter.id) &&
    		Objects.equals(this.manufacturerName, inverter.manufacturerName) &&
        Objects.equals(this.modelNumber, inverter.modelNumber) &&
        Objects.equals(this.description, inverter.description) &&
        Objects.equals(this.powerRating, inverter.powerRating) &&
        Objects.equals(this.nominalVoltage, inverter.nominalVoltage) &&
        Objects.equals(this.weightedEfficiency, inverter.weightedEfficiency) &&
        Objects.equals(this.ul1741SA, inverter.ul1741SA) &&
        Objects.equals(this.firmwareVersionTested, inverter.firmwareVersionTested) &&
        Objects.equals(this.builtInMeter, inverter.builtInMeter) &&
        Objects.equals(this.microInverter, inverter.microInverter) &&
        Objects.equals(this.notes, inverter.notes) &&
        Objects.equals(this.nightTareLoss, inverter.nightTareLoss) &&
        Objects.equals(this.powerRatingContinuous40degC, inverter.powerRatingContinuous40degC) &&
        Objects.equals(this.nightTareLoss40degC, inverter.nightTareLoss40degC) &&
        Objects.equals(this.voltageMinDC, inverter.voltageMinDC) &&
        Objects.equals(this.voltageNominalDC, inverter.voltageNominalDC) &&
        Objects.equals(this.voltageMaxDC, inverter.voltageMaxDC) &&
        Objects.equals(this.powerLevel10, inverter.powerLevel10) &&
        Objects.equals(this.powerLevel20, inverter.powerLevel20) &&
        Objects.equals(this.powerLevel30, inverter.powerLevel30) &&
        Objects.equals(this.powerLevel50, inverter.powerLevel50) &&
        Objects.equals(this.powerLevel75, inverter.powerLevel75) &&
        Objects.equals(this.powerLevel100, inverter.powerLevel100) &&
        Objects.equals(this.efficiencyVmin10, inverter.efficiencyVmin10) &&
        Objects.equals(this.efficiencyVmin20, inverter.efficiencyVmin20) &&
        Objects.equals(this.efficiencyVmin30, inverter.efficiencyVmin30) &&
        Objects.equals(this.efficiencyVmin50, inverter.efficiencyVmin50) &&
        Objects.equals(this.efficiencyVmin75, inverter.efficiencyVmin75) &&
        Objects.equals(this.efficiencyVmin100, inverter.efficiencyVmin100) &&
        Objects.equals(this.efficiencyVmin, inverter.efficiencyVmin) &&
        Objects.equals(this.efficiencyVnom10, inverter.efficiencyVnom10) &&
        Objects.equals(this.efficiencyVnom20, inverter.efficiencyVnom20) &&
        Objects.equals(this.efficiencyVnom30, inverter.efficiencyVnom30) &&
        Objects.equals(this.efficiencyVnom50, inverter.efficiencyVnom50) &&
        Objects.equals(this.efficiencyVnom75, inverter.efficiencyVnom75) &&
        Objects.equals(this.efficiencyVnom100, inverter.efficiencyVnom100) &&
        Objects.equals(this.efficiencyVnom, inverter.efficiencyVnom) &&
        Objects.equals(this.efficiencyVmax10, inverter.efficiencyVmax10) &&
        Objects.equals(this.efficiencyVmax20, inverter.efficiencyVmax20) &&
        Objects.equals(this.efficiencyVmax30, inverter.efficiencyVmax30) &&
        Objects.equals(this.efficiencyVmax50, inverter.efficiencyVmax50) &&
        Objects.equals(this.efficiencyVmax75, inverter.efficiencyVmax75) &&
        Objects.equals(this.efficiencyVmax100, inverter.efficiencyVmax100) &&
        Objects.equals(this.efficiencyVmax, inverter.efficiencyVmax) &&
        Objects.equals(this.sortOrder, inverter.sortOrder) &&
        Objects.equals(this.cecListingDate, inverter.cecListingDate) &&
        Objects.equals(this.lastUpdate, inverter.lastUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, manufacturerName, modelNumber, description, powerRating, nominalVoltage, weightedEfficiency, ul1741SA,
    		firmwareVersionTested, builtInMeter, microInverter, notes, nightTareLoss, powerRatingContinuous40degC,
    		nightTareLoss40degC, voltageMinDC, voltageNominalDC, voltageMaxDC,
    		powerLevel10, powerLevel20, powerLevel30, powerLevel50, powerLevel75, powerLevel100,
    		efficiencyVmin10, efficiencyVmin20, efficiencyVmin30, efficiencyVmin50, efficiencyVmin75, efficiencyVmin100, efficiencyVmin,
    		efficiencyVnom10, efficiencyVnom20, efficiencyVnom30, efficiencyVnom50, efficiencyVnom75, efficiencyVnom100, efficiencyVnom,
    		efficiencyVmax10, efficiencyVmax20, efficiencyVmax30, efficiencyVmax50, efficiencyVmax75, efficiencyVmax100, efficiencyVmax,
    		sortOrder, cecListingDate, lastUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inverter {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    manufacturerName: ").append(toIndentedString(manufacturerName)).append("\n");
    sb.append("    modelNumber: ").append(toIndentedString(modelNumber)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    powerRating: ").append(toIndentedString(powerRating)).append("\n");
    sb.append("    nominalVoltage: ").append(toIndentedString(nominalVoltage)).append("\n");
    sb.append("    weightedEfficiency: ").append(toIndentedString(weightedEfficiency)).append("\n");
    sb.append("    ul1741SA: ").append(toIndentedString(ul1741SA)).append("\n");
    sb.append("    firmwareVersionTested: ").append(toIndentedString(firmwareVersionTested)).append("\n");
    sb.append("    builtInMeter: ").append(toIndentedString(builtInMeter)).append("\n");
    sb.append("    microInverter: ").append(toIndentedString(microInverter)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    nightTareLoss: ").append(toIndentedString(nightTareLoss)).append("\n");
    sb.append("    powerRatingContinuous40degC: ").append(toIndentedString(powerRatingContinuous40degC)).append("\n");
    sb.append("    nightTareLoss40degC: ").append(toIndentedString(nightTareLoss40degC)).append("\n");
    sb.append("    voltageMinDC: ").append(toIndentedString(voltageMinDC)).append("\n");
    sb.append("    voltageNominalDC: ").append(toIndentedString(voltageNominalDC)).append("\n");
    sb.append("    voltageMaxDC: ").append(toIndentedString(voltageMaxDC)).append("\n");
    sb.append("    powerLevel10: ").append(toIndentedString(powerLevel10)).append("\n");
    sb.append("    powerLevel20: ").append(toIndentedString(powerLevel20)).append("\n");
    sb.append("    powerLevel30: ").append(toIndentedString(powerLevel30)).append("\n");
    sb.append("    powerLevel50: ").append(toIndentedString(powerLevel50)).append("\n");
    sb.append("    powerLevel75: ").append(toIndentedString(powerLevel75)).append("\n");
    sb.append("    powerLevel100: ").append(toIndentedString(powerLevel100)).append("\n");
    sb.append("    efficiencyVmin10: ").append(toIndentedString(efficiencyVmin10)).append("\n");
    sb.append("    efficiencyVmin20: ").append(toIndentedString(efficiencyVmin20)).append("\n");
    sb.append("    efficiencyVmin30: ").append(toIndentedString(efficiencyVmin30)).append("\n");
    sb.append("    efficiencyVmin50: ").append(toIndentedString(efficiencyVmin50)).append("\n");
    sb.append("    efficiencyVmin75: ").append(toIndentedString(efficiencyVmin75)).append("\n");
    sb.append("    efficiencyVmin100: ").append(toIndentedString(efficiencyVmin100)).append("\n");
    sb.append("    efficiencyVmin: ").append(toIndentedString(efficiencyVmin)).append("\n");
    sb.append("    efficiencyVnom10: ").append(toIndentedString(efficiencyVnom10)).append("\n");
    sb.append("    efficiencyVnom20: ").append(toIndentedString(efficiencyVnom20)).append("\n");
    sb.append("    efficiencyVnom30: ").append(toIndentedString(efficiencyVnom30)).append("\n");
    sb.append("    efficiencyVnom50: ").append(toIndentedString(efficiencyVnom50)).append("\n");
    sb.append("    efficiencyVnom75: ").append(toIndentedString(efficiencyVnom75)).append("\n");
    sb.append("    efficiencyVnom100: ").append(toIndentedString(efficiencyVnom100)).append("\n");
    sb.append("    efficiencyVnom: ").append(toIndentedString(efficiencyVnom)).append("\n");
    sb.append("    efficiencyVmax10: ").append(toIndentedString(efficiencyVmax10)).append("\n");
    sb.append("    efficiencyVmax20: ").append(toIndentedString(efficiencyVmax20)).append("\n");
    sb.append("    efficiencyVmax30: ").append(toIndentedString(efficiencyVmax30)).append("\n");
    sb.append("    efficiencyVmax50: ").append(toIndentedString(efficiencyVmax50)).append("\n");
    sb.append("    efficiencyVmax75: ").append(toIndentedString(efficiencyVmax75)).append("\n");
    sb.append("    efficiencyVmax100: ").append(toIndentedString(efficiencyVmax100)).append("\n");
    sb.append("    efficiencyVmax: ").append(toIndentedString(efficiencyVmax)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    cecListingDate: ").append(toIndentedString(cecListingDate)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
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

