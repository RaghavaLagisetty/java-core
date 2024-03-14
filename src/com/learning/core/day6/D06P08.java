package com.learning.core.day6;

import java.util.*;

class Car3 implements Comparable<Car3> {
    private String name;
    private double price;

    public Car3(String name, double price) {
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
        Car3 car = (Car3) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car3 other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P08 {
    public static void main(String[] args) {
        TreeMap<Car3, String> carMap = new TreeMap<>();
        
        Car3 bugatti = new Car3("Bugatti", 80050.0);
        Car3 swift = new Car3("Swift", 305000.0);
        Car3 audi = new Car3("Audi", 600100.0);
        Car3 benz = new Car3("Benz", 900000.0);

        carMap.put(bugatti, bugatti.getName());
        carMap.put(swift, swift.getName());
        carMap.put(audi, audi.getName());
        carMap.put(benz, benz.getName());
        
        Map.Entry<Car3, String> highestEntry = carMap.lastEntry();
        carMap.remove(highestEntry.getKey());

        for (Car3 car : carMap.keySet()) {
            System.out.println(car);
        }

    }
}

