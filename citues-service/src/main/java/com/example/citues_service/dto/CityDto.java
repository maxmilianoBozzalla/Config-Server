package com.example.citues_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CityDto {
    private long id_ciudad;
    private String nombre;
    private String pais;
    private String contienete;
    private List<HotelsDTO> listHotels;
}
