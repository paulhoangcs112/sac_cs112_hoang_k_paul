/* Week10 Labx3
 * Enhance class RandomNumber
 * with a method
 * GetANumber (int lo, int hi)
 * Use the randomNumber class in the guessANumber program
 */

public class RandomNumber {
	
	private int myNum;
	public int GetANumber (int xyz){
		myNum = 0 + (int) (Math.random() * 50);
		return myNum;
	}

	public int GetANumber (int ll, int hh){
		myNum = ll + (int)(Math.random() * hh);
		return myNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RandomNumber r = new RandomNumber ();
		int i2 = 22;
		
		int myNum = r.GetANumber(i2);
		System.out.println ("myNum");
		
		myNum = r.GetANumber(12, i2);
		System.out.println ("myNum");

	}

}
