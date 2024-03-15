package com.learning.core.day10;

import java.io.*;
import java.util.Scanner;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int rollNumber;
    private String name;
    private int age;
    private String address;

    public Student(int rollNumber, String name, int age, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

public class D10P02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student_dataset.ser", true))) {
                while (true) {
                    try {
                        System.out.print("Enter Roll Number: ");
                        int rollNumber = Integer.parseInt(scanner.nextLine().trim());

                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine().trim();

                        if (name.isEmpty()) {
                            throw new BlankFieldException("Name cannot be blank.");
                        }

                        System.out.print("Enter Age: ");
                        int age = Integer.parseInt(scanner.nextLine().trim());

                        System.out.print("Enter Address: ");
                        String address = scanner.nextLine().trim();

                        if (address.isEmpty()) {
                            throw new BlankFieldException("Address cannot be blank.");
                        }

                        Student student = new Student(rollNumber, name, age, address);
                        oos.writeObject(student);
                        System.out.print("Do you want to add another student? (Yes/No): ");
                        String choice = scanner.nextLine().trim().toLowerCase();

                        if (!choice.equals("yes")) {
                            System.out.println("Program terminated.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Roll Number and Age must be numeric.");
                    } catch (BlankFieldException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        }
    }
}

class BlankFieldException extends Exception {
    public BlankFieldException(String message) {
        super(message);
    }
}
