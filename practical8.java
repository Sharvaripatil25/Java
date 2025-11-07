import java.util.HashSet;

public class practical8 {
    public static void main(String[] args) {
        // Create HashSet
        HashSet<String> cars = new HashSet<String>();

        // Add elements (duplicates are ignored automatically)
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");   // Duplicate, will not be added
        cars.add("Mazda");

        // Display HashSet
        System.out.println("Initial HashSet: " + cars);

        // ✅ Check if an element exists
        System.out.println("\nIs 'Mazda' present? " + cars.contains("Mazda"));
        System.out.println("Is 'Tesla' present? " + cars.contains("Tesla"));

        // ✅ Remove an element
        cars.remove("Volvo");
        System.out.println("\nAfter removing 'Volvo': " + cars);

        // ✅ Loop through the HashSet
        System.out.println("\nLooping through HashSet:");
        for (String car : cars) {
            System.out.println(car);
        }

        // ✅ Display total number of elements
        System.out.println("\nTotal cars in set: " + cars.size());
    }
}
