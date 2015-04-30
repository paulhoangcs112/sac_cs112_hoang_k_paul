
public class Week11Lab1 {
	
	int dice1;
	int dice2;
	static int sum;
	boolean evenum;
	
	public void Throw(){
		
		dice1 = 1 + (int) (Math.random() * 6);
		dice2 = 1 + (int) (Math.random() * 6);
		
	}
	
	public int Value1(){
		return dice1;
		
	}
	
	public int Value2(){
		return dice2;
	}
	
	public int getTotal(){
		return sum = dice1 + dice2;
		
	}
	
	public int OneDice(){
		return sum;
	}
	
	public static boolean isEven(){
		boolean evenum = false;
		if ((sum % 2) == 0){
			evenum = true;
		}
		return evenum; 
	}
		public void Throw(int dices, boolean even){
			do{
				for (int i = 0; i < dices; i++){
					sum +=dices;
				}
			}while (dices != sum);
		}
	}


