public class nesteadeifStatment {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Nested if statements
        if (a != b) {
            System.out.println("a is not equal to b");
            if (a < b) {
                System.out.println("a is less than b inside nested if");
            }
            else {
                System.out.println("a is greater than b");
            }
        }
    }
}
