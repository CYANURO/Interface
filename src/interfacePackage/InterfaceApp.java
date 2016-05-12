package interfacePackage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aldo R. Valdes-Dilme
 *
 */
public class InterfaceApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle myRectangle = new Rectangle(6, 3);
		System.out.println(myRectangle.toString());
		System.out.println();
		
		Square mySquare = new Square(5);
		System.out.println(mySquare.toString());
		System.out.println();
		
		IsoscelesRightTriangle myIsoscelesRightTriangle = new IsoscelesRightTriangle(6);
		System.out.println(myIsoscelesRightTriangle.toString());
		System.out.println();
		
		Circle myCircle = new Circle(5);
		System.out.println(myCircle.toString());
		System.out.println("Diameter: " + Utilities.roundTwoDecimals(myCircle.diameter()));
		System.out.println("Circumference: " + Utilities.roundTwoDecimals(myCircle.circumference()));
		System.out.println();
		
		String str_shapeArray = "Shape Array:";
		Utilities.printAndUnderline(str_shapeArray);
		
		System.out.println();
		List<Shape> myArrayOfShapes = new ArrayList<Shape>();
		
		myArrayOfShapes.add(mySquare);
		myArrayOfShapes.add(myRectangle);
		myArrayOfShapes.add(myIsoscelesRightTriangle);
		myArrayOfShapes.add(myCircle);
		
		for(Shape iterationOverShapes: myArrayOfShapes) {
			
			System.out.println(iterationOverShapes.toString());
			System.out.println("Perimeter: " + Utilities.roundTwoDecimals(iterationOverShapes.perimeter()));
			System.out.println("Area: " + Utilities.roundTwoDecimals(iterationOverShapes.area()));
			
			if(iterationOverShapes instanceof Printable) {
				
				((Printable) iterationOverShapes).print();
				
			}
			
		}
		
	}

}
