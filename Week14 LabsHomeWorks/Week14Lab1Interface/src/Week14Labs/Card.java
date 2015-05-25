package Week14Labs;

import java.util.ArrayList;
import java.util.Random;

public class Card implements Week14Labs{
	
	private int card;
	private ArrayList < Integer > hist;
	public static final Random rand = new Random();
	
	public Card (int d){
		
		card = d;
		
		hist = new ArrayList < Integer > ();
	}
	
	public Card(){
		this(1);
	}
	
	@Override
	public int getGeneratedRandomNumber(){
		int number = rand.nextInt (52 * card) +1;
		this.hist.add(number);
		return number;
		
	}
	
	@Override
	public String getHistory(){
		String history = "";
		for (int roll : hist){
			history += roll + ",";
		}
		return history;
	}
	
	
	

}
