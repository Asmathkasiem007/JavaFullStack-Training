// Abstract class Vaccine
abstract class Vaccine {
    // Instance variables
    int age;
    String nationality;

    // Constructor to initialize age and nationality
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // Concrete method to handle the first dose
    public void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("You are eligible for the first dose.");
            System.out.println("You need to pay 250 Rs for the first dose.");
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    // Concrete method to handle the second dose
    public void secondDose(boolean isFirstDoseComplete) {
        if (isFirstDoseComplete) {
            System.out.println("You are eligible for the second dose.");
        } else {
            System.out.println("You need to complete the first dose before taking the second dose.");
        }
    }

    // Abstract method for the booster dose
    public abstract void boosterDose();
}

// Implementation class VaccinationSuccessful
class VaccinationSuccessful extends Vaccine {

    // Constructor for VaccinationSuccessful class
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality); // Call to the constructor of the abstract class
    }

    // Implementing the boosterDose() method
    @Override
    public void boosterDose() {
        System.out.println("You are eligible for the booster dose after completing the second dose.");
    }
}

// Main class Vaccination
public class Vaccination {
    public static void main(String[] args) {
        // Create an object for the VaccinationSuccessful class
        Vaccine user = new VaccinationSuccessful(25, "Indian");

        // Scenario 1: First Dose
        user.firstDose();
        System.out.println();  // Just to separate scenarios

        // Scenario 2: Second Dose (assuming first dose is completed)
        user.secondDose(true);  // Pass true as the first dose is complete
        System.out.println();  // Just to separate scenarios

        // Scenario 3: Booster Dose
        user.boosterDose();
    }
}
