package com.capgemini;

import java.util.ArrayList;

public class Product {

    private String productName;

    private int price;

    private int quantity;

    /**
     * Deze constructor geeft een product bij aanmaak een naam, prijs en type van aanbieding mee, zodat je daarmee later de berekening kan maken van de prijs
     */
    public Product(String productName, int price, int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Getters & Setters
     * @return
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //public String getTypeOffer() {
    //    return typeOffer;
    //}

   // public void setTypeOffer(String typeOffer) {
    //    this.typeOffer = typeOffer;
    //}

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
