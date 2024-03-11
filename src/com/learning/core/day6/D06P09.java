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

    public void setPrice(double price) {
        this.price = price;
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

public class D06P09 {
    public static void main(String[] args) {
        TreeMap<Car, String> carMap = new TreeMap<>();
        
        Car reva = new Car("Reva", 80000.0);
        Car swift = new Car("Swift", 305000.0);
        Car audi = new Car("Audi", 600100.0);
        Car benz = new Car("Benz", 900000.0);

        carMap.put(reva, reva.getName());
        carMap.put(swift, swift.getName());
        carMap.put(audi, audi.getName());
        carMap.put(benz, benz.getName());

        Scanner scanner = new Scanner(System.in);
        double newPrice = Double.parseDouble(scanner.nextLine());
        scanner.close();
        Car keyCar = reva; 
        keyCar.setPrice(newPrice);

        System.out.println(keyCar.getName() + " " + keyCar.getPrice());
    }
}
