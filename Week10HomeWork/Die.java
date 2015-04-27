// User-defined class.

class Die
{

//Represents one die (singular of dice) with faces showing values
//between 1 and 6.

private final int MAX = 6;  // maximum face value

private int faceValue;      // current value showing on the die

//  Constructor: Sets the initial face value.

public Die()
{
  faceValue = 1;
}

// Alternate Constructor

public Die(int value)
{
  faceValue = value;
}


//  Rolls the die and returns the result.

public int roll()
{
  faceValue = (int)(Math.random() * MAX) + 1;

  return faceValue;
}


//  value mutator. -setter

public void setFaceValue (int value)
{
  faceValue = value;
}


//  Face value accessor. - getter

public int getFaceValue()
{
  return faceValue;
}

//Returns a string representation of this die. 

   public String toString() 
  { 
         String result = Integer.toString(faceValue); 
         return result; 
    } 

}