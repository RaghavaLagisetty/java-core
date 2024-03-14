package com.learning.core.day5;

import java.util.*;

class Person3 implements Comparable<Person3> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person3(int id, String name, int age, double salary) {
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
        Person3 person = (Person3) obj;
        return id == person.id && age == person.age && Double.compare(person.salary, salary) == 0
                && Objects.equals(name, person.name);
    }

    @Override
    public int compareTo(Person3 o) {
        return Integer.compare(this.id, o.id);
    }
}

public class D05P09 {
    public static void main(String[] args) {
        TreeSet<Person3> treeSet = new TreeSet<>();
        
        treeSet.add(new Person3(3, "Jerry", 25, 50000));
        treeSet.add(new Person3(6, "Smith", 30, 60000));
        treeSet.add(new Person3(2, "Popeye", 35, 70000));
        treeSet.add(new Person3(5, "Jones", 40, 80000));
        treeSet.add(new Person3(1, "John", 45, 90000));
        treeSet.add(new Person3(4, "Tom", 50, 100000));

        double sumSalaries = treeSet.stream().mapToDouble(Person3::getSalary).sum();
        System.out.println(sumSalaries);
    }
}

