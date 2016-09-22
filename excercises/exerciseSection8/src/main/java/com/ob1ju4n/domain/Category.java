package com.ob1ju4n.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Juan on 22/09/2016.
 */
@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private Set<Item> items;

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", items=" + items +
                '}';
    }
}
