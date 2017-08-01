package com.davidherron.pvmodulesinverters.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.davidherron.pvmodulesinverters.model.Inverter;
import com.davidherron.pvmodulesinverters.model.Module;
import com.davidherron.pvmodulesinverters.service.InvertersService;
import com.davidherron.pvmodulesinverters.service.ModulesService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class Controller {
	
	@Autowired
	private ModulesService modulesService;

	@Autowired
	private InvertersService invertersService;

    @ApiOperation(value = "", nickname = "getModules", notes = "Query the PV Modules database", response = Module.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Module.class, responseContainer = "List") })
	@RequestMapping(method = RequestMethod.GET, value = "/modules", produces = "application/json")
	public List<Module> modules(@ApiParam(value = "Matches against manufacturer name") @RequestParam(value = "manufacturer", required = false) String manufacturer,
	        @ApiParam(value = "Matches against manufacturer-assigned model number") @RequestParam(value = "model", required = false) String model,
	        @ApiParam(value = "Minimum of allowable Pmax range") @RequestParam(value = "minPmax", required = false) Float minPmax,
	        @ApiParam(value = "Maximum of allowable Pmax range") @RequestParam(value = "maxPmax", required = false) Float maxPmax,
	        @ApiParam(value = "Minimum of allowable Vpmax range") @RequestParam(value = "minVpmax", required = false) Float minVpmax,
	        @ApiParam(value = "Maximum of allowable Vpmax range") @RequestParam(value = "maxVpmax", required = false) Float maxVpmax,
	        @ApiParam(value = "Minimum of allowable Voc range") @RequestParam(value = "minVoc", required = false) Float minVoc,
	        @ApiParam(value = "Maximum of allowable Voc range") @RequestParam(value = "maxVoc", required = false) Float maxVoc,
	        @ApiParam(value = "Minimum of allowable Isx range") @RequestParam(value = "minIsc", required = false) Float minIsc,
	        @ApiParam(value = "Maximum of allowable Isc range") @RequestParam(value = "maxIsc", required = false) Float maxIsc,
	        @ApiParam(value = "Matches against the panel family", allowableValues = "monocrystalline, polycrystalline, thinfilm, cigsthin, hitsithin") @RequestParam(value = "family", required = false) String family,
	        @ApiParam(value = "Matches against the panel technology", allowableValues = "monocsi, multicsi, thinfilm") @RequestParam(value = "technology", required = false) String technology,
	        @RequestHeader(value = "Accept", required = false) String accept) {
		return modulesService.searchForModules(manufacturer, model, minPmax, maxPmax, minVpmax, maxVpmax, minVoc,
				maxVoc, minIsc, maxIsc, family, technology);
	}

    @ApiOperation(value = "", nickname = "getInverters", notes = "Query the PV Inverters database", response = Inverter.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Inverter.class, responseContainer = "List") })
    @RequestMapping(value = "/inverters", method = RequestMethod.GET, produces = "application/json")
    public List<Inverter> getInverters(@ApiParam(value = "Matches against manufacturer name") @RequestParam(value = "manufacturer", required = false) String manufacturer,
        @ApiParam(value = "Matches against manufacturer-assigned model number") @RequestParam(value = "model", required = false) String model,
        @ApiParam(value = "Minimum power continuous rating") @RequestParam(value = "minpower", required = false) Float minpower,
        @ApiParam(value = "Maximum power continuous rating") @RequestParam(value = "maxpower", required = false) Float maxpower,
        @ApiParam(value = "Minimum nominal voltage") @RequestParam(value = "minvoltage", required = false) Float minvoltage,
        @ApiParam(value = "Maximum nominal voltage") @RequestParam(value = "maxvoltage", required = false) Float maxvoltage,
        @ApiParam(value = "Has a built-in meter", allowableValues = "true, false") @RequestParam(value = "hasmeter", required = false) String hasmeter,
        @ApiParam(value = "Is a microinverter system", allowableValues = "true, false") @RequestParam(value = "microinverter", required = false) String microinverter,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {

    		System.out.println("getInverters before query");
        List<Inverter> inverters = invertersService.searchForInverters(manufacturer, model, minpower, maxpower,
                minvoltage, maxvoltage, hasmeter, microinverter);

        System.out.println("getInverters AFTER query # "+ inverters.size());
        
        return inverters;
    }

    @ExceptionHandler
    void handleIllegalArgumentException(
                      IllegalArgumentException e,
                      HttpServletResponse response) throws IOException {
 
        response.sendError(HttpStatus.BAD_REQUEST.value());
 
    }
}
