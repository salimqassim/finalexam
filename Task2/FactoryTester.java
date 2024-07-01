package finalexam.task2;

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

        // Delete a person
        factory.deletePerson(person1);

        // Print the staff list again
        System.out.println("Staff after deletion:");
        for (Person person : factory.getStaff()) {
            System.out.println(person);
        }
    }
}
