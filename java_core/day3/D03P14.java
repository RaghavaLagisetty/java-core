package com.learning.core.day3;
import java.util.Arrays;
import java.util.Scanner;

public class D03P14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size1 = scanner.nextInt();
        
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
         
        int size2 = scanner.nextInt();
        
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        
        int[] union = findUnion(arr1, arr2);
        int[] intersection = findIntersection(arr1, arr2);
        
        
        System.out.println("Union: " + Arrays.toString(union));
        System.out.println("Intersection: " + Arrays.toString(intersection));
        
        scanner.close();
    }
    
    public static int[] findUnion(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] union = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                union[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                union[k++] = arr2[j++];
            } else {
                union[k++] = arr1[i++];
                j++;
            }
        }
        
        while (i < n1) {
            union[k++] = arr1[i++];
        }
        
        while (j < n2) {
            union[k++] = arr2[j++];
        }
        
        return Arrays.copyOf(union, k);
    }
    
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] intersection = new int[Math.min(n1, n2)];
        int i = 0, j = 0, k = 0;
        
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                intersection[k++] = arr1[i++];
                j++;
            }
        }
        
        return Arrays.copyOf(intersection, k);
    }
}

