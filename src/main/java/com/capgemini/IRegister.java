package com.capgemini;

import java.util.ArrayList;

public interface IRegister {

    /**
     * In deze methode moeten alle producten worden ingeladen bij de register
     */
    void initializeProduct(ArrayList<Product> allProducts);

    /**
     * In deze methode moeten alle producten geteld worden en dat je ook weet dat type A bijv 10 producten heeft, type b heeft 40, etc.
     */

    /**
     * Dit is de hoofdmethode 'betalen'. Onder deze hoofdmethode vallen de methodes calculatePrice, calculateDiscount, printFinalPrice.
     * @param customer
     */
    void checkOut(Customer customer);

    /**
     * De implementatie van calculatePrice moet de prijs berekenen van de basket items van een klant en krijgt mee:
     * - de naam van de klant
     * - een arraylist genaamd basket met producten
     * In producten zitten de gegevens: naam, prijs en type van aanbieding
     *
     */
    int calculatePrice(ArrayList<Product> basket);

    /**
     * De implementatiehiervan moet de korting berekenen en krijgt mee:
     * - de berekende prijs van calculatePrice methode
     * - de type
     * @return een int met de korting
     */
    int calculateDiscount(ArrayList<Product> basket);


    /**
     * De implementatie hiervan moet de beginprijs en de korting verrekenen en vervolgens de uiteindelijke prijs uitprinten en returnen
     * @return string met een zin en de uiteindelijke prijs
     */
    String printFinalPrice();

}
