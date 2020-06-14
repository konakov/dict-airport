package com.ibm.ix.dictairport.model;

import lombok.Data;
import org.apache.catalina.authenticator.SavedRequest;

@Data
public class AirportDTO {

    private String airportCode;
    private String airportName;
    private String icao;
}
