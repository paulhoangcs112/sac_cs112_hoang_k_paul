
public class Tetrahedron extends ThreeDimensionalShape {
	
	public Tetrahedron(){
		
		//Key super call to parameter constructor of superclass "ThreeDemensinalShape"
				super (length, width, height, radius, bottomArea);
	}
	
	public double getArea(){
		return (bottomArea * height);
	}

}
