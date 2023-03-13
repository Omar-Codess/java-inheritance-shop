package org.lessons.java.inheritance.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{

    String color;
    boolean wireless;
    public Cuffie(int code, String name, String description, BigDecimal price, BigDecimal vat) {
        super(code, name, description, price, vat);

    }
}
