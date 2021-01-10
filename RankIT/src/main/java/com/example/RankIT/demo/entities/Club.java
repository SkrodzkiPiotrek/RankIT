package com.example.RankIT.demo.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer punkty) {
        this.points = punkty;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Club{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", punkty=" + points +
                '}';
    }
}
