import java.util.Scanner;

public class Week6ForLab {

    public static void main(String[] args) {
		Scanner inp = new Scanner( System.in );
		int userNum;
		int computerNum;
		for (int round = 1; round < 4; round++) {
			computerNum = 0 + (int) ( Math.random() * 10 );
			System.out.println ("Enter a number between 0 and 10");
			userNum = inp.nextInt();
			System.out.printf ("Random number is %d\n", computerNum );
			if (userNum > computerNum)		{
				System.out.println ("Too big");
			}
			else if (userNum < computerNum)		{
				System.out.println ("Too Small");
			}
			else		{
				System.out.println ("Match");
			}
		
		}
		
			
		
        System.out.println("Bye!");
    }

}
