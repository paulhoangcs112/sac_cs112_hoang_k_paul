import java.awt.Color;
import javax.swing.JFrame;

public class MainShapesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double areaDouble1, areaDouble2;
		double areaDouble3, areaDouble4, areaDouble5, areaDouble6; 
		
		//Initial and create an object of the class TwoDimensionalShape
		TwoDimensionalShape myTwoDimensionalShape = new TwoDimensionalShape (4,5,2,8);
		myTwoDimensionalShape.print ();
		
		// Calculate the area of Rectangle
		Rectangle myRectangle = new Rectangle ();
		areaDouble4 = myRectangle.getArea();
		System.out.println(areaDouble4);
		
		// Calculate the area of Triangle
		Triangle myTriangle = new Triangle ();
		areaDouble5 = myTriangle.getArea();
		System.out.println(areaDouble5);
		
		// Calculate the area of Circle
		Circle myCircle = new Circle ();
		areaDouble6 = myCircle.getArea();
		System.out.println(areaDouble6);
		
		//Initial and create an object of the class ThreeDimensionalShape
		System.out.println();
		ThreeDimensionalShape myThreeDimensionalShape = new ThreeDimensionalShape (4,5,2,8,12.3);
		myThreeDimensionalShape.print();
		
		//calculate the area of Sphere
		Sphere mySphere = new Sphere();
		areaDouble1 = mySphere.getArea();
		System.out.println (areaDouble1);
		
		//calculate the area of Cube
		Cube myCube = new Cube();
		areaDouble2 = myCube.getArea();
		System.out.println (areaDouble2);
		
		//calculate the area of Tetrahedron
		Tetrahedron myTetrahedron = new Tetrahedron();
		areaDouble3 = myTetrahedron.getArea();
		System.out.println (areaDouble3);
		
		String [] yShape = {"Sphere", "Cube", "Tetrahedron", "Rectangle", "Triangle", "Circle" };
		for (int count = 0; count < yShape.length; count ++){
			
			if (count ==1)
				System.out.println ("This is Sphere. The area of Sphere: +areaDouble1");
			else if (count ==2)
				System.out.println ("This is Cube. The area of Cube: +areaDouble2");
			else if (count ==3)
				System.out.println ("This is Tetrahedron. The area of Tetrahendron: +areaDouble3");
			else if (count ==4)
				System.out.println ("This is Rectangle. The area of Rectangle: +areaDouble4");
			else if (count ==5)
				System.out.println ("This is Triangle. The area of Triangle: +areaDouble5");
			else
				System.out.println ("This is Circle. The area of Circle: +areaDouble6");
			
				
		}

	}

}
