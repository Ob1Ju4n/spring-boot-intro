package com.ob1ju4n.rsad.domain;

/**
 * Created by j.ortiz on 05/08/2016.
 */
public class Watch {

    private String name;
    private String price;
    private boolean available;
    private String description;
    private String imgName;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", available=" + available +
                ", description='" + description + '\'' +
                ", imgName='" + imgName + '\'' +
                '}';
    }
}
