package com.example.citues_service.service;

import com.example.citues_service.dto.HotelsDTO;
import com.example.citues_service.model.Cities;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ServiceCities implements IServiceCities{

    @Autowired
    private IGetApi apiHotels;

    /* @CircuitBreaker(name="hotels-service", fallbackMethod = "fallbackGetCitiesHotel")
    @Retry(name="hotels-service")*/
    @Override
    public Cities getCity(String nombre, String pais) {

        Cities city1 = new Cities(1,"Sunchales","Argentina","America del Sur",null);
        Cities city2 = new Cities(2,"Rafaela","Argentina","America del Sur",null);
        Cities city3 = new Cities(3,"Santa Fe","Argentina","America del Sur",null);
        Cities city4 = new Cities(4,"Arrufo","Argentina","America del Sur",null);

        List<Cities> listCities = new ArrayList<>();

        listCities.add(city1);
        listCities.add(city2);
        listCities.add(city3);
        listCities.add(city4);

        Cities cityReturn = new Cities();

        for(Cities city : listCities){
            if(city.getNombre().equals(nombre) && city.getPais().equals(pais)){
                cityReturn = city;
                List<HotelsDTO> listHotels = apiHotels.getListHotelsByCity(city.getId_ciudad());
                cityReturn.setListHotels(listHotels);

            }
        }

       // createExcepcion();
        return cityReturn;

    }

 /*   public Cities fallbackGetCitiesHotel(Throwable throwable){
        return new Cities(9999999999L,"FALLIDO","FALLIDO","FALLIDO",null);
    }

    public void createExcepcion (){
        throw new IllegalArgumentException("Prueba Resilence y Circuit Breaker");
    }*/
}
