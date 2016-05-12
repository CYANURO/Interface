package interfacePackage;

/********
 * @author Aldo R. Valdes-Dilme
 * CSIS 1040
 */

public class Rectangle implements Shape, Printable {
	
	private int height;
	private int width;
	
	public Rectangle(int w, int h) {
		
		height = h;
		width = w;
		
	}
	
	public int getHeight() {
		
		return height;
		
	}
	
	public int getWidth() {
		
		return width;
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangle" + "(" + width + "x" + height + ")");
		
		return builder.toString();
		
	}
	
	private void printEdgeLine() {
		
		for(int widthUnits = 0; widthUnits < width; widthUnits++) {
			
			System.out.print("*");
			
			if(widthUnits < width -1) {
				
				System.out.print(" ");
			}
		}
		
		System.out.println();
	}
	
	private void printEmptyLine() {
		
		System.out.print("*");
		for(int widthUnits = 1; widthUnits < width; widthUnits++){
			
			System.out.print(" ");
			
			if(widthUnits < width - 1) {
				
				System.out.print(" ");
			}
			
			else {
				
				System.out.print("*");
			}
		}
		
		System.out.println();
	}
	
	private void printLine(int lineNumber) {
		
		if(lineNumber == 0 || lineNumber == height - 1) {
			
			printEdgeLine();
		}
		
		else {
			
			printEmptyLine();
		}
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for(int i = 0; i < height; i++) {
			
			printLine(i);
		}
		
		System.out.println();	
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		
		double perimeter = (2 * (width + height));
		return perimeter;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		
		double area = (width * height);
		return area;
		
	}
}