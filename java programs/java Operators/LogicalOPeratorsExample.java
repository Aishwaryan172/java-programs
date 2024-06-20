public class LogicalOPeratorsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND (&&)
        boolean resultAnd = a && b; // false
        System.out.println("a && b: " + resultAnd);

        // Logical OR (||)
        boolean resultOr = a || b; // true
        System.out.println("a || b: " + resultOr);

        // Logical NOT (!)
        boolean resultNotA = !a; // false
        boolean resultNotB = !b; // true
        System.out.println("!a: " + resultNotA);
        System.out.println("!b: " + resultNotB);

        // Complex expression
        boolean complexExpression = (a && b) || !(a || b); // false
        System.out.println("(a && b) || !(a || b): " + complexExpression);
    }
}
