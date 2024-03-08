package com.learning.core.day5;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Scanner;

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        return productId.equals(other.productId);
    }
}

public class D05P05 {
    public static void main(String[] args) {
        LinkedHashSet<Product> productSet = new LinkedHashSet<>();

        productSet.add(new Product("P001", "Maruti 800"));
        productSet.add(new Product("P002", "Maruti Zen"));
        productSet.add(new Product("P003", "Maruti Dezire"));
        productSet.add(new Product("P004", "Maruti Alto"));
        
        Scanner sc=new Scanner(System.in);
        String productIdToRemove = sc.nextLine();
        Iterator<Product> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId().equals(productIdToRemove)) {
                iterator.remove();
                break;
            }
        }

        for (Product product : productSet) {
            System.out.println(product.getProductId() + " " + product.getProductName());
        }
    }
}

