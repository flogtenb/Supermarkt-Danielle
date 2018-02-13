package com.capgemini;

import java.util.ArrayList;

public abstract class Customer {

    String naam;

    public Customer(String naam) {
        this.naam = naam;
    }


    public abstract String greeting();

    /**
     * Methode om producten toe te voegen aan winkelmandje
     */

    ArrayList<Product> basket = new ArrayList<Product>();

    public abstract void addToBasket(Product product);

    public ArrayList<Product> getBasket() {
        return this.basket;
    }

    public void setBasket(ArrayList<Product> basket) {
        this.basket = basket;
    }
}
