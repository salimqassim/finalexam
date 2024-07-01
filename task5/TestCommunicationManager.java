package finalexam.task5;

public class TestCommunicationManager {
    public static void main(String[] args) {
        String endpoint = "https://example.com/api/sendMessage"; // Replace with your actual endpoint
        CommunicationManager manager = new CommunicationManager(endpoint);

        String response = manager.sendUserMessage("Hello, world!");
        System.out.println(response);
    }
}
