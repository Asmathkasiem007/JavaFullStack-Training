//2.WAP for storing 10 student records from the user using the Array of the object and handling ArrayIndexOutOfBoundException.

import java.util.Scanner;
class Student {
	int RollNumber;
	String Name;
	Student(int RollNumber, String Name) {
		this.RollNumber = RollNumber;
		this.Name = Name;
	}
	
	//To display the student details..
	void display() {
	System.out.println("RollNumber: " + RollNumber + "Name: " + Name);
	}
}

public class StudentRecords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] student = new Student[10];
		
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("Enter details for student " + (i+1) + ":");
				System.out.print("Enter the RollNumber: ");
                int RollNumber = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Enter the Name: ");
                String Name = scanner.nextLine();
                students[i] = new Student(RollNumber, Name);
			}
			 System.out.println("Accessing an invalid index:");
            students[15].display();
        } 
		catch (ArrayIndexOutOfBoundsException e) {
           
            System.out.println("Error: Invalid array index accessed!");
        }
		finally {
            System.out.println("\nDisplaying all student records:");
            for (int i = 0; i < 10; i++) {
                students[i].display();
			}
			scanner.close();
		}
	}
}
				
				
				
				
				
	
	
