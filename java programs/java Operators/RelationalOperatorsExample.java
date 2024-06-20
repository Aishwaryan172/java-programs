public class RelationalOperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Equal to (==)
        boolean isEqual = (a == b);
        System.out.println("a == b: " + isEqual);

        // Not equal to (!=)
        boolean isNotEqual = (a != b);
        System.out.println("a != b: " + isNotEqual);

        // Greater than (>)
        boolean isGreater = (a > b);
        System.out.println("a > b: " + isGreater);

        // Less than (<)
        boolean isLess = (a < b);
        System.out.println("a < b: " + isLess);

        // Greater than or equal to (>=)
        boolean isGreaterOrEqual = (a >= b);
        System.out.println("a >= b: " + isGreaterOrEqual);

        // Less than or equal to (<=)
        boolean isLessOrEqual = (a <= b);
        System.out.println("a <= b: " + isLessOrEqual);
    }
}