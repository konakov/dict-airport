package com.ibm.ix.dictairport.controller;

import com.ibm.ix.dictairport.model.AirportDTO;
import com.ibm.ix.dictairport.service.AirportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/airports")
public class AirportController {

    private final AirportService airportService;

    public AirportController(AirportService airportService) {

        this.airportService = airportService;
    }

    @GetMapping
    public List<AirportDTO> getAllAirports() {
        return airportService.getAllAirports();
    }

    @GetMapping("{id}")
    public ResponseEntity<AirportDTO> getAirportByCode(@PathVariable("id") Long id) {
        AirportDTO airport = airportService.getAirportById(id);
        return airport == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(airport);
    }


}
