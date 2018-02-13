package com.capgemini;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //Returning customer aanmaken
        ReturningCustomer customerJan = new ReturningCustomer("Jan");

        Product robijn = new Product("Robijn", 3, 2);
        Product brinta = new Product("Brinta", 2, 2);
        Product chinesegroenten = new Product("Chinese groente", 3, 1);
        Product luiers = new Product("Luiers", 10, 4);

        //ArrayList<Product> products = new ArrayList<Product>();
        //products.add(robijn);
        //products.add(brinta);
        //products.add(chinesegroenten);
        //products.add(luiers);

        customerJan.addToBasket(robijn);
        customerJan.addToBasket(brinta);
        customerJan.addToBasket(chinesegroenten);
        customerJan.addToBasket(luiers);
        // for each
        //for (Product item : customerJan.basket) {
        //      System.out.println("In de mand zit " +item);
        // }
        for (Product item : customerJan.basket) {
            System.out.println("In de mand zit " + item.getProductName());
        }

        // optellen van de inhoud van de arraylist aantallen en prijzen
        Register kassa1 = new Register();
        kassa1.calculatePrice(customerJan.basket);


        //System.out.println(products);

        //customerJan.greeting();


    }
}
