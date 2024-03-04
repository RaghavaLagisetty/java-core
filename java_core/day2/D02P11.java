package com.learning.core.day2;
import java.util.Scanner;

public class D02P11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the no.of rows");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			int k=i;
			for(int j=i;k>0;k--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
