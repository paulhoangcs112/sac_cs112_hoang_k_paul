
public class ThreeDimensionalShape extends Shapes {
	
	static double length, width, height, radius, bottomArea;
	
	public ThreeDimensionalShape (double d, double r, double h, double radiusDouble, double bottomAreaDouble){
		length = d;
		width = r;
		height = h;
		radius = radiusDouble;
		bottomArea = bottomAreaDouble;
	}
	
	public double getArea(){
		return 0;
	}
	
	public double getVolume(){
		return 0;
	}
	
	public static void print(){
		System.out.println("point: " + length + "," + width + ", " + height +"," + radius + "," + bottomArea);
	}

}
