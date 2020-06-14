package com.ibm.ix.dictairport.entity;


import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Table(name="airport")
public class Airport {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "town_id")
    private String townId;

    @Column(name = "icao")
    private String icao;

    @Column(name = "name_eng")
    private String nameEng;


}
