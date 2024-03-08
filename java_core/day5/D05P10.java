package com.learning.core.day5;

import java.util.*;


class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary ;
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
        Person person = (Person) obj;
        return id == person.id && age == person.age && Double.compare(person.salary, salary) == 0
                && Objects.equals(name, person.name);
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class D05P10 {
    public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();
        
        
        personSet.add(new Person(1, "Jerry", 12, 999.0));
        personSet.add(new Person(2, "Smith", 22, 2999.0));
        personSet.add(new Person(3, "Popeye", 21, 5999.0));
        personSet.add(new Person(4, "Jones", 22, 6999.0));
        personSet.add(new Person(5, "john", 22, 6999.0));
        personSet.add(new Person(6, "Tom", 42, 3999.0));

        Person firstPersonWithJ = personSet.stream()
                .filter(person -> person.getName().startsWith("J"))
                .findFirst()
                .orElse(null);

        if (firstPersonWithJ != null) {
            System.out.println(firstPersonWithJ);
        } else {
            System.out.println("No person found whose name starts with 'J'");
        }
    }
}

