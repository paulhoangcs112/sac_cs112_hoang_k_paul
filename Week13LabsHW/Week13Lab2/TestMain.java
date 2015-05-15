
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Static roll
		
		System.out.println(Dice.RollOtherDice());
		System.out.println(Dice.RollDice(2, 6));
		
		//public roll
		
		Dice Object = new Dice();
		System.out.println( Object.RollDice());
		System.out.println( Object.RollDice());
		System.out.println( Object.RollDice());
		System.out.println( Object.RollDice());
		System.out.println( Object.RollDice());
		System.out.println( Object.RollDice());
		System.out.println( Object.RollDice());
		System.out.println( Object.RollDice());
		System.out.println( Object.RollDice());
		System.out.println( Object.RollDice());
		
		//Dice roll counter to display
		
		System.out.println ("Static dice count is \t" + Dice.RollCount());
		System.out.println ("Static dice count is \t" + Object.RollCountAgain());
		
		//implement class TripleDice and test program
		
		TripleDice nobject = new TripleDice(3,6);
		System.out.println("Override and the TripleDice value is \t" + nobject.RollDice());
		System.out.println("TripleDice count is\t" + nobject.RollCountMore());
		System.out.println("Program to reset TripleDice rolled\t" + nobject.reset());
		
		for (int i :Object.RollHistoryArr()){
			System.out.println (i);
		}
		
		

	}

}
