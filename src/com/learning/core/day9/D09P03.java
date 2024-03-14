package com.learning.core.day9;
import java.util.Scanner;
public class D09P03 {
	public void search(int[] arr,int key) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				flag=true;
				System.out.println("Element is Present");
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element is not Present");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		D09P03 l=new D09P03();
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int key=sc.nextInt();
		l.search(arr, key);
	}

}
