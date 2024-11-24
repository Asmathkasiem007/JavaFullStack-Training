//WAP for handling NumberFormatException..

import java.util.Scanner;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input a number as a string
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            // Attempt to convert the string to an integer
            int number = Integer.parseInt(input);

            // Display the parsed number
            System.out.println("The entered number is: " + number);
        } catch (NumberFormatException e) {
            // Handle NumberFormatException
            System.out.println("Error: Invalid number format. Please enter a valid integer.");
        } finally {
            // Cleanup
            scanner.close();
            System.out.println("Program ended.");
        }
    }
}
