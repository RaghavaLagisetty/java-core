package com.learning.core.day8;

class Node1{
	int value;
	Node1 next;
	
	public Node1(int value) {
		this.value=value;
		this.next=null;
	}
}

public class D08P02 {
	Node1 front , rear;
	
	public void enqueue(int data) {
		if(front==null) {
			rear=new Node1(data);
			front=rear;
		}else {
			Node1 newNode=new Node1(data);
			rear.next=newNode;
			rear=newNode;
		}
	}
	
	public int dequeue() {
		int res;
		if(front==null) {
			System.out.println("queue is empty");
			return -1;
		}else {
			res=front.value;
			front=front.next;
			return res;
		}
	}
	
	public void display() {
	    Node1 temp = front;
	    while (temp != null) {
	        System.out.print(" " + temp.value);
	        temp = temp.next;
	    }
	    System.out.println();
	}

	public static void main(String[] args) {
		D08P02 q=new D08P02();
		q.enqueue(89);
		q.enqueue(99);
		q.enqueue(109);
		q.enqueue(209);
		q.enqueue(309);
		
		System.out.print("Elements in queue:");
		q.display();
		
		q.dequeue();
		q.dequeue();
		System.out.print("After removing two elements:");
		q.display();
		
		
	}

}
