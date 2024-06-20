public class sequence {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        
        // Example of a sequence function: Summing all elements in an array
        int sum = calculateSum(numbers);
        System.out.println("Sum of numbers: " + sum); // Output: Sum of numbers: 30
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
