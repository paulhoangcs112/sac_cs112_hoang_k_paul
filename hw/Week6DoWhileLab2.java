import java.util.Scanner;

public class Week6DoWhileLab2 {

public static void main(String[] args) {

Scanner input = new Scanner( System.in );

int player1;
int player2;
int time = 0;

do {
    player2 = 0 + ( int) ( Math.random() * 10 );
       System.out.println ("Enter a number between 0 and 10");

       player1 = input.nextInt();
           System.out.printf ("Random number is %d\n", player2 );
 if (player1 > player2) {
     System.out.println ("Too big");time++;
    }

 else if (player1 < player2) {
         System.out.println ("Too Small");time++;
    }

else { 
       System.out.println ("Match");time++;

     }

    }
while (time<3);
       System.out.println("Bye!");

    }
}