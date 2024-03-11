package com.learning.core.day6;

import java.util.*;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P07 {
    public static void main(String[] args) {
        TreeMap<Car, String> carMap = new TreeMap<>();
        
        
        Car bugatti = new Car("Bugatti", 80050.0);
        Car swift = new Car("Swift", 305000.0);
        Car audi = new Car("Audi", 600100.0);
        Car benz = new Car("Benz", 900000.0);

        carMap.put(bugatti, bugatti.getName());
        carMap.put(swift, swift.getName());
        carMap.put(audi, audi.getName());
        carMap.put(benz, benz.getName());

       
        Map.Entry<Car, String> entryGreatestPrice = carMap.lastEntry();
        System.out.println(entryGreatestPrice.getKey() );//+ " " + entryGreatestPrice.getKey().getPrice()

        
        Map.Entry<Car, String> entryLeastPrice = carMap.firstEntry();
        System.out.println(entryLeastPrice.getKey());//+ " " + entryLeastPrice.getKey().getPrice()
    }
}

