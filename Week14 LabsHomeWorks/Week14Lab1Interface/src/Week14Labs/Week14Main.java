package Week14Labs;

public class Week14Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create two element array for interface
		
		Week14Labs[] interfaceObjects = new Week14Labs[2];
		
		//populate array with objects that implement interface
		interfaceObjects[1] = new Dice(1);
		interfaceObjects[2] = new Card(2);
		
		for (Week14Labs currentValue:interfaceObjects){
			
				
		System.out.printf ("The value of dice is: %d", currentValue.getGeneratedRandomNumber());
		System.out.println ("the history of the dice is");
		currentValue.getHistory();
		
		System.out.printf ("The value of card is: %d", currentValue.getGeneratedRandomNumber());
		System.out.println ("the history of the card is");
		currentValue.getHistory();
		}

	}

}
	
