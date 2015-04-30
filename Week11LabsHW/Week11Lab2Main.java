
public class Week11Lab2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Week11Lab2 dice;
		dice = new Week11Lab2();
		
		do{
			dice.Throw();
			
			System.out.println (" You rolled " + dice.Value1()
					+ " and " + dice.Value2());
		}
		
		while(dice.getTotal() ==0);{
			
			System.out.println (" Total " + dice.getTotal());
		}
		

	}

}
