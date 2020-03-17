package io.github.daillet;

import java.util.Scanner;

public class DiceUser {
	
	public static TripletOfDice rollOnce() {
		
		TripletOfDice triplet = new TripletOfDice(6);
		triplet.rollAllDice();
		return triplet;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TripletOfDice x = rollOnce();
		
		System.out.println("The die number 1 is a "+x.getFirstDie());
		System.out.println("The die number 2 is a "+x.getSecondDie());
		System.out.println("The die number 3 is a "+x.getThirdDie());
		

	}
	
}
