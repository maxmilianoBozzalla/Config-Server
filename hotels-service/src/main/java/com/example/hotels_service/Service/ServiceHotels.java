package com.example.hotels_service.Service;

import com.example.hotels_service.Model.Hotels;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceHotels implements IServiceHotels{
    @Override
    public List<Hotels> getHotel(Long id_ciudad) {

        List<Hotels> listHotels = new ArrayList<>();
        Hotels hotel1 = new Hotels(1,"Hotel-1",2,1);
        Hotels hotel2 = new Hotels(2,"Hotel-2",5,1);
        Hotels hotel3 = new Hotels(3,"Hotel-3",5,2);
        Hotels hotel4 = new Hotels(4,"Hotel-4",1,2);
        Hotels hotel5 = new Hotels(5,"Hotel-5",4,3);
        Hotels hotel6 = new Hotels(6,"Hotel-6",3,3);
        Hotels hotel7 = new Hotels(7,"Hotel-7",2,4);
        Hotels hotel8 = new Hotels(8,"Hotel-8",3,4);

        listHotels.add(hotel1);
        listHotels.add(hotel2);
        listHotels.add(hotel3);
        listHotels.add(hotel4);
        listHotels.add(hotel5);
        listHotels.add(hotel6);
        listHotels.add(hotel7);
        listHotels.add(hotel8);

        List<Hotels> listaReturn = new ArrayList<>();

        for(Hotels hotel : listHotels){
            if(hotel.getId_ciudad() == id_ciudad)
                listaReturn.add(hotel);
        }

        return listaReturn;
    }
}
