package com.capgemini;

import java.util.ArrayList;

public class Register implements IRegister {
    private int totalamount = 0;
    private int tussenamount = 0;
    //int totaldiscount = 0;
    private int tussendiscount = 0;
    private int aantalkorting = 0;
    private int endamount = 0;

    public void initializeProduct(ArrayList<Product> allProducts) {

    }

    public void checkOut(Customer customer) {

    }



    // Bereken de discount:
    // A (Robijn): 3x geeft 2 euro korting (3 voor 7)
    // B (brinta): 2x geeft 1 euro korting (2 voor 3)
    // E (Luiers): 4x geeft 10 euro korting (4 voor 30)
    public int calculateDiscount(ArrayList<Product> basket) {
        for (Product item : basket) {
            // == IS FOUT, moet hier equals gebruiken !!!!!! blz. 117 understanding equality
            //== alleen bij primaire types gebruiken
            if (item.getProductName() == "Robijn"){
               aantalkorting = item.getQuantity() / 3;
               tussendiscount = tussendiscount + (aantalkorting*2);}
            if (item.getProductName() == "Brinta"){
                aantalkorting = item.getQuantity() / 2;
                tussendiscount = tussendiscount + (aantalkorting*1);}
            if (item.getProductName() == "Luiers"){
                aantalkorting = item.getQuantity() / 4;
                tussendiscount = tussendiscount + (aantalkorting*10);}
        }
        System.out.println("Het kortingsbedrag is  = " + tussendiscount);
        return 0;
    }

    public String printFinalPrice() {
  //public void printFinalPrice() {

        // void gebruiken ipv een returntype RETURN
        endamount = (totalamount - tussendiscount);
        System.out.println("Het eindbedrag incl korting = " + endamount );
        return null;
    }

    //Robijn A: 3 euro
    //Brinta B: 2 euro
    //Chinesegroenten: C 3 euro
    //Luiers D: 10 euro
    //Kwark E: 2 euro
    public int calculatePrice(ArrayList<Product> basket) {
        //int totalamount = 0;
        //int tussenamount = 0;
        for (Product item : basket) {
            tussenamount = item.getPrice()*item.getQuantity();
            totalamount = totalamount + tussenamount;
        }
        System.out.println("Het totaalbedrag zonder korting  = " + totalamount);
        return 0;
    }
}
