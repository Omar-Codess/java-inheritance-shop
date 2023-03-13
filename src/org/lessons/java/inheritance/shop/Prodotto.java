package org.lessons.java.inheritance.shop;

import java.math.BigDecimal;

public class Prodotto {
    //CAMPI
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal vat;

    //COSTRUTTORE
    public Prodotto(int code, String name, String description, BigDecimal price, BigDecimal vat) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

}
