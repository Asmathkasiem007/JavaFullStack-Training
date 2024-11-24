//3.Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Input the size of the list
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        // Input numbers from the user
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // Calculate the sum of even numbers
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) { // Check if the number is even
                sum += number;
            }
        }

        // Display the result
        System.out.println("The sum of all even numbers in the list is: " + sum);

        scanner.close();
    }
}
