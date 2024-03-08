package com.learning.core.day5;

import java.util.Random;
import java.util.Scanner;

class Register<T> {
    private String registerId;

    public String generateRegisterId(int n) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < n; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        registerId = sb.toString();
        return registerId;
    }

    public void displayRegistration(T user) {
        if (user instanceof Employee) {
            Employee employee = (Employee) user;
           
            System.out.println(employee.getName());
            System.out.println(employee.getPhoneNo());
            System.out.println(employee.getEmployeeId());
            System.out.println(registerId);
        } else if (user instanceof Student) {
            Student student = (Student) user;
          
            System.out.println(student.getName());
            System.out.println(student.getPhoneNo());
            System.out.println(registerId);
        }
    }
}

class Employee {
    private String name;
    private Long phoneNo;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;
    private int voterId;
    private int employeeId;

    public Employee(String name, Long phoneNo, int employeeId, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.passportNo = passportNo;
    }

    public Employee(String name, Long phoneNo, int employeeId, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Employee(String name, Long phoneNo, int employeeId, int licenseNo, String panCardNo, int voterId) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
        this.voterId = voterId;
    }

    public String getName() {
        return name;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

class Student {
    private String name;
    private Long phoneNo;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;
    private int voterId;

    public Student(String name, Long phoneNo, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.passportNo = passportNo;
    }

    public Student(String name, Long phoneNo, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Student(String name, Long phoneNo, int voterId, int licenseNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
    }

    public String getName() {
        return name;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }
}

public class D05P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user type (1 for Employee, 2 for Student):");
        int userType = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter phone number:");
        Long phoneNo = scanner.nextLong();
        scanner.nextLine(); 

        System.out.println("Enter passport number:");
        String passportNo = scanner.nextLine();

        Register<Object> register = new Register<>();

        if (userType == 1) {
            System.out.println("Enter employee ID:");
            int employeeId = scanner.nextInt();

            Employee employee = new Employee(name, phoneNo, employeeId, passportNo);
            String registerId = register.generateRegisterId(8);
            register.displayRegistration(employee);
        } else if (userType == 2) {
            System.out.println("Enter voter ID:");
            int voterId = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Enter license number:");
            int licenseNo = scanner.nextInt();

            Student student = new Student(name, phoneNo, voterId, licenseNo);
            String registerId = register.generateRegisterId(8);
            register.displayRegistration(student);
        } else {
            System.out.println("Invalid user type.");
        }

        scanner.close();
    }
}
