package com.learning.core.day7;
import java.util.Stack;
import java.util.Scanner;

public class D07P06 {
    public static int findMin(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; 
        }

        int min = stack.peek(); 
        for (Integer element : stack) {
            if (element < min) {
                min = element;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[] ele = input.split(" ");
        Stack<Integer> stack = new Stack<>();
        for (String element : ele) {
            stack.push(Integer.parseInt(element));
        }

        int minEle = findMin(stack);
        if (minEle != -1) {
            System.out.println(minEle);
        }
    }
}
