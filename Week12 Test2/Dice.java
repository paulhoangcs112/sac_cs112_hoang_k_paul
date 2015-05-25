import javax.swing.JOptionPane;

public class Dice {
	
	private static int Hibound;
	private static int Lobound;
	
	//create constructor
	
	public Dice (int Hibound1, int Lobound1){
		Hibound = Hibound1;
		Lobound = Lobound1;
	}
	
	// Generate a random number between 1 to 6
	
	static int GetANumber (){
		int randomNum = 0;
		randomNum = 1 + (int)(Math.random() * 6  );
		return randomNum;
	}
	
	// Create method to check winner
	
	static boolean CheckUserWin (int usermove, int CNumber)
	{
		boolean userwins = false;
		if ((CNumber <= Lobound && usermove == 0)
		     || (CNumber <= Hibound && CNumber > Lobound && usermove == 1))
	    {
			userwins = true;
	    }
	
	    return userwins;
	 }
     
	//Create method to display a winner
	static void displaywinner (int usermove, boolean userwin)
	{
	
	if (userwin ==true)
	{
			
		if (usermove ==1)
		{
			JOptionPane.showMessageDialog(null,  "You win \n Both choose high");
		}
		
		else
		{
			JOptionPane.showMessageDialog(null,  "You win \n Both choose low");
		 }
	}
		
	else
	{
			if (usermove == 1)
			{
			
		    JOptionPane.showMessageDialog(null,  "Computer win \n you choose high \n computer choose low");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Computer Wins \n You choose Low\n Computer choose High"); 
		}
      }
	
	}
	
	public static void main (String [] args)
	
	{
	
		int Usermove = 0; 
 		int UserDiceSelection = 0; 
 		int computernumber = 0; 
 		boolean userwins = false; 
 		 
 		//User input for no of dice selection 
 		UserDiceSelection = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter\n1 if you want to play with one dice\n 2 if you want to play with two dice \n ")); 
 			 
 		//If user play with one dice 
 		if (UserDiceSelection == 1) 
 		{	 
 			Dice d1 = new Dice(6,3); 
 			computernumber = GetANumber(); 
 		} 
 		//If user play with two dice 
 		else if (UserDiceSelection == 2) 
 		{ 
 			Dice d1 = new Dice(12,6); 
 			computernumber = GetANumber() + GetANumber();  
 		} 
 		 
 		Usermove = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter\n1 For High\n 0 for Low \n ")); 
 		userwins = CheckUserWin(Usermove,computernumber); 
 		displaywinner(Usermove,userwins); 
 
 	 }
}
	
