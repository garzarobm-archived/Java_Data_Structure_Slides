package data_structures;
import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();

        if (console != null) {
            // Console is available, perform input/output operations
            String input = console.readLine("Enter your name: ");
            console.printf("Hello, %s!\n", input);
        } else {
            // Console is not available
            System.out.println("Console is not available.");
        }
    }
}
