package com.learning.core.day9;
import java.util.*;

public class D09P01 {
	public static int partition(int arr[],int low,int high) {
		int pivot=arr[low];
		int start=low;
		int end=high;
		
		while(start<end) {
			start=start+1;
			
			while(start<=high && arr[start]<pivot) {
				start++;
			}
			
			while(end>=low && arr[end]>pivot) {
				end--;
			}
			if(start<end) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		int temp=arr[low];
		arr[low]=arr[end];
		arr[end]=temp;
		return end;
	}
	public static void quicksort(int arr[],int low,int high) {
		int loc;
		if(low<high) {
			loc=partition(arr,low,high);
			quicksort(arr,low,loc-1);
			quicksort(arr,loc+1,high);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		quicksort(arr,0,n-1);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
