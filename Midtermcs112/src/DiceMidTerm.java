import java.util.Scanner;

public class DiceMidTerm {

	int dice;
	int playerPoints, computerPoints;
	int playerPointsT = 0;
	int computerPointsT  = 0;
	Boolean playerTurn = true;
	Boolean computerTurn = true;
	
	public void roll(){
		dice = (int) (Math.random () * 6) + 1;
	}
	
	public int playerPoints()
	{
		
		{
			playerPoints = dice + playerPoints;
			System.out.println (" Player game: " + dice);
			System.out.println ( "Score of Player: " + playerPoints + " Player turn.");
			
		}    return playerPoints;
	}
	public void playerTurnZero()
	{
		playerPoints = 0;
		
	}
	public int computerPoints(){
		
		{
			computerPoints = dice + computerPoints;
			System.out.println ("Scored of Computer: " + computerPoints + " Computer turn.");
		} return computerPoints;
	}
	
	public void computerturnZero(){
		computerPoints = 0;
		
	}
	
	public DiceMidTerm (){
		
	    playerGame ();
	    if (!playerTurn)
	    {
	      computerTurn();
	    }
	}
	
	public int playerGame(){
		System.out.println ("Press  'r' to start the game. ");
		Scanner enter = new Scanner (System.in);
		String start = enter.nextLine();		
	    if (!start.equalsIgnoreCase("R"))	
	    		
	    	{
	    	 System.out.println ("Please enter 'r' ");
	    	  playerGame();
	    	 }
	    
	    if (start.equalsIgnoreCase("R")){
	    	
	    	System.out.println ("Player enter 'r' ");
	    	System.out.println ("let begin");
	    	
	    	do{
	    		roll();
	    		
	    		if (dice == 1) {
	    			
	    			System.out.println (" Player got 1 and palyer lost, player turn");
	    			System.out.println ("computer 's Total Score is: " + computerPointsT);
	    			playerTurnZero();
	    			computerTurn();
	    			
	    		}
	    		else if (dice != 1)
	    		{
	    			playerPointsT += dice;
	    			if(playerPointsT >= 60) 
	    				{	
	    				System.out.println ("Player threw: " + dice);
	    				System.out.println ("Player totl score is: " + playerPointsT);
	    				System.out.println (" WOW! you win !");
	    				System.exit((0);
	    				}
	    						
	    			playerPoints();
	    			System.out.println ("Player total score is: " + playerPointsT);
	    			System.out.println ("computer 's Total Score is: " + computerPointsT);
	    		    System.out.println ("Player can hold or roll again");
	    		    System.out.println (" To roll again press 'r' or 'h' to hold.");
	    		    Scanner keyboard = new Scanner (System.in);
	    		    String select = keyboard.nextLine();
	    		    
	    		    if (select.equalsIgnoreCase("R"))
	    		    	
	    		    { 
	    		    	System.out.println (" Player enter 'r");
	    		        System.out.println (" Please roll again.");
	    		        roll();
	    		        
	    		        if (!select.equalsIgnoreCase ("R"))
	    		        	
	    		        {
	    		          System.out.println ("player did not enter 'r' .  to make sure game runs correct, please enter 'r' to roll or 'h' to hold");
	    		          playerGame();
	    		        }
	    		    		
	    		    }
	    		    
	    		    if (select.equalsIgnoreCase("h"))
	    		    {
	    		    	System.out.println (" Player eneter 'h' and loose turn");
	    		    	System.out.println ("Player total is: + palyerPointsT");
	    		    	playerTurnZero();
	    		    	computerTurn();
	    		    	
	    		    }
	    		
	    	    	
	    }
	    
	    	