package interfacePackage;

/********
 * @author Aldo R. Valdes-Dilme
 * CSIS 1040
 */

public class IsoscelesRightTriangle implements Shape, Printable {

	private final int leg;
	
	public IsoscelesRightTriangle(int l) {
		// TODO Auto-generated constructor stub
		leg = l;
	}
	
	public int getLeg() {
		
		return leg;
	}
	
	public double hypotenuse() {
		
		double hypotenuseDouble = Math.sqrt(2 * (Math.pow(leg, 2)));
		return hypotenuseDouble;
	}

	public double getHypotenuse() {
		
		return hypotenuse();
	}
	
	@Override
	public String toString() {
		  
		StringBuilder builder = new StringBuilder();
		builder.append("IsoscelesRightTriangle (").append(leg).append(")");
		
		return builder.toString();
	}
	
	private void buildCompleteTriangle() {
			
		System.out.println("*");
		printBodyLine();
		for(int bottomLine = 0; bottomLine < leg; bottomLine++) {
				
			System.out.print("* ");
		}
		
		System.out.println();
	}
	
	private void printBodyLine() {
		
		for(int widthUnits = 1; widthUnits < leg - 1; widthUnits++) {
			
			System.out.print("* ");
			
			if(widthUnits >= 2) {	
				
				for(int spacesOnTheLine = 0; spacesOnTheLine <  widthUnits - 1; spacesOnTheLine++) {
					
					System.out.print("  ");	
				}
			}
			
			System.out.println("*");		
		}
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		buildCompleteTriangle();
		System.out.println();
		
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		
		double perimeter = ((2 * leg) + getHypotenuse());
		return perimeter;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		
		double area = (Math.pow(leg, 2) / 2);
		return area;
		
	}
	
	
}
