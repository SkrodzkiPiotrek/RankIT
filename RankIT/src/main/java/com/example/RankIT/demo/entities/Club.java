package com.example.RankIT.demo.entities;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Club {
protected Club() {}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //auto increment zarządzany przez bibliotekę
    private long id;
    private String name;
    private String country;
    private Integer points;

    public Club(long id, String name, String country, Integer points) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.points = points;
    }


}
