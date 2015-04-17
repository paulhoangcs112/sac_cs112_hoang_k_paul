
public class RandomNumber {
	
	private int LoHop, HiHop;
	
	public RandomNumber() {
		
		LoHop = 1;
		HiHop = 10;
	}

	public RandomNumber(int lo, int hi){
		
		LoHop = 1;
		HiHop = 6;
		
	}
	
	public int GetANumber_Between_1_and_10() {
		 int number = 1 + (int)(Math.random( ) * 10);
		 return number;
	}
	
	public int GetANumber (int lo, int hi){
		int number = lo + (int)(Math.random( ) * hi);
		 return number;
	}
	
	public int GetANumber(){
		int number = LoHop + (int)(Math.random() * HiHop);
		return number;
	}
	
	
}