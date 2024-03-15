package com.learning.core.day10;

import java.io.*;
import java.util.ArrayList;

public class D10P03 {
    public static void main(String[] args) {
        ArrayList<Student> students = readStudentDataFromFile("student_dataset.ser");
        
        if (students.isEmpty()) {
            System.out.println("No records found.");
        } else {
            for (Student student : students) {
                System.out.println("Roll Number: " + student.getRollNumber());
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Address: " + student.getAddress());
                System.out.println();
            }
        }
    }

    private static ArrayList<Student> readStudentDataFromFile(String filename) {
        ArrayList<Student> students = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            while (true) {
                try {
                    Student student = (Student) ois.readObject();
                    students.add(student);
                } catch (EOFException e) {
                    break;  // End of file reached
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}

