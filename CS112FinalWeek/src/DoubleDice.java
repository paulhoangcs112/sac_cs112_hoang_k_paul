
public class DoubleDice extends Dice {


		int RandomNumber()
		{
			int a = 1 + (int)(Math.random()*12);
			return a;
		}
		int GetValue()
		{
			DoubleDice NumGen = new DoubleDice();
			return NumGen.RandomNumber();
		}
	
}