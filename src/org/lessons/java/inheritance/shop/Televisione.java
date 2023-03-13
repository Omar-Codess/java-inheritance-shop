package org.lessons.java.inheritance.shop;

import java.math.BigDecimal;

public class Televisione extends Prodotto {

    int heightCm;
    int widthCm;
    boolean smart;
    public Televisione(int code, String name, String description, BigDecimal price, BigDecimal vat) {
        super(code, name, description, price, vat);

    }
}
