package com.learning.core.day10;

import java.io.*;

public class D10P06 {
    public static void main(String[] args) {
        String combinedNotes = combineNotes("DavidEnglish.txt", "DavidScience.txt", "DavidComputers.txt");
        System.out.println(combinedNotes);
        writeToFile(combinedNotes, "DavidNotes.txt");
    }

    private static String combineNotes(String englishFile, String scienceFile, String computerFile) {
        StringBuilder cN = new StringBuilder();
        try (BufferedReader english = new BufferedReader(new FileReader(englishFile));
             BufferedReader science = new BufferedReader(new FileReader(scienceFile));
             BufferedReader computer = new BufferedReader(new FileReader(computerFile))) {

            String line;
            
            while ((line = english.readLine()) != null) {
                cN.append(line).append("\n");
            }
            cN.append("\n");

            
            while ((line = science.readLine()) != null) {
                cN.append(line).append("\n");
            }
            cN.append("\n");

            
            while ((line = computer.readLine()) != null) {
                cN.append(line).append("\n");
            }
            cN.append("\n");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
        return cN.toString();
    }

    private static void writeToFile(String content, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
