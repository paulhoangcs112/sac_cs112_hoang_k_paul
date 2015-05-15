//File Dice
public class Dice {
	int value;
	int myDices;
	int myBounces;
	
	public Dice (int dices, int bounces){
		value = 0;
		myDices = dices;
		myBounces = bounces;
	}
	
	public int Throw(){
		int total = 0;
		for (int i = 0; i < myDices; i++){
			
			int average = 0;
			for (int j = myBounces; j > 0; j--){
				average += (1 + (int) (Math.random() * 6 ));
				average /= myBounces;
				total += average;
			}
		}
		
		value = total;
		return value;
	}
	
	public int Value(){
		return value;
	}
	
	@Override
	
	public String toString(){
		return "Number of Dices: " + myDices
				+ "\nNumber of Bounces: " + myBounces
				+ "\nCurrent Value: " + value;
	}

} 
