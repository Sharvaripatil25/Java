import java.util.HashSet;
import java.util.Iterator;

public class practical8 {
    public static void main(String[] args) {
        // Create a HashSet of cars
        HashSet<String> cars = new HashSet<String>();

        // Add elements to the HashSet
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate, will be ignored
        cars.add("Mazda");

        // Print the entire HashSet
        System.out.println("Cars in HashSet: " + cars);

        // Check if an element exists
        System.out.println("\nDoes HashSet contain 'Mazda'? " + cars.contains("Mazda"));
        System.out.println("Does HashSet contain 'Audi'? " + cars.contains("Audi"));

        // Remove an element
        cars.remove("Volvo");
        System.out.println("\nAfter removing 'Volvo': " + cars);

        // Loop through HashSet using for-each loop
        System.out.println("\nLooping through HashSet (for-each):");
        for (String car : cars) {
            System.out.println(car);
        }

        // Loop through HashSet using Iterator
        System.out.println("\nLooping through HashSet (Iterator):");
        Iterator<String> it = cars.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Display size of HashSet
        System.out.println("\nTotal number of cars in HashSet: " + cars.size());

        // Clear the HashSet
        cars.clear();
        System.out.println("\nAfter clearing all elements: " + cars);
    }
}
