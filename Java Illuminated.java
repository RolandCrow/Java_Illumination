public class FirstProgram {
	public static void main(String args[]) {
		System.out.println("Programming is not a spectator sport!");
		System.exit(0);
}}

jar cf jarfile inputfile(s)

public class AreaOfCircle {
	public static void main(String args[]) {
		final double PI = 3.14159;
		double radius = 3.5;
		double area = PI * radius * radius;
		System.out.println("The area of the circle is " + area);
}}

public class Constants {
	public static void main(String args[]) {
		final char ZORRO = 'Z';
		final double PI = 3.14159;
		final int DAYS_IN_LEAP_YEAR = 366, DAYS_IN_NON_LEAP_YEAR = 365;
		
		System.out.println("The value of constant ZORRO is " + ZORRO);
		System.out.println("The value of constant PI is " + PI);l
		System.out.println("The number of days in a leap year is " DAYS_IN_LEAP_YEAR);
		System.out.println("The number of days in non-leap year is " DAYS_IN_NON_LEAP_YEAR);
}}

public class ArithmeticOperators {
	public static void main(String args[]) {
		double salad = 5.95;
		double water = .89;
		System.out.println("The cost of lunch is $" + (salad + water));
		int targetYear = 2025;
		int birthYear = 2005;
		
		System.out.println("Your age in " + ( targetYear - birthYear));
		
		int caloriesPerApple = 127;
		int numberOfApples = 3;
		System.out.println("The calories in " + ( caloriesPerApple * numberOfApples));
		
		double miles = 426.8;
		double gallons = 15.2;
		double mileage = miles / gallons;
		System.out.println("The mileage is " + mileage + " miles per gallon.");
}}
