package io.github.daillet;

/**
 * This class represent a triplet of dice. We can defines the number of sides of the dice.
 * 
 */
public class TripletOfDice {
	
	private int sides_number;
	private int first_die;
	private int second_die;
	private int third_die;
	
	public TripletOfDice(int sides_number) {
		this.sides_number = sides_number;
	}
	
	/**
     * method for roll all dice
     * 
     */
	public void rollAllDice() {
		 first_die = (int)(Math.random() * sides_number) + 1;
		 second_die = (int)(Math.random() * sides_number) + 1;
		 third_die = (int)(Math.random() * sides_number) + 1;
	}
	
	/**
     * method for roll one dice who is specify in parameters
     * 
     * @param dieNumber <code>not null</code>
     */
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
	
    /**
     * @return the first die
     */
	public int getFirstDie() {
		return first_die;
	}
	
    /**
     * @return the second die
     */
	public int getSecondDie() {
		return second_die;
	}
	
    /**
     * @return the third die
     */
	public int getThirdDie(){
		return third_die;
	}
	
}
