public class SumCalculator {

    // Function to calculate the sum of two integers
    public static int calculateSum(int num1, int num2) {
        // Calculate the sum
        int sum = num1 + num2;
        // Return the sum
        return sum;
    }

    public static void main(String[] args) {
        // Define two integers
        int number1 = 10;
        int number2 = 20;

        // Call the function and store the result
        int result = calculateSum(number1, number2);

        // Print the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + result);
    }
}