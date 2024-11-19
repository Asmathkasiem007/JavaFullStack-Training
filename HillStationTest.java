// Superclass HillStations
class HillStations {
    public void location() {
        System.out.println("Location of Hill Station");
    }
    
    public void famousFor() {
        System.out.println("Famous For");
    }
}

// Subclass Manali
class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Manali is in Himachal Pradesh.");
    }

    @Override
    public void famousFor() {
        System.out.println("Manali is famous for adventure sports.");
    }
}

// Subclass Mussoorie
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Mussoorie is in Uttarakhand.");
    }

    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for its pleasant weather.");
    }
}

// Subclass Gulmarg
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Gulmarg is in Jammu & Kashmir.");
    }

    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for skiing.");
    }
}

public class HillStationTest {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Manali manali = new Manali();
        Mussoorie mussoorie = new Mussoorie();
        Gulmarg gulmarg = new Gulmarg();
        
        // Calling methods for each subclass object
        manali.location();   // Manali's location
        manali.famousFor();  // Manali's famous for
        
        System.out.println(); // New line for clarity
        
        mussoorie.location();   // Mussoorie's location
        mussoorie.famousFor();  // Mussoorie's famous for
        
        System.out.println(); // New line for clarity
        
        gulmarg.location();   // Gulmarg's location
        gulmarg.famousFor();  // Gulmarg's famous for
    }
}
