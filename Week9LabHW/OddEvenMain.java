import java.util.Scanner;
public class OddEvenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		
		int numCount = 0;
		int oddNum = 1;
		int evenNum = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Welcome to Odd/Even\n ");
		System.out.print("Enter numbers to count: ");
		
		numCount = input.nextInt();
		int [] numbers = new int[20];
		
		System.out.println ("Enter numbers to count: ");
		numCount = input.nextInt();
		
		for (int i =0; i < numCount; i++ ){
			numbers [i] = input.nextInt();
			
			if(numCount %2 == 0){
				
				evenNum++;
				
			}
			
			else{
				
				oddNum++;
			
			}
		}
		
		System.out.println (" Total Odd number entered :" + oddNum);
		
		System.out.println (" Total Even number entered :" + evenNum);
		
		System.out.print(" Thank you for particiapate");
		
	}

}
