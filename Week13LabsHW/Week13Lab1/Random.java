public class Random 
{
  Random()
  {
	  super();
  }
  
  int randomIntBbetweenOrEqual ( int lowerBound, int upperBound)
  {
	  return lowerBound + (int) (Math.random() * (1 + upperBound - lowerBound));
  }
}
