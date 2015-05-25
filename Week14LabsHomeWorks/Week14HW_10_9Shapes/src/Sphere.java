
public class Sphere extends ThreeDimensionalShape {
	
	public Sphere(){
		
		//Key super call to parameter constructor of superclass "ThreeDemensinalShape"
		super (length, width, height, radius, bottomArea); 
		
	}
	
	public double getArea(){
		return (4 * 3.14159 * radius * radius * radius) / 3;
	}

}
