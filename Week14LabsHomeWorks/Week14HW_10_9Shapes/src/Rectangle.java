
public class Rectangle extends TwoDimensionalShape {
	
	public Rectangle(){
		
		//Key super call to parameter constructor of superclass "TwoDemensinalShape"
		super (length, width, height, radius); 
	}
	
	public double getArea(){
		return length * width;
	}

}
