public class Dice {
	static int total = 0;
	int htotal = 0;
	int bozo [] = new int[10];
	int x = 0;
	
	static int RollDice(int numberOfDice, int sideOfDice){
		total += numberOfDice;
		
		//number of dices
		return ( 1 * numberOfDice + (int) (Math.random() * sideOfDice * numberOfDice));
	}
	
	public int RollDice(){
		htotal++;
		bozo [x] = (1 + (int) (Math.random() * 6 ));
		return bozo[x++];
		
	}
	
	static int RollOtherDice(){
		total++;
		return 1 + (int) (Math.random() * 6 );
	}
	
	static int RollCount(){
		return total;
	}
	
	public int RollCountAgain(){
		return htotal;
	}
	
	public int [] RollHistoryArr(){
		return bozo;
		
	}

}
