
public class ThreeDie extends Die
{
  ThreeDie (int  i_numberOfSides)
  {
	  super (i_numberOfSides);
  }
  @Override
  public int throw_die()
  {
	return randomIntBbetweenOrEqual (3,3 * numberOfSides);  
  }
  
  public int get_max_roll()
  {
	  return numberOfSides * 3;
  }
}
