package com.learning.core.day8;
import java.util.Scanner;

class Node {
    String value;
    Node next;

    public Node(String value) {
        this.value = value;
        this.next = null;
    }
}

public class D08P04 {
    Node front, rear;

    public void enqueue(String data) {
        if (front == null) {
            rear = new Node(data);
            front = rear;
        } else {
            Node newNode = new Node(data);
            rear.next = newNode;
            rear = newNode;
        }
    }

    public String dequeue() {
        String res;
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        } else {
            res = front.value;
            front = front.next;
            return res;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
    	D08P04 queue = new D08P04();
        Scanner scanner = new Scanner(System.in);
     
        String input = scanner.nextLine();
        scanner.close();
        if (input.equals("[]")) {
            System.out.println("Empty");
            return;
        }
        String[] elements = input.split(" ");
        for (String element : elements) {
            queue.enqueue(element);
        }

        if (queue.isEmpty()) {
            System.out.println("Empty");
            return;
        }else {
        	System.out.println("Not empty");
        }
    }
}
