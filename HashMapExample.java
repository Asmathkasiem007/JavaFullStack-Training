//1.Write a Java program to associate the specified value with the specified key in a HashMap.
import java.util.HashMap;
public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Strawberry");
		map.put(2, "Mango");
		map.put(3, "JackFruit");
		map.put(4, "lachi");
		System.out.println("HashMap Before associate: " + map);
		int newKey = 5;
		String newValue = "Apple";
		map.put(newKey, newValue);
	    System.out.println("HashMap After associate: " + map);
	}
}
	
