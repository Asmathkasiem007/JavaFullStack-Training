//3.write a program in Java to create a Map Interface where we can store the cricketer name in it along with his scores and search for the batsman name and display his score.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CricketerScores {
	public static void main(String[] args) {
		Map<String, Integer> CricketerScores = new HashMap<>();
		CricketerScores.put("Mahendra singh Dhoni", 204);
		CricketerScores.put("Pathirana", 200);
		CricketerScores.put("Virat Kohli", 199);
		CricketerScores.put("Mahendra singh Dhoni", 204);
		System.out.println("Cricketers and their Scores: " + CricketerScores);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the name of the cricketer to search for his score: ");
		String searchName = scanner.nextLine();
		if (CricketerScores.containskey(searchName)) {
			int score = CricketerScores.get(searchName);
			System.out.println(searchName + "'s score is: " + score);
		}else {
			System.out.println("Cricketer " + searchName + " Not found in the Records.");
		}
		scanner.close();
	}
}

			
		   
		