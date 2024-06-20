public class TernaryOperatorExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Ternary operator (? :)
        String result = (a > b) ? "a is greater than b" : "b is greater than or equal to a";
        System.out.println("Result: " + result);

        // Nested ternary operators
        int max = (a > b) ? ((a > 100) ? a : 100) : b;
        System.out.println("Max value: " + max);

        // Ternary operator with boolean expressions
        boolean isPositive = (a > 0) ? true : false;
        System.out.println("Is 'a' positive? " + isPositive);

        // Ternary operator without assignment (just as an example)
        int minValue = (a < b) ? a : b;
        System.out.println("Minimum value: " + minValue);
    }
}