package com.capgemini;

import java.util.ArrayList;

public class Register implements IRegister {
    public void initializeProduct(ArrayList<Product> allProducts) {

    }

    public void checkOut(Customer customer) {

    }

    //public int calculatePrice(ArrayList<Product> basket) {

     //   return 0;


    public int calculateDiscount() {


        return 0;
    }

    public String printFinalPrice() {
        return null;
    }

    public int calculatePrice(ArrayList<Product> basket) {
        int totalamount = 0;
        int tussenamount = 0;
        for (Product item : basket) {
            tussenamount = item.getPrice()*item.getQuantity();
            totalamount = totalamount + tussenamount;
        }
        System.out.println("Het totaalbedrag zonder korting  = " + totalamount);
        return 0;
    }
}
