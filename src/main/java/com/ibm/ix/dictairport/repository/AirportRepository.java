package com.ibm.ix.dictairport.repository;

import com.ibm.ix.dictairport.entity.Airport;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AirportRepository extends CrudRepository<Airport, Long> {

    List<Airport> findAll();

    Optional<Airport> findByCode(String code);

    Optional<Airport> findById(Long id);
}
