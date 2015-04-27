/* week10 Labx2
 * Implement class RandomNumber
 * - with a Method
 *     - GetANumber (int high)
 *     return a number o and high
 *     Use the RandomNumber class in the GuessANumber program
 */

import java.util.Random;

public class Week10LabX2RandomNum {
	
	private int myNum;
	
	public int GetANumber (int high){
	
		myNum =  0 + (int) (Math.random() * 20);  // can be any high number that you design
		
		return myNum;
	}
	
	// try this main class or can try other (below)
	/*
	public static void main (String [] args){
		
		Week10LabX2RandomNum R = new Week10LabX2RandomNum();
		
		int myNum = R.GetANumber(22);
		
		System.out.println ("MyNum");
	 */
	
	public static void main (String [] args){
		
		Week10LabX2RandomNum R = new Week10LabX2RandomNum();
		
		R.GetANumber(22);
		System.out.println ("MyNum");
		
	}
				
	}



