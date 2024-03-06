package com.learning.core.day3;
import java.util.Scanner;

public class D03P04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		
		int[] nums=new int[n];
		System.out.println("Enter input");
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		sc.close();
		
		int index=repeatingElement(nums);
		
		if(index!=-1) {
			System.out.println(index);
		}else {
			System.out.println("No repeating element");
		}
	}
	
	public static int repeatingElement(int[] nums) {
		int minindex=-1;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					minindex=j;
				}
			}
		}
		return minindex;
	}

}
