package com.example.hotels_service.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hotels {
    private long id;
    private String nombre;
    private long estrellas;
    private long id_ciudad;
}
