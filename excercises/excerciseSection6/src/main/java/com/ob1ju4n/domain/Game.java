package com.ob1ju4n.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Juan on 16/08/2016.
 */
@Entity
public class Game {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private Boolean exclusive;
    private Double score;
    private Date releaseDate;

    @ManyToMany
    private List<Platform> platforms;

    public Game() {}

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

    public Boolean getExclusive() {
        return exclusive;
    }

    public void setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", exclusive=" + exclusive +
                ", score=" + score +
                ", releaseDate=" + releaseDate +
                ", platforms=" + platforms +
                '}';
    }
}
