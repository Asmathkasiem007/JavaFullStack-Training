//Write a program for voting Application, take the user’s age as input and explicitly throw the exception if the user’s age is less than 18 to terminate the program.

import java.util.Scanner;

class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}

public class VotingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Input userage, Check voting eligibility
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 18) {
                // Explicitly throw an exception if age is less than 18
                throw new UnderageException("You must be at least 18 years old to vote.");
            }

            System.out.println("You are eligible to vote. Please proceed!");
        } catch (UnderageException e) {
            // Handle custom exception
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program terminated.");
        }
    }
}
