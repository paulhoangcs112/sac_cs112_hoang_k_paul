import java.util.Arrays;

public class Week7Lab3Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arrayNumber;
		int i = 0;
		int sum = 0;  // calculate sum of all array elements
		arrayNumber = new int [6];
		
		arrayNumber [0] = 123;
		arrayNumber [1] = 456;
		arrayNumber [2] = 479;
		arrayNumber [3] = 135;
		arrayNumber [4] = 246;
		arrayNumber [5] = 135;
		
		Arrays.sort(arrayNumber);
				
		for (i =0; i < arrayNumber.length; i++)
		{
			sum = sum  + arrayNumber [i];
			System.out.println ("Number: " + arrayNumber [i]);
			
		   }
		// calculate average rule
		// sum of all elements/total number of elements
		
		double average = sum / arrayNumber.length;
		
		System.out.println ("Average value of array element is: " + average );
		
		
		}
	
		
		
	}

 
 


                  
 

