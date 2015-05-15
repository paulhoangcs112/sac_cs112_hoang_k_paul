
public class Die extends Random
{
	Die (int i_numberOfSides)
	{
		super();
		set_number_of_sides ( i_numberOfSides);
	}
	//Fields
	
	int numberOfSides;
	
	public int throw_die()
	{
		return randomIntBbetweenOrEqual ( 1, numberOfSides);
		}
	private void set_number_of_sides (int i_numberOfSides)
	
	{
		//no one side die
		
		if (i_numberOfSides < 2 ) i_numberOfSides = 2;
		numberOfSides = i_numberOfSides;
	}

}

