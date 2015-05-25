
public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first, there are two Args
		
		if (args.length !=2){
			throw new IllegalArgumentException ("Exactly 2 parameters required !");
			
		}
		
		int firstArgInt;
		int secondArgInt;
		
		//verify all args are integers
		
		try{
			
			firstArgInt = Integer.parseInt (args [0]);
		} 
		
		catch (NumberFormatException nbfe){
			
			// 2 possible solutions: throw an exception, or assign a default value
			// throw new IllegalArgumentException ( "first arg must be an integer")
			// firstArg = 42;
		}
		
		try {
			
			secondArgInt = Integer.parseInt(args[1]);
		}
		
		catch (NumberFormatException nbfe) {
			//same as above
		}
		
		//Etc.

	}

}
