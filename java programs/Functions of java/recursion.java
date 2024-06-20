public class recursion {


        public static void main(String[] args) {
            // Example of cycle function: Calculating factorial using recursion
            int n = 5;
            int factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + ": " + factorial); // Output: Factorial of 5: 120
        }
    
        public static int calculateFactorial(int n) {
            if (n == 0 || n == 1) {
                return 1; // Base case
            } else {
                return n * calculateFactorial(n - 1); // Recursive call
            }
        }
    }
