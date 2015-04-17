import javax.swing.JOptionPane;


public class GuessANumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
boolean gameNotOver = true;
		
		while (gameNotOver){
			RandomNumber  result = new RandomNumber();
			
			int var1 = result.GetANumber();
			int var2 = result.GetANumber();
			int var3 = result.GetANumber();
			
			
			JOptionPane.showMessageDialog (null, "Three vars are: "  + var1 + ","
			                                 + var2  + ", and " +  var3 + ".");
			
			String guessAgain = println (null,
					             "Do you like to show another random number? \n" +
			                     "Enter 1 for Yes and 2 for No.");
			
			
			if(guessAgain.equals("2")){
				gameNotOver = false;
			}
			
		}

	}

	private static String println(Object object, String string) {
		// TODO Auto-generated method stub
		return null;
	  }

	}


