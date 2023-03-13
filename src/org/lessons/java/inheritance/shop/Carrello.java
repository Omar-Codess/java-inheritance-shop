package org.lessons.java.inheritance.shop;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Carrello {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Benvenuto! Quanti prodotti desideri mettere nel carrello?");
        int itemsNumber = scan.nextInt();

        Prodotto carrello[] = new Prodotto[itemsNumber];

        for (int i = 0; i <= itemsNumber; i++){

            System.out.println("- Digita 1 per Smartphone;");
            System.out.println("- Digita 2 per Televisione;");
            System.out.println("- Digita 3 per Cuffie;");
            int userInput = scan.nextInt();


            switch (userInput){
                case 1:
                    System.out.println("SMARTPHONE");
                    System.out.println("codice:");
                    int code = scan.nextInt();
                    System.out.println("nome:");
                    String name = scan.nextLine();
                    System.out.println("descrizione:");
                    String description = scan.nextLine();
                    System.out.println("prezzo:");
                    BigDecimal price = scan.nextBigDecimal();
                    System.out.println("iva:");
                    BigDecimal vat = scan.nextBigDecimal();

                    carrello = new Smartphone[]{new Smartphone(code, name, description, price, vat)};
                case 2:
                    System.out.println("TELEVISIONE");
                    System.out.println("codice:");
                    code = scan.nextInt();
                    System.out.println("nome:");
                    name = scan.nextLine();
                    System.out.println("descrizione:");
                    description = scan.nextLine();
                    System.out.println("prezzo:");
                    price = scan.nextBigDecimal();
                    System.out.println("iva:");
                    vat = scan.nextBigDecimal();
                case 3:
                    System.out.println("CUFFIE");
                    System.out.println("codice:");
                    code = scan.nextInt();
                    System.out.println("nome:");
                    name = scan.nextLine();
                    System.out.println("descrizione:");
                    description = scan.nextLine();
                    System.out.println("prezzo:");
                    price = scan.nextBigDecimal();
                    System.out.println("iva:");
                    vat = scan.nextBigDecimal();
            }
        }
    }
}
