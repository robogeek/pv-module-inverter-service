CREATE TABLE `modules` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Manufacturer` text,
  `ModelNumber` text,
  `Description` text,
  `BIPV` text,
  `NameplatePmax` float,
  `PTC` float,
  `Notes` text,
  `NameplateVpmax` float,
  `NameplateIpmax` float,
  `NameplateVoc` float,
  `NameplateIsc` float,
  `AverageNOCT` float,
  `betaVoc` float,
  `betaVpmax` float,
  `alphaIsc` float,
  `alphaIpmax` float,
  `gammaPmax` float,
  `VPmaxlow` float,
  `IPmaxlow` float,
  `VPmaxNOCT` float,
  `IPmaxNOCT` float,
  `ShortSide` float,
  `LongSide` float,
  `GeometricMultiplier` text,
  `ApertureArea` float,
  `NumberCellsSeries` float,
  `NumberCellsParallel` float,
  `Type` text,
  `Family` text,
  `Technology` text,
  `P2Pref` float,
  `PercentNonlin` text,
  `a_ref` text,
  `I_o_ref` text,
  `I_L_ref` text,
  `R_s_ref` text,
  `R_sh_ref` text,
  `delta` text,
  `I_sc_adj` text,
  `Time` text,
  `Version` text,
  `Mounting` text,
  `LastUpdate` text,
  `CECListingDate` text,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;
