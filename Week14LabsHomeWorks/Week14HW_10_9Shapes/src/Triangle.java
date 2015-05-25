
public class Triangle extends TwoDimensionalShape{
	
	public Triangle() {
		
		//Key super call to parameter constructor of superclass "TwoDemensinalShape"
		super (length, width, height, radius); 
		
	}
	
	public double getArea(){
	return (length * height) / 2;
  }

}
