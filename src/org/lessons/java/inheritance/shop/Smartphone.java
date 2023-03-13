package org.lessons.java.inheritance.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    String imeiCode;
    int memoryInGb;
    public Smartphone(int code, String name, String description, BigDecimal price, BigDecimal vat) {
        super(code, name, description, price, vat);

    }
}
