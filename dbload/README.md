Loads the GoCaliforniaSolar spreadsheets into a MySQL database.

The `package.json` contains the necessary scripts.  Just run:

```
$ npm run inverters
$ npm run modules
```

You will need to modify the path in each script according to where you've stashed the files.

Corresponding to each table is the schema file:

* _Inverters_ comes from `inverters.sql`
* _Modules_ comes from `modules.sql`

The GoSolarCalifornia spreadsheets come as both `.xlsx` and `.csv` files.  It's necessary to use the `.csv` files as the data source.  AND it is NECESSARY to first edit the `.csv` files so there is one header line.  That's because the software looks at the first line as the column header, naming the field name corresponding to the column.  The software requires there be only one header line, and that data start in line 2.

The Schema's use either `VARCHAR(255)` or `TEXT` data types for textual columns, or `FLOAT` for numerical columns.  If you should want to change the database Schema, the column names in the `.csv` files must also change, as described next.

The GoSolarCalifornia `.csv` files include multiple header lines.  Change them as so:

**Inverters**

```
ManufacturerName,ModelNumber,Description,PowerRatingContinuous,NominalVoltage,WeightedEfficiency,UL1741SupplementACertification,FirmwareVersionTested,BuiltInMeter,Microinverter,Notes,NightTareLoss,PowerRatingContinuous40degC,NightTareLoss40degC,VoltageMinimum,VoltageNominal,VoltageMaximum,PowerLevel10,PowerLevel20,PowerLevel30,PowerLevel50,PowerLevel75,PowerLevel100,EfficiencyVmin10,EfficiencyVmin20,EfficiencyVmin30,EfficiencyVmin50,EfficiencyVmin75,EfficiencyVmin100,EfficiencyVmin,EfficiencyVnom10,EfficiencyVnom20,EfficiencyVnom30,EfficiencyVnom50,EfficiencyVnom75,EfficiencyVnom100,EfficiencyVnom,EfficiencyVmax10,EfficiencyVmax20,EfficiencyVmax30,EfficiencyVmax50,EfficiencyVmax75,EfficiencyVmax100,EfficiencyVmax,SortOrder,CECListingDate,LastUpdate
```

**Modules**

```
Manufacturer,ModelNumber,Description,BIPV,NameplatePmax,PTC,Notes,NameplateVpmax,NameplateIpmax,NameplateVoc,NameplateIsc,AverageNOCT,betaVoc,betaVpmax,alphaIsc,alphaIpmax,gammaPmax,VPmaxlow,IPmaxlow,VPmaxNOCT,IPmaxNOCT,ShortSide,LongSide,GeometricMultiplier,A_c,N_s,N_p,Type,Family,Technology,P2Pref,PercentNonlin,a_ref,I_o_ref,I_L_ref,R_s_ref,R_sh_ref,delta,I_sc_adj,Time,Version,Mounting,LastUpdate,CECListingDate
```
