package org.lessons.java.inheritance.shop;

import java.util.Scanner;

public class Carrello {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Benvenuto! Scegli cosa desideri mettere nel carrello:");
        System.out.println("- Digita s per Smartphone;");
        System.out.println("- Digita t per Televisione;");
        System.out.println("- Digita c per Cuffie;");

        String userInput = scan.nextLine();


    }
}
