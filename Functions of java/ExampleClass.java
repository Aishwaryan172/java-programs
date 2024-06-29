public class ExampleClass {

    // Method with parameters and without a return type
    public void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args) {
        ExampleClass obj = new ExampleClass();
        obj.printSum(5, 3); // Calling the method with parameters
    }
}