package com.learning.core.day2;
import java.util.Scanner;

public class D02P01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int monthnum=sc.nextInt();
		sc.close();
		
		String monthname;
		
		switch(monthnum){
			case 1: monthname="January";
				break;
			case 2: monthname="February";
			break;
			case 3: monthname="March";
			break;
			case 4: monthname="April";
			break;
			case 5: monthname="May";
			break;
			case 6: monthname="June";
			break;
			case 7: monthname="July";
			break;
			case 8: monthname="August";
			break;
			case 9: monthname="September";
			break;
			case 10: monthname="October";
			break;
			case 11: monthname="November";
			break;
			case 12: monthname="December";
			break;
			default :monthname="Inavlid input";
					break;
			
		}
		System.out.println(monthname);
		
	}

}
