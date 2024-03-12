package com.learning.core.day7;

import java.util.Scanner;
import java.util.Stack;

public class D07P05 {
    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, temp);
        }
    }

    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, item);
            stack.push(temp);
        }
    }
    public static void printStack(Stack<Integer> stack) {
    	for (Integer item : stack) {
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        scanner.close();

        String[] elements = input.split("\\s+");
        Stack<Integer> stack = new Stack<>();
        for (String element : elements) {
            stack.push(Integer.parseInt(element));
        }
        reverseStack(stack);
        printStack(stack);
    }
}
