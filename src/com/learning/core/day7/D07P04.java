package com.learning.core.day7;

import java.util.Stack;
import java.util.Scanner;

public class D07P04 {
    public static int evaluateExpression(String expression) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int currentNumber = 0;
        char operation = '+';

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            }
            if (!Character.isDigit(ch) && ch != ' ' || i == expression.length() - 1) {
                if (operation == '+') {
                    stack.push(currentNumber);
                } else if (operation == '-') {
                    stack.push(-currentNumber);
                } else if (operation == '*') {
                    stack.push(stack.pop() * currentNumber);
                } else if (operation == '/') {
                    stack.push(stack.pop() / currentNumber);
                }
                operation = ch;
                currentNumber = 0;
            }
        }
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        int result = evaluateExpression(input);
        System.out.println(result);
    }
}
