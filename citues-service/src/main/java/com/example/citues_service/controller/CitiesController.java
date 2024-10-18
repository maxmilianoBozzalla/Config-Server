package com.example.citues_service.controller;

import com.example.citues_service.model.Cities;
import com.example.citues_service.service.IServiceCities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cities")
public class CitiesController {

    @Autowired
    private IServiceCities serviceCities;


    @GetMapping("/hotels")
    public Cities getCity(@RequestParam() String nombre,
                          @RequestParam() String pais){

        Cities city = serviceCities.getCity(nombre,pais);

        return city;
    }

}
