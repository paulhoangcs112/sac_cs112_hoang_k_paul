
public class Cube extends ThreeDimensionalShape {
	
	public Cube(){
		
		//Key super call to parameter constructor of superclass "ThreeDemensinalShape"
				super (length, width, height, radius, bottomArea);
	}
	
	public double getArea(){
		return (length * width * height);
		
	}

}
