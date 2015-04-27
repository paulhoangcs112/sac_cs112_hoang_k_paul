import java.util.Random;

public class RandomNumber {
	Random random = new Random();
	int reslt, low, high, lowBoundary, upperBoundary;
	 
	public int GetANumber(){
	
	reslt = random.nextInt(9) + 1;
		return reslt;

       }
  
	 public int GetANumber (int upperBoundary){
		 reslt = random.nextInt (upperBoundary) + 1;
		 return reslt;
	    }
	 
	 public int GetANumber ( int upperBoundary, int lowBoundary){
		 reslt = random.nextInt (upperBoundary-lowBoundary) + lowBoundary;
		 return reslt;
	   }
	 
	 public int SetHighNumber (int high){
		 upperBoundary = high; 
		 return upperBoundary;
	    }
	 public int SetLowNumber (int low){
		 lowBoundary = low;
		 return lowBoundary;
	   }

		
	}
  
