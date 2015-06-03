import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner UserInput = new Scanner(System.in);
		int HoldUser_Input;
		int DiceValue;
		int Continue = 1;
		int win = 0;
		int lose = 0;
		
		while (Continue !=0)
		{
			System.out.print("Guess what the number is...");
			HoldUser_Input = UserInput.nextInt();
			DoubleDice MakeNumObject = new DoubleDice();
			// make variable to hold this number
			
		
		
			DiceValue = MakeNumObject.GetValue();
			
			System.out.print("You rolled a ");
			System.out.println(DiceValue);
			if (DiceValue == HoldUser_Input)
			{
				win++;
			}
			else lose++;
			System.out.print("Would you like to continue? (1=yes 0 = no) ");
			Continue = UserInput.nextInt();
		}
		
		System.out.print("Your total wins are: ");
		System.out.println(win);
		System.out.print("Your total losses are: ");
		System.out.println(lose);
		
		
		
	//THis is for the BLACK JACK GAME

		int UserBlackJack[] = new int[3];
		int ComputerBlackJack[] = new int[3];
		int WinsBlackJack=0;
		int LoseBlackJack=0;
		int TieBlack = 0;
		int ContinueBlack = 1;
		while (ContinueBlack != 0)
		{
		System.out.println("Time For Black Jack ");
		
		
		//make variable to store 3 numbers added
		int TotalUser = 0;
		int TotalComputer = 0;
		
		//loop to store 3 numbers into array user
		Card CardObject = new Card();

		for (int i=0; i<3; ++i)
		{
			UserBlackJack[i] = CardObject.RandomNumber();
			System.out.print("The User got the following cards: ");
			System.out.println(UserBlackJack[i]);
			TotalUser += UserBlackJack[i];
		}
		//loop to store 3 number for computer 
		for (int i=0; i<3; ++i)
		{
			ComputerBlackJack[i] = CardObject.RandomNumber();
			System.out.print("The Computer got the following cards: ");
			System.out.println(ComputerBlackJack[i]);
			TotalComputer += ComputerBlackJack[i];
		}
		
	
		if (TotalUser>= TotalComputer && TotalUser<21)
		{
			WinsBlackJack++;
		}
		else if (TotalComputer>21 && TotalUser<21)
		{
			WinsBlackJack++;
		}
		else if (TotalComputer >21 && TotalUser > 21)
		{
			TieBlack++;
		}
		else LoseBlackJack++;
		
	//Ask user if they would like to continue
		System.out.print("Would you like to continue? (yes=1, no = 0): ");
		ContinueBlack = UserInput.nextInt();
	}
		
		System.out.print("The total wins in black jack are : ");
		System.out.println(WinsBlackJack);
		System.out.print("The total losses in black jack are : ");
		System.out.println(LoseBlackJack);
		System.out.print("The total ties in black jack are : ");
		System.out.println(TieBlack);
	}
}