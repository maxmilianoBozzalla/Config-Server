package com.example.citues_service.service;

import com.example.citues_service.dto.HotelsDTO;
import jakarta.ws.rs.Path;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "hotels-service")
public interface IGetApi {
    @GetMapping("/hotels/city/{id_ciudad}")
    public List<HotelsDTO> getListHotelsByCity(@PathVariable("id_ciudad") long id_ciudad);
}
