package com.learning.core.day3;
import java.util.Scanner;

public class D03P02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] nums=new int[5];
		System.out.println("Enter 5 numbers:");
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
		}
		
		System.out.println("Enter the num1:");
		int num1=sc.nextInt();
		System.out.println("Enter the num2");
		int num2=sc.nextInt();
		
		boolean fnum1=false;
		boolean fnum2=false;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==num1) {
				fnum1= true;
			}
			if(nums[i]==num2) {
				fnum2=true;
			}
		}
		
		if(fnum1 && fnum2) {
			System.out.println("Bingo");
		}else {
			System.out.println("Not found");
		}
		sc.close();
	}

}
