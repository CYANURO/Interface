package interfacePackage;

/********
 * @author Aldo R. Valdes-Dilme
 * CSIS 1040
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Utilities {

	public static double roundTwoDecimals(double d) {
		
        DecimalFormat twoDecimals = new DecimalFormat("0.0");
        twoDecimals.setRoundingMode(RoundingMode.HALF_UP);
        
        return Double.valueOf(twoDecimals.format(d));
	}
	
	public static void printAndUnderline(String shape) {
		
		System.out.println(shape);
		
		for (int i = 0; i < shape.length(); i++) {
			
			System.out.print("-");
			
		}
		
		System.out.println();
	}

}
