package com.cgi.workshop.cucumber;

/**
 * Created by sollmanr on 7-12-2015.
 */
public class Price {

    private String product;
    private Integer price;
    private String currency;

    public Price(String product, Integer price, String currency) {
        this.product = product;
        this.price = price;
        this.currency = currency;
    }

    public String getProduct() {
        return product;
    }

    public Integer getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}
