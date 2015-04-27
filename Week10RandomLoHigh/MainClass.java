import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;
		boolean guessRight;
		int number, guess = 1;
		
		RandomNumber r = new RandomNumber ();
		r.SetHighNumber (9);
		r.SetLowNumber(1);
		r.GetANumber ();
		
		guessRight = false;
		System.out.println ("Between 1-10: you have 3 chances to guess it! what's your number? ");
		
		Scanner gNumber = new Scanner (System.in);
		
		do{
			number = gNumber.nextInt ();
			if (number == r.reslt){
				
				{
				guessRight = true;
				System.out.println("Brillant guessed!");
				break;
				}
			}
				
				else {
					if (number > r.reslt && guess < 3 ){
						System.out.printf (" Guesses too high,  you have guess %s time(s) !\n", guess );
					
				}
					
					else if (number < r.reslt && guess < 3 ){
						System.out.printf (" Guesses too low,  you have guess %s time(s) !\n", guess );	
					}
					
					else{
						System.out.println (" No more guess for you...,  right number is "+r.reslt+". Game over!");
					}
				guess ++;
		    	}
			
		   }while (guessRight = false || guess < 4);
		
		}
		
		

	}


