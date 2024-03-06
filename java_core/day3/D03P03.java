package com.learning.core.day3;
import java.util.Scanner;

public class D03P03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] nums=new int[18];
		System.out.println("Enter the input");
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<15;i++) {
			sum+=nums[i];
		}
		nums[15]=sum;
		
		double average=(double)sum/14;
		nums[16]=(int)average;
		
		int smallest=nums[0];
		for(int i=0;i<15;i++) {
			if(nums[i]<smallest) {
				smallest=nums[i];
			}
		}
		nums[17]=smallest;
		
		System.out.println("Output");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		sc.close();
	}

}
