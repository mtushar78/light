package com.comitit.light.services;

import com.comitit.light.model.LightEntity;
import com.comitit.light.repository.LightInfoRepo;
import com.comitit.light.repository.LightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {
    @Autowired
    LightRepo lightRepo;
    @Autowired
    LightInfoRepo lightInfoRepo;

    public List<LightEntity> getAllValues() {
        return lightRepo.findAll();
    }
    
    public String insertData(LightEntity lightEntity) {
        Integer dbNo = lightEntity.getLightInfo().getLightDBIdentity().getDbNo();
        Integer lightno = lightEntity.getLightInfo().getLightDBIdentity().getLightNo();
        boolean isTurnedOn = lightEntity.isTurnedOn();
        if (lightRepo.findByLightInfo(lightEntity.getLightInfo()) != null) {
            lightRepo.updateIsOn(isTurnedOn, dbNo, lightno);
            return "updated";
        } else {
            lightRepo.save(lightEntity);
            return "Created";
        }
//
    }
}
