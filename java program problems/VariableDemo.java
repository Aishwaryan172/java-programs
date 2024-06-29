public class VariableDemo {
    // Member variable
    int number;

    // Constructor to initialize member variable
    public VariableDemo(int number) {
        this.number = number; // 'this.number' refers to the member variable
    }

    // Method to display the member and local variables
    public void displayNumber(int number) {
        System.out.println("Local variable number: " + number);
        System.out.println("Member variable number: " + this.number);
    }

    public static void main(String[] args) {
        // Create an object of VariableDemo
        VariableDemo demo = new VariableDemo(10);
        
        // Call the displayNumber method with a local variable
        demo.displayNumber(20);
    }
}