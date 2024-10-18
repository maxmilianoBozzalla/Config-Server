package com.example.hotels_service.Controller;

import com.example.hotels_service.Model.Hotels;
import com.example.hotels_service.Service.IServiceHotels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class ControllerHotels {

    @Autowired
    private IServiceHotels serviceHotels;

    @GetMapping("/city/{id_ciudad}")
    public List<Hotels> getHotelByCity(@PathVariable("id_ciudad") long id_ciudad){
        List<Hotels> listHotels = serviceHotels.getHotel(id_ciudad);

        return listHotels;
    }
}
