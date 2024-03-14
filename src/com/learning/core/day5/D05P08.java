package com.learning.core.day5;

import java.util.*;

class Person2 implements Comparable<Person2> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person2(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
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
        Person2 person = (Person2) obj;
        return id == person.id &&
                age == person.age &&
                Double.compare(person.salary, salary) == 0 &&
                Objects.equals(name, person.name);
    }

    @Override
    public int compareTo(Person2 o) {
        return Integer.compare(this.id, o.id);
    }

    public String getName() {
        return name;
    }
}

public class D05P08 {
    public static void main(String[] args) {
        TreeSet<Person2> personSet = new TreeSet<>();

        Person2 person1 = new Person2(101, "Jerry", 35, 50000);
        Person2 person2 = new Person2(102, "Smith", 40, 60000);
        Person2 person3 = new Person2(103, "Popeye", 30, 55000);
        Person2 person4 = new Person2(104, "Jones", 45, 65000);
        Person2 person5 = new Person2(105, "John", 38, 52000);
        Person2 person6 = new Person2(106, "Tom", 42, 58000);

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);

        for (Person2 person : personSet) {
            if (containsUpperCase(person.getName())) {
                System.out.println(person.getName());
            }
        }
    }

    private static boolean containsUpperCase(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}
