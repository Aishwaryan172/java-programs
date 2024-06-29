import java.util.Scanner;

    public class ArrayOperations {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
    
            // Initialize the array
            double[] array = new double[n];
    
            // Read array elements from user
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextDouble();
            }
    
            // Calculate sum and average
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += array[i];
            }
            double average = sum / n;
    
            // Display the results
            System.out.println("Sum of the array elements: " + sum);
            System.out.println("Average of the array elements: " + average);
    
            // Close the scanner
            scanner.close();
        }
    }