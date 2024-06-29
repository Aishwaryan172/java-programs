import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Demonstrate reading a string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Demonstrate reading an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        // Demonstrate reading a double
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        System.out.println("Your height is " + height + " meters.");

        // Demonstrate reading a boolean
        System.out.print("Do you like Java programming (true/false)? ");
        boolean likesJava = scanner.nextBoolean();
        if (likesJava) {
            System.out.println("Great! Keep coding in Java.");
        } else {
            System.out.println("That's okay! There are many other languages to explore.");
        }

        // Close the scanner
        scanner.close();
    }
}