import java.util.Scanner;

public class RockPaperSci {

public static void main (String[]args){

   Scanner game = new Scanner(System.in);

   System.out.print("Player1 Select:  rock, scissors , or paper:");

   String player1 = game.next().toLowerCase();

   System.out.print("Player2 Select:  rock, scissors , or paper:");

   String player2 = game.next().toLowerCase();
   
           if (player1.equals (player2))
          {
             System.out.println("It is a tie game");
          }
          else {
             
           {      
          	System.out.println( " You won the game! ");     
          	System.out.println (" Do you want to play again? ");
             }
          }
      }
   }
         
   
