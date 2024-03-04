package com.learning.core.day2;
import java.util.Scanner;

public class D02P12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter no.of rows");
		int row=sc.nextInt();
		
		for(int i=row-1;i>=0;i--) {
			for(int j=row-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
		
	}

}
