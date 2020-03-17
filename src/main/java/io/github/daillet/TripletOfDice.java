package io.github.daillet;

public class TripletOfDice {
	
	private int sides_number;
	private int first_die;
	private int second_die;
	private int third_die;
	
	public TripletOfDice(int sides_number) {
		this.sides_number = sides_number;
	}
	
	public void rollAllDice() {
		 first_die = (int)(Math.random() * sides_number) + 1;
		 second_die = (int)(Math.random() * sides_number) + 1;
		 third_die = (int)(Math.random() * sides_number) + 1;
	}
	
	public void rollOneDie(int dieNumber) {
		switch(dieNumber) {
		  case 1:
			first_die = (int)(Math.random() * sides_number) + 1;
		    break;
		  case 2:
			second_die = (int)(Math.random() * sides_number) + 1;
		    break;
		  case 3:
			third_die = (int)(Math.random() * sides_number) + 1;
			break;
		  default:
			throw new IllegalArgumentException("Attention, veuillez saisir un numéro de dé allant de 1 à 3 compris.");
		}
	}
	
	public int getFirstDie() {
		return first_die;
	}
	
	public int getSecondDie() {
		return second_die;
	}
	
	public int getThirdDie(){
		return third_die;
	}
	
}
