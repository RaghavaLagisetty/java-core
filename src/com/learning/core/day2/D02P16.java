package com.learning.core.day2;
import java.util.Scanner;

public class D02P16 {
	static int fib(int num) {
		if(num<=1) {
			return num;
		}else {
			return fib(num-1)+fib(num-2);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.print(fib(i)+" ");
		}
		sc.close();
		
	}
}
