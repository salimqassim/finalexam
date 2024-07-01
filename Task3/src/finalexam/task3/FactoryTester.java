package finalexam.task3;

import java.io.IOException;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();

        // Create some Person objects
        Person person1 = new Person("John", "Doe", "12345");
        Person person2 = new Person("Jane", "Smith", "67890");

        // Add persons to the factory
        factory.addPerson(person1);
        factory.addPerson(person2);

        // Print the staff list
        System.out.println("Staff after additions:");
        for (Person person : factory.getStaff()) {
            System.out.println(person);
        }

        // Save the staff list to a file
        try {
            factory.saveStaffToFile("staff.dat");
            System.out.println("Staff list saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving staff list: " + e.getMessage());
        }

        // Clear the current staff list
        factory.getStaff().clear();
        System.out.println("Staff list cleared.");

        // Load the staff list from the file
        try {
            factory.loadStaffFromFile("staff.dat");
            System.out.println("Staff list loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading staff list: " + e.getMessage());
        }

        // Print the staff list again
        System.out.println("Staff after loading:");
        for (Person person : factory.getStaff()) {
            System.out.println(person);
        }
    }
}
