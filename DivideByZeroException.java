//1.WAP for handling DivideByZeroException?..

import java.util.Scanner;
public class DivideByZeroException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Input Numerator and Input Denominator then perform Division...
		try {
			System.out.print("Enter the Numerator: ");
			int Numerator = scanner.nextInt();
			
			System.out.print("Enter the Denominator: ");
			int Denominator = scanner.nextInt();
			
			int result = Numerator / Denominator;
			System.out.println("Result: " + result);
		}
		
		//To Handle divide by the Exception of Zero...
		catch (ArithmeticException e) {
			System.out.println("Error: Divide by Zero is Not Allow.");
		}
		
		//To close the scanner
		finally {
			scanner.close();
			System.out.println("Program ended.");
		}
	}
}
			
		
