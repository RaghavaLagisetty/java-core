package com.learning.core.day10;

import java.io.*;
import java.util.Scanner;

public class D10P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to write to file: ");
        String input = scanner.nextLine();
        writeFile("io.txt", input);
        showFileSize("io.txt");
        System.out.println("Contents of the file:");
        readAndDisplayFileContents("io.txt");
        deleteFile("io.txt");

        scanner.close();
    }

    private static void writeFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("String successfully written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void showFileSize(String fileName) {
        File file = new File(fileName);
        long fileSize = file.length();
        System.out.println("Size of the file '" + fileName + "': " + fileSize + " bytes");
    }

    private static void readAndDisplayFileContents(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File '" + fileName + "' deleted successfully.");
        } else {
            System.out.println("Failed to delete file '" + fileName + "'.");
        }
    }
}

