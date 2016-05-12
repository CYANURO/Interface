package interfacePackage;


/********
 * @author Aldo R. Valdes-Dilme
 * CSIS 1040
 */

import java.util.ArrayList;

public class InheritanceApp {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Rectangle myRectangle = new Rectangle(5, 4);
		System.out.println(myRectangle.toString());
		System.out.println("Length: " + myRectangle.getHeight());
		System.out.println("Width: " + myRectangle.getWidth() + "\n");
		
		
		Square mySquare = new Square(4);
		System.out.println(mySquare.toString());
		System.out.println("Sides: " + mySquare.getSide() + "\n");
		
		IsoscelesRightTriangle myIsoscelesRightTriangle = new IsoscelesRightTriangle(5);
		System.out.println(myIsoscelesRightTriangle.toString());
		System.out.println("Leg: " + myIsoscelesRightTriangle.getLeg());
		System.out.println("Hypotenuse: " + Utilities.roundTwoDecimals(myIsoscelesRightTriangle.getHypotenuse()));
		System.out.println();
		
		
		Circle myCircle = new Circle(4);
		System.out.println(myCircle.toString());
		System.out.println("Diameter: " + myCircle.diameter());
		System.out.println("Circumference: " + Utilities.roundTwoDecimals(myCircle.circumference()));
		System.out.println("Radius: " + myCircle.getRadius() + "\n");
		
		
		String str_rectangle2 = "Rectangle 2:";
		Utilities.printAndUnderline(str_rectangle2);
		
		Rectangle rectangle2 = mySquare;
		System.out.println(rectangle2.toString());
		System.out.println("Length: " + rectangle2.getHeight());
		System.out.println("Width: " + rectangle2.getWidth() + "\n");
		
	
		String str_rectangleArray = "Rectangle Array:";
		Utilities.printAndUnderline(str_rectangleArray);
		
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		
		rectangles.add(rectangle2);
		rectangles.add(mySquare);
		rectangles.add(myRectangle);
		
		for(Rectangle r: rectangles) {
			
			System.out.println(r.toString());
			System.out.println("Length: " + r.getHeight());
			System.out.println("Width: " + r.getWidth() + "\n");
			
		}

	}
	
}
