package com.davidherron.pvmodulesinverters.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidherron.pvmodulesinverters.model.Inverter;
import com.davidherron.pvmodulesinverters.repository.InvertersRepository;

@Service
public class InvertersService {

    @Autowired
    private InvertersRepository invertersRespository;

    public List<Inverter> searchForInverters(
            String manufacturer, String model, Float minpower,
            Float maxpower, Float minvoltage, Float maxvoltage,
            String hasmeter, String microinverter) {

        return invertersRespository.searchForInverters(
            manufacturer, model, minpower, maxpower, minvoltage, maxvoltage,
            hasmeter, microinverter);
    }

}
