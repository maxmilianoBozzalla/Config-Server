package com.example.citues_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HotelsDTO {
    private long id;
    private String nombre;
    private long estrellas;
    private long id_ciudad;
}
