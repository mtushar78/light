package com.comitit.light.controllers;

import com.comitit.light.model.LightEntity;
import com.comitit.light.services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController(value = "/api/")
public class MainController {
    @Autowired
    ApiService apiService;

    @GetMapping("getAll")
    public ResponseEntity<List<LightEntity>> getAll(){
        return new ResponseEntity<List<LightEntity>>(apiService.getAllValues(),new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping("insert/")
    public String insert(@RequestBody LightEntity lightEntity){

        return "Success!";
    }
}
