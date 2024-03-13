package com.learning.core.day8;

public class D08P03 {
	int front=-1;
	int rear=-1;
	int n;
	int arr[];
	
	public D08P03(int n) {
		this.n=n;
		arr=new int[n];
	}
	
	public boolean isFull() {
		return ((rear+1)%n)==front;
	}
	
	public boolean isEmpty() {
		return front==-1 && rear==-1;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else if(isEmpty()) {
			rear=front=0;
			arr[rear]=data;
		}else {
			rear=(rear+1)%n;
			arr[rear]=data;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}else if(front==rear) {
			int top=arr[front];
			front=rear=-1;
			return top;
		}else {
			int top=arr[front];
			front=(front+1)%n;
			return top;
		}
	}
	
	public void dispay() {
		for(int i=this.front;i<=this.rear;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		D08P03 q=new D08P03(4);
		q.enqueue(14);
		q.enqueue(13);
		q.enqueue(22);
		q.enqueue(-8);
		
		System.out.print("Elements in circular queue:");
		q.dispay();
		System.out.println();
		q.dequeue();
		System.out.print("After removing first element:");
		q.dispay();
	}

}
