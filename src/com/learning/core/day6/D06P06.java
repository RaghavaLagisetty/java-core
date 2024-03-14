package com.learning.core.day6;

import java.util.*;

class Car1 implements Comparable<Car1> {
    private String name;
    private double price;

    public Car1(String name, double price) {
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
        Car1 car = (Car1) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car1 other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P06 {
    public static void main(String[] args) {
        TreeMap<Car1, String> carMap = new TreeMap<>(Collections.reverseOrder());    
       
        Car1 bugatti = new Car1("Bugatti", 80050.0);
        Car1 swift = new Car1("Swift", 305000.0);
        Car1 audi = new Car1("Audi", 600100.0);
        Car1 benz = new Car1("Benz", 900000.0);

        carMap.put(bugatti, bugatti.getName());
        carMap.put(swift, swift.getName());
        carMap.put(audi, audi.getName());
        carMap.put(benz, benz.getName());

        for (Car1 car : carMap.keySet()) {
            System.out.println(car);
        }
    }
}
