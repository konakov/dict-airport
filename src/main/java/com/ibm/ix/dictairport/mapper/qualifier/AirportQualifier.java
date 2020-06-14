package com.ibm.ix.dictairport.mapper.qualifier;

import org.mapstruct.Named;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class AirportQualifier {

    @Named("mapIcao")
    public String mapIcao (String icao) {
        return StringUtils.isEmpty(icao) ? null : icao;
    }
}
