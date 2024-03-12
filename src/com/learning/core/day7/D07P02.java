package com.learning.core.day7;

class Node {
    double data;
    Node next;

    Node(double data) {
        this.data = data;
        this.next = null;
    }
}

public class D07P02 {
    private Node top;

    public D07P02() {
        this.top = null;
    }

    public void push(double data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            top = top.next;
        }
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        D07P02 stack = new D07P02();
        String input = "10.0 20.0 30.0 40.0";
        String[] elements = input.split(" ");
        for (String element : elements) {
            stack.push(Double.parseDouble(element));
        }
        System.out.print("The elements of the stack are: ");
        stack.display();

        System.out.print("After popping twice: ");
        stack.pop();
        stack.pop();
        stack.display();
    }
}

