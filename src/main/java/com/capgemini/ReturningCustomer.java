package com.capgemini;

public class ReturningCustomer extends Customer {

    public ReturningCustomer(String naam) {
        super(naam);
        System.out.println("De klant met " + naam + " komt de Albert Heijn binnen.");
    }

    public String greeting() {
        return naam;
        //System.out.println("Tot ziens " + naam);
    }

    public void addToBasket(Product product) {
        basket.add(product);
    }
}
