package com.ibm.ix.dictairport.mapper;

import com.ibm.ix.dictairport.entity.Airport;
import com.ibm.ix.dictairport.mapper.qualifier.AirportQualifier;
import com.ibm.ix.dictairport.model.AirportDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = AirportQualifier.class)
public interface AirportMapper {

    @Mapping(target = "airportName", source = "name")
    @Mapping(target = "airportCode", source = "code")
    @Mapping(target = "icao", source = "icao", qualifiedByName = "mapIcao")
    AirportDTO toDTO(Airport airport);
}
