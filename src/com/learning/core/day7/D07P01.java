package com.learning.core.day7;

public class D07P01 {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public D07P01(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String value) {
        if (isFull()) {
            System.out.println("Stack is full.");
            return;
        }
        stackArray[++top] = value;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
    public void display() {
    	for(int i=0;i<=top;i++) {
    		System.out.print(stackArray[i]+" ");
    	}
    }

    public static void main(String[] args) {
    	D07P01 st = new D07P01(5);

    	st.push("Hello");
        st.push("world");
        st.push("java");
        st.push("Programming");

        System.out.print("After pushing 4 elements: ");
        st.display();
        System.out.println();
        System.out.print("After a pop: ");
        st.pop();
        st.display();
    }
}

