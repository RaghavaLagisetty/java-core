package com.learning.core.day4;
import java.util.Scanner;

class NotEligibleException extends Exception{
	public NotEligibleException(String message) {
		super(message);
	}
}

class CricketRating{
	private String playerName;
	private float critic1;
	private float critic2;
	private float critic3;
	private float avgRating;
	private String coins;
	
	public CricketRating(String playerName,float critic1,float critic2) {
		this.playerName=playerName;
		this.critic1=critic1;
		this.critic2=critic2;
		calculateAverageRating(critic1,critic2);
		calculateCoins();
	}
	
	public CricketRating(String playerName,float critic1,float critic2,float critic3) {
		this.playerName=playerName;
		this.critic1=critic1;
		this.critic2=critic2;
		this.critic3=critic3;
		calculateAverageRating(critic1,critic2,critic3);
		calculateCoins();
	}
	
	public void calculateAverageRating(float critic1,float critic2) {
		avgRating=(critic1+critic2)/2;
	}
	
	public void calculateAverageRating(float critic1,float critic2,float critic3) {
		avgRating=(critic1+critic2+critic3)/3;
	}
	
	public String calculateCoins() {
		if(avgRating>=7) {
			coins="gold";
		}else if(avgRating>=5 && avgRating<=7) {
			coins="silver";
		}else if(avgRating>=2 && avgRating<=5) {
			coins="copper";
		}else {
			coins="NotEligible";
		}
		return coins;
	}
	public void display() {
		System.out.println(playerName+ " "+String.format("%.2f",avgRating)+" "+coins);
	}
}

public class D04P02 {
	public static void main(String[] args) throws NotEligibleException {
		Scanner sc=new Scanner(System.in);
		String playerName=sc.nextLine();
		float critic1=sc.nextFloat();
		float critic2=sc.nextFloat();
		float critic3=0;
		if(sc.hasNextFloat()) {
			critic3=sc.nextFloat();
		}
		
		
			if(critic3!=0) {
				CricketRating player=new CricketRating(playerName,critic1,critic2,critic3);
				player.display();
			}else {
				CricketRating player=new CricketRating(playerName,critic1,critic2);
				player.display();
			}
		
		sc.close();
	}
}
