package com.learning.core.day2;
import java.util.Scanner;

public class D02P14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a num value");
		int num=sc.nextInt();
		
		System.out.println("Enter a power value");
		int pow=sc.nextInt();
		int res=1;
		
		while(pow!=0) {
			res*=num;
			pow--;
		}
		System.out.println(res);
		sc.close();
	}

}
