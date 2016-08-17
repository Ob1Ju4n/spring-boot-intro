package com.ob1ju4n.domain;


import javax.persistence.*;

/**
 * Created by j.ortiz on 17/08/2016.
 */
@Entity
public class Wish {

    @Id
    @GeneratedValue
    private Long id;

    private String responsible;

    @Column(columnDefinition = "TEXT")
    private String requirement;

    private Boolean fulfilled;

    @OneToOne
    private Game game;

    public Wish() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public Boolean getFulfilled() {
        return fulfilled;
    }

    public void setFulfilled(Boolean fulfilled) {
        this.fulfilled = fulfilled;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Wish{" +
                "id=" + id +
                ", responsible='" + responsible + '\'' +
                ", requirement='" + requirement + '\'' +
                ", fulfilled=" + fulfilled +
                ", game=" + game +
                '}';
    }
}
