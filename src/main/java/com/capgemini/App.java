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

        Product robijn = new Product("Robijn", 3, 5);
        Product brinta = new Product("Brinta", 2, 4);
        Product chinesegroenten = new Product("Chinese groente", 3, 1);
        Product luiers = new Product("Luiers", 10, 8);

        customerJan.addToBasket(robijn);
        customerJan.addToBasket(brinta);
        customerJan.addToBasket(chinesegroenten);
        customerJan.addToBasket(luiers);

        // for each
        for (Product item : customerJan.basket) {
            System.out.println("In de mand zit " + item.getProductName());
        }

        // optellen van de inhoud van de arraylist aantallen en prijzen
        Register kassa1 = new Register();
        kassa1.calculatePrice(customerJan.basket);
        kassa1.calculateDiscount(customerJan.basket);
        kassa1.printFinalPrice();
        customerJan.greeting();
        customerJan.basket.clear();

        //
        System.out.println("        ");
        //nieuwe customer aanmaken, nog nooit in AH geweest
        NewCustomer customerPiet = new NewCustomer("Piet");
        Product robijn1 = new Product("Robijn", 3, 10);
        Product brinta1 = new Product("Brinta", 2, 6);
        Product chinesegroenten1 = new Product("Chinese groente", 3, 3);
        Product luiers1 = new Product("Luiers", 10, 9);

        customerPiet.addToBasket(robijn1);
        customerPiet.addToBasket(brinta1);
        customerPiet.addToBasket(chinesegroenten1);
        customerPiet.addToBasket(luiers1);

        // optellen van de inhoud van de arraylist aantallen en prijzen
        Register kassa2 = new Register();
        kassa2.calculatePrice(customerPiet.basket);
        kassa2.calculateDiscount(customerPiet.basket);
        kassa2.printFinalPrice();
        customerPiet.greeting();
    }
}
