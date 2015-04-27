public class Dice {

   
   // Creates Die objects and rolls them several times.
   
   public static void main (String[] args)
   {
      Die die1, die2, die3;
      int sum;

      die1 = new Die();
      die2 = new Die();

      die1.roll();
      die2.roll();
      System.out.println ("Die One: " + die1 + ", Die Two: " + die2);

   // Methods

      int x = die1.roll();

   // Or

      System.out.println("Die 1 " + die1.roll());

      die2.setFaceValue(4);
      System.out.println ("Die One: " + die1 + ", Die Two: " + die2);

      sum = die1.getFaceValue() + die2.getFaceValue();
      System.out.println ("Sum: " + sum);

      sum = die1.roll() + die2.roll();
      System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
      System.out.println ("New sum: " + sum);

      die3 = new Die(4);
      System.out.println("Die Three : " + die3.getFaceValue());
  
      die3 = die2;
      System.out.println("Die Three : " + die3.getFaceValue());


   }
}