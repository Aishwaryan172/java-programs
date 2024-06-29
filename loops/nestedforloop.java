package loops;

public class nestedforloop {
    public static void main(String[] args) {
        // Example: Nested for loops to create a multiplication table
        int n = 5; // Example size of the multiplication table
        
        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns within each row
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println(); // Move to the next line after each row is printed
        }
    }
}