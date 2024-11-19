import java.util.Scanner;
public class Bitcheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scanner.nextInt();
		System.out.println("Enter the Bit position to check (stating from 0): ");
		int n = scanner.nextInt();
		if ((num & (1 << n)) != 0) {
			System.out.println("The " + n + "th bit of " + num + " is set (1).");
		}
        else {
            System.out.println("The " + n + "th bit of " + num + " is not set (0).");
		}
        scanner.close();
    }
}	