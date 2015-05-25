
public class TwoDimensionalShape extends Shapes {
	
	static double length, width, radius, height;
	
	public TwoDimensionalShape (double d, double r, double h, double radiusDouble){
		length = d;
		width = r;
		height = h;
		radius = radiusDouble;
		
	}
	
	public double getArea(){
		return 0;
	}
	
	public static void print(){
		System.out.println ("point: " + length + "," + width + ", " + height +"," + radius);
	}

}
