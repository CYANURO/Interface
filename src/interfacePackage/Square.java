package interfacePackage;

/********
 * @author Aldo R. Valdes-Dilme
 * CSIS 1040
 */

public class Square extends Rectangle {

	public Square(int w) {
		// TODO Auto-generated constructor stub
		
		super(w, w);
		
	}
	
	public int getSide() {
		
		return getWidth();
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("Square" + "(" + getSide() + ")");
		
		return builder.toString();
		
	}
	
	@Override 
	public double perimeter() {
		
		double perimeter = (4 * getWidth());
		return perimeter;
	}
	
	@Override
	public double area() {
		
		double area = Math.pow(getWidth(), 2);
		return area;
		
	}
}
