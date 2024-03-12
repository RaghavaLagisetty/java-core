package com.learning.core.day7;

import java.util.Scanner;
import java.util.Stack;

public class D07P07 {
    public static boolean isTopEven(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return false;
        }

        int top = stack.peek();
        return top % 2 == 0; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String[] elements = input.split("\\s+");
        Stack<Integer> stack = new Stack<>();
        for (int i = elements.length - 1; i >= 0; i--) {
            stack.push(Integer.parseInt(elements[i]));
        }
        boolean isTopEvenNumber = isTopEven(stack);
        System.out.println(isTopEvenNumber);
    }
}
