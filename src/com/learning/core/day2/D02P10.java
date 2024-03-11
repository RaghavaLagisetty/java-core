package com.learning.core.day2;
import java.util.Scanner;

public class D02P10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the input");
		int num=sc.nextInt();
		
		
		int revnum=reverseInteger(num);
		
		System.out.println(revnum);
		
		sc.close();
	}

	public static int reverseInteger(int num) {
		int reversednum=0;
		while(num!=0) {
			int digit=num%10;
			reversednum=reversednum*10+digit;
			num/=10;
		}
		return reversednum;
	}
	

}
