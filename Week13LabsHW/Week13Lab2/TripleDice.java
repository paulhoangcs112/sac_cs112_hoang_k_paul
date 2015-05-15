public class TripleDice extends Dice {
	int numberCC, pee;
	int ktotal;
	
	public TripleDice (int gonum, int six ){
		numberCC = gonum;
		pee = six;
	}
	
	@Override
	public int RollDice(){
		ktotal += numberCC;
		return (numberCC + (int) (Math.random() * pee * numberCC));
	}
	
	public int RollCountMore(){
		return ktotal;
		
	}
	
	public int reset(){
		ktotal = 0;
		return ktotal;
	}
	

}
