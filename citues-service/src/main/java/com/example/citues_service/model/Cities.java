package com.example.citues_service.model;

import com.example.citues_service.dto.HotelsDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.aop.target.LazyInitTargetSource;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cities {
    private long id_ciudad;
    private String nombre;
    private String pais;
    private String contienete;
    private List<HotelsDTO> listHotels;

}
