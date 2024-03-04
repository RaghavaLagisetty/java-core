package com.learning.core.day2;
import java.util.Scanner;

public class D02P17 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	sc.close();
	int counter;
	for(int i=2;i<=n;i++) {
		counter=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				counter++;
			}
		}
		if(counter==2)
			System.out.print(i+" ");
	}
}
}
