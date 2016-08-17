package com.ob1ju4n.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Juan on 16/08/2016.
 */
@Entity
public class Manufacturer {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(mappedBy = "manufacturer")
    private List<Platform> platforms;

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

    public List<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", platforms=" + platforms +
                '}';
    }
}
