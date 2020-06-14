package com.ibm.ix.dictairport.service;

import com.ibm.ix.dictairport.mapper.AirportMapper;
import com.ibm.ix.dictairport.model.AirportDTO;
import com.ibm.ix.dictairport.repository.AirportRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AirportService {

    private final AirportRepository airportRepository;
    private final AirportMapper airportMapper;

    public AirportService(AirportRepository airportRepository,
                          AirportMapper airportMapper) {
        this.airportRepository = airportRepository;
        this.airportMapper = airportMapper;
    }

    public List<AirportDTO> getAllAirports() {
        return airportRepository.findAll().stream()
                .map(airportMapper::toDTO)
                .collect(Collectors.toList());
    }

    public AirportDTO getAirportByCode(String code) {
        return airportRepository.findByCode(code)
                .map(airportMapper::toDTO)
                .orElse(null);
    }

    public AirportDTO getAirportById(Long id) {
        return airportRepository.findById(id)
                .map(airportMapper::toDTO)
                .orElse(null);
    }
}
