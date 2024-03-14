package com.learning.core.day5;

import java.util.LinkedHashSet;
import java.util.Iterator;

class Product1 {
    private String productId;
    private String productName;

    public Product1(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}

public class D05P03 {
    public static void main(String[] args) {
        LinkedHashSet<Product1> pdSet = new LinkedHashSet<>();

        pdSet.add(new Product1("P001", "Maruti 800"));
        pdSet.add(new Product1("P002", "Maruti Zen"));
        pdSet.add(new Product1("P003", "Maruti Dezire"));
        pdSet.add(new Product1("P004", "Maruti Alto"));

        Iterator<Product1> iterator = pdSet.iterator();
        while (iterator.hasNext()) {
            Product1 product = iterator.next();
            System.out.println(product.getProductId() + " " + product.getProductName());
        }
    }
}
