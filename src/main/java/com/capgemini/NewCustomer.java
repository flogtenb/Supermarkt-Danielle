package com.capgemini;

public class NewCustomer extends Customer {

    public NewCustomer(String naam) {
        super(naam);
        System.out.println("Een nieuwe klant,  " + naam + " genaamd, komt de Albert Heijn binnen.");    }

    //@Override
    public String greeting() {
        System.out.println("Tot ziens, " + naam + " , wij hopen u vaker te zien.");
        return super.naam;
    }

    public void addToBasket(Product product) {
        basket.add(product);
    }

    public void clear(){
    }
}
