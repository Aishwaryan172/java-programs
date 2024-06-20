public class AssignmentOperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Assignment operator (=)
        int c = a + b; // c = 15
        System.out.println("c = " + c);

        // Addition assignment (+=)
        c += a; // c = c + a = 15 + 10 = 25
        System.out.println("c += a: " + c);

        // Subtraction assignment (-=)
        c -= b; // c = c - b = 25 - 5 = 20
        System.out.println("c -= b: " + c);

        // Multiplication assignment (*=)
        c *= a; // c = c * a = 20 * 10 = 200
        System.out.println("c *= a: " + c);

        // Division assignment (/=)
        c /= b; // c = c / b = 200 / 5 = 40
        System.out.println("c /= b: " + c);
    }
}

