package com.ob1ju4n.rsad.domain;

/**
 * Created by j.ortiz on 05/08/2016.
 */
public class Watch {

    private String name;
    private String price;
    private boolean available;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", available=" + available +
                '}';
    }
}
