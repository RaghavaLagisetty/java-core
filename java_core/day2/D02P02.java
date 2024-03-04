package com.learning.core.day2;
import java.util.Scanner;

public class D02P02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		sc.close();
		
		for(int i=2;i<=num;i+=2) {
			System.out.println(i+" ");
		}
		
	}

}
