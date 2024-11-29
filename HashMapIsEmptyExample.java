//2.Write a Java program to check whether a HashMap contains key-value mappings (empty) or not.
import java.util.HashMap;
public class HashMapIsEmptyExample {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		if (map.isEmpty()) {
			System.out.println("The HashMap is Empty.");
		}else {
			System.out.println("The HashMap is not Empty.");
		}
		map.put(1, "StrawBerry");
		map.put(2, "Mango");
		if (map.isEmpty()) {
			System.out.println("The HashMap is Empty.");
		}else {
			System.out.println("The HashMap is not Empty.");
		}
	}
}
				
