package com.company;

import java.io.Serializable;

public class Product implements Serializable {

    private String name;
    private double price;
    private double rating;
    //кто такой этот намбер?0_0 откуда он тут взялся? 0_0 с чего бы товару кофе знать сколько его взяли ? 0_0

    public  Product (String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product () {}

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }
    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
