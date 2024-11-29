///1.Write a Java program to append the specified element to the end of a HashSet.
//[Hint:Add elements in the Set using add() method]

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> Set = new HashSet<>();
		Set.add("Apple");
		Set.add("Mango");
		Set.add("Strawberry");
		Set.add("Peach");
		Set.add("JackFruit");
		System.out.println("HashSet Before Appending: " + Set);
		String newElement = "Banana";
		Set.add(newElement);
		System.out.println("HashSet After Appending: " + Set);
	}
}	
		