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

    public List<LightEntity> getAllValues(){
        return lightRepo.findAll();
    }
    public String insertData(LightEntity lightEntity){
        LightEntity newLightEntity = new LightEntity();
        if(lightEntity.getLightInfo().getLightDBIdentity().getLightNo() != null){

        }else{

        }
        return "xyz";
    }
}
