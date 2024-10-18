package com.example.hotels_service.Service;

import com.example.hotels_service.Model.Hotels;

import java.util.List;

public interface IServiceHotels {
    public List<Hotels> getHotel(Long id_ciudad);
}
