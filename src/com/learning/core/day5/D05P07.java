package com.learning.core.day5;

import java.util.*;

class Person1 implements Comparable<Person1> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person1(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return   id + " "+name +" "+ age +" "+ salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person1 person = (Person1) obj;
        return id == person.id &&
               age == person.age &&
               Double.compare(person.salary, salary) == 0 &&
               Objects.equals(name, person.name);
    }

    @Override
    public int compareTo(Person1 other) {
        return Integer.compare(this.id, other.id);
    }
}

public class D05P07 {
    public static void main(String[] args) {
        TreeSet<Person1> personSet = new TreeSet<>();
        
        personSet.add(new Person1(1, "Jerry", 12, 999.0));
        personSet.add(new Person1(2, "Smith", 22, 2999.0));
        personSet.add(new Person1(3, "Popeye", 21, 5999.0));
        personSet.add(new Person1(4, "Jones", 22, 6999.0));
        personSet.add(new Person1(5, "john", 22, 6999.0));
        personSet.add(new Person1(6, "Tom", 42, 3999.0));

        for (Person1 person : personSet) {
            System.out.println(person.toString());
        }
    }
}
