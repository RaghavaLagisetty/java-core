package com.learning.core.day8;

public class D08P01 {
    private int front, rear, size;
    private int[] queue;

    public D08P01(int size) {
        this.size = size;
        this.front = 0;
        this.rear = -1;
        this.queue = new int[size];
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full." + item);
            return;
        }
        rear = (rear + 1) % size;
        queue[rear] = item;
    }
    public int dequeue() {
    	if(isEmpty()) {
    		System.out.println("Queue is empty");
    		return -1;
    	}else if(front==rear){
    		int top=queue[front];
    		front=rear=-1;
    		return top;
    	}else {
    		int top=queue[front];
    		front++;
    		return top;
    	}
    }

    public boolean isEmpty() {
        return (rear == -1);
    }

    public boolean isFull() {
        return (rear==size-1);
    }

    public void display() {
    	for(int i=this.front;i<=this.rear;i++) {
    		System.out.print(queue[i]+" ");
    	}
    }

    public static void main(String[] args) {
    	D08P01 queue = new D08P01(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
    	
    	
        System.out.print("Elements in Queue: ");
        queue.display();
        System.out.println();
        queue.dequeue();
        System.out.print("After removing first element: ");
        queue.display();
    }
}
