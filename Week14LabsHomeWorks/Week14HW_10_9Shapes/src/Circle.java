
public class Circle extends TwoDimensionalShape {
	
	public Circle(){
		
		//Key super call to parameter constructor of superclass "TwoDemensinalShape"
		super (length, width, height, radius); 
	}
	
	public double getArea(){		
		return (3.14159 * radius * radius);
	}

}
