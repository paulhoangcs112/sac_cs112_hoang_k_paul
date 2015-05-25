package Week14Labs;

import java.util.ArrayList;
import java.util.Random;


public class Dice implements Week14Labs {
	
	//declarations	
	private int dices;
	private ArrayList < Integer > hist;
	public static final Random rand = new Random();
	
	public Dice (int d){
		dices =d;
		hist = new ArrayList < Integer > ();
	}
	
	public Dice(){
		this(1);
	}
	
	// generate a random number and return it
	
	@Override
	public int getGeneratedRandomNumber(){
		int number = rand.nextInt(6 * dices) + 1;
		this.hist.add(number);
		return number;
	}
	
	//keep track of history and return
	
	@Override
	public String getHistory(){
		String history = "";
		for (int roll: hist){
			history += roll + ",";
		}
		
		return history;
	}
	

}
