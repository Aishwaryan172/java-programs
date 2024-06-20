public class MethodWithoutParamsAndReturnOperations {

    public static void main(String[] args) {
        greet();
        displayNumbers();
    }

    // Method without parameters and return type (void), performing operations
    public static void greet() {
        System.out.println("Welcome to Java methods!");
    }

    public static void displayNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}