
public class Week1Lab1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week11Lab1 dice;
		dice = new Week11Lab1();
		
		do{
			dice.Throw();
			System.out.println("Rolled " +  dice.Value1() +
					" and " +  dice.Value2());
		}
		
		while (dice.getTotal() %2 == 0);{
			
			System.out.println ("Dice rolled " + dice.getTotal());
		}

	}

}
