package com.pivottech;

public enum ProductItem {
    COKE("coke", "HLSZS01", 1.75 ),
    KITKAT("kitkat", "HLSZS02", 1.2 ),
    BEER("beer", "HLSZS03", 2.75 );
    private String name;
    private String sku;
    private double price;

    ProductItem(String name, String sku, double price) {
        this.name = name;
        this.sku = sku;
        this.price = price;
    }
    public java.lang.String getSku() {
        return sku;
    }

    public void setSku(java.lang.String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
