package com.davidherron.pvmodulesinverters.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidherron.pvmodulesinverters.model.Module;
import com.davidherron.pvmodulesinverters.repository.ModulesRepository;


@Service
public class ModulesService {

    @Autowired
    private ModulesRepository modulesRepository;

    public List<Module> searchForModules(
            String manufacturer, String model, Float minPmax, Float maxPmax,
            Float minVpmax, Float maxVpmax, Float minVoc, Float maxVoc, Float minIsc,
            Float maxIsc, String family, String technology) {

        return modulesRepository.searchForModules(
            manufacturer, model, minPmax, maxPmax, minVpmax, maxVpmax, minVoc,
            maxVoc, minIsc, maxIsc, family, technology);
    }

}
