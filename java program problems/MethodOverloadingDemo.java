public class MethodOverloadingDemo {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Demonstrate method overloading
        int sum1 = add(5, 10);  // Calls add(int, int)
        int sum2 = add(1, 2, 3);  // Calls add(int, int, int)
        double sum3 = add(5.5, 10.5);  // Calls add(double, double)

        // Print the results
        System.out.println("Sum of 5 and 10 (int): " + sum1);
        System.out.println("Sum of 1, 2, and 3 (int): " + sum2);
        System.out.println("Sum of 5.5 and 10.5 (double): " + sum3);
    }
}
