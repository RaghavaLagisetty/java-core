package com.learning.core.day3;

import java.util.Scanner;

class CatheyBankException extends Exception {
    public CatheyBankException(String message) {
        super(message);
    }
}

class InvalidNameException extends CatheyBankException {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidPostException extends CatheyBankException {
    public InvalidPostException(String message) {
        super(message);
    }
}

class InvalidAgeException extends CatheyBankException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Validator {
    public static void validate(Applicant applicant) throws CatheyBankException {
        if (!isValidApplicantName(applicant.getApplicantName())) {
            throw new InvalidNameException("Invalid Applicant Name");
        }
        if (!isValidPost(applicant.getPostApplied())) {
            throw new InvalidPostException("Invalid Post");
        }
        if (!isValidAge(applicant.getApplicantAge())) {
            throw new InvalidAgeException("Invalid Age");
        }
        System.out.println("All details are valid");
    }

    public static boolean isValidApplicantName(String name) {
        return name != null && !name.isEmpty() && !isPost(name);
    }

    public static boolean isValidPost(String post) {
        return post.equals("Probationary Officer") || post.equals("Assistant") || post.equals("Special Cadre Officer");
    }

    public static boolean isValidAge(int age) {
        return age > 18 && age < 30;
    }

    private static boolean isPost(String str) {
        return str.equals("Probationary Officer") || str.equals("Assistant") || str.equals("Special Cadre Officer");
    }
}

class Applicant {
    private String applicantName;
    private String postApplied;
    private int applicantAge;

    public Applicant(String applicantName, String postApplied, int applicantAge) {
        this.applicantName = applicantName;
        this.postApplied = postApplied;
        this.applicantAge = applicantAge;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getPostApplied() {
        return postApplied;
    }

    public int getApplicantAge() {
        return applicantAge;
    }
}

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter applicant name, post applied, and age: ");
            String name = scanner.next();
            String post = scanner.next();
            int age = scanner.nextInt();

            Applicant applicant = new Applicant(name, post, age);
            Validator.validate(applicant);
        } catch (CatheyBankException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
