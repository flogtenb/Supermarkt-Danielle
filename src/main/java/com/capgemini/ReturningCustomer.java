package com.capgemini;

public class ReturningCustomer extends Customer {

    public ReturningCustomer(String naam) {
        super(naam);
        System.out.println("Een bestaande klant met " + naam + " komt de Albert Heijn binnen.");
    }

    //@Override
    public String greeting() {
        System.out.println("Tot ziens, " + naam + " tot de volgende keer.");
        return super.naam;
    }

    public void addToBasket(Product product) {
        basket.add(product);
    }

    public void clear(){
    }

}
