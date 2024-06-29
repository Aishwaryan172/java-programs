public class addition {
    // Static method to add three numbers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Call the add method with three arguments and store the result
        int sum = add(5, 10, 15);

        // Print the sum of the three arguments
        System.out.println("The sum of the three arguments is: " + sum);
    }
}