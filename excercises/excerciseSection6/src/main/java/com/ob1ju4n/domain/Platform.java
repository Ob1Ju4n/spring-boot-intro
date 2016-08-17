package com.ob1ju4n.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Juan on 16/08/2016.
 */
@Entity
public class Platform {

    @Id
    @GeneratedValue
    private long id;
    private String name;

    @ManyToOne
    private Manufacturer manufacturer;

    @ManyToMany(mappedBy = "platforms")
    private List<Game> games;

    public Platform() {
    }

    public Platform(String name, Manufacturer manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
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

    public void setName(String name) {
        this.name = name;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer=" + manufacturer +
                ", games=" + games +
                '}';
    }
}
