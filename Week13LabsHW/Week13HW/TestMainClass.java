
public class TestMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dice firstDice = new Dice (5,1);
		firstDice.Throw();
		System.out.println(firstDice); //call first.toString
		
		System.out.println();
		
		TripleDice threeDice = new TripleDice(1);
		threeDice.Throw();
		System.out.println(threeDice); // call threeDice.toString
		
		System.out.println();
		
		TripleDiceRecords threeDiceRecordsOne = new TripleDiceRecords(1);
		threeDiceRecordsOne.Throw();
		threeDiceRecordsOne.Throw();
		threeDiceRecordsOne.Throw();
		System.out.println (threeDiceRecordsOne); // Display threeDiceRecords.toString
		
		System.out.println();
		
		TripleDiceRecords threeDiceRecordsTwo = new TripleDiceRecords(1);
		threeDiceRecordsTwo.Throw();
		threeDiceRecordsTwo.Throw();
		threeDiceRecordsTwo.Throw();
		System.out.println (threeDiceRecordsTwo);
		
		if (threeDiceRecordsOne.equals (threeDiceRecordsTwo)){
			System.out.println ("Two TripleDiceRecords have equal values.");
		}
		
		System.exit(0);

	}

}
