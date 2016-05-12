package interfacePackage;

/********
 * @author Aldo R. Valdes-Dilme
 * CSIS 1040
 */

public class Circle implements Shape {
	
	private final int radius;

	public Circle(int r) {
		
		// TODO Auto-generated constructor stub
		radius = r;
		
	}

	public int getRadius() {
		
		return radius;
	}
	
	public double diameter() {
		
		double newDiameter = 2 * (radius);
		return newDiameter;
	}
	
	public double circumference() {
		
		double newCircumference = radius * (2 * Math.PI);
		return newCircumference;	
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("Circle (").append(radius).append(")");
		return builder.toString();
		
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		
		return circumference();
		
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		
		double area = (Math.PI * Math.pow(radius, 2));
		return area;
		
	}
}
