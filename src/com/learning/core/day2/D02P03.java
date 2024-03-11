package com.learning.core.day2;
import java.util.Scanner;

public class D02P03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a num1");
		double num1=sc.nextDouble();
		
		System.out.println("Enter a num2");
		double num2=sc.nextDouble();
		
		System.out.println("Enter the operator");
		char oper=sc.next().charAt(0);
		sc.close();
		
		double result;
		
		switch(oper) {
		case '+' :result =num1+num2;
		break;
		case '-' :result =num1-num2;
		break;
		case '*' :result =num1*num2;
		break;
		case '/' :if(num2!=0) {
			result =num1/num2;
		}else {
			System.out.println("Error");
			return;
		}
		break;
		
		default:System.out.println("Inavlid");
		return;
		}
		System.out.println(result);
		
	}
}
