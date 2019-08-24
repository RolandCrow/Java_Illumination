// exc 1 convert Inches in centimeters 
import java.util.Scanner;
public class MetricLength {
	public static void main(String args[]) {
		final double CM_PER_INCH = 2.54;
		double INCH = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("What INCH do you have?");
		INCH = in.nextInt();
		System.out.println("In " + INCH + " INCH " + (INCH * CM_PER_INCH) + " CM");
}
}

	
		
		
		
		