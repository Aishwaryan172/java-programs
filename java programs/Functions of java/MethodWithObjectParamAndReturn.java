import java.util.ArrayList;
import java.util.List;

public class MethodWithObjectParamAndReturn {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        String fruit = findFruit(fruits, "Banana");
        if (fruit != null) {
            System.out.println("Found fruit: " + fruit); // Output: Found fruit: Banana
        } else {
            System.out.println("Fruit not found.");
        }
    }

    // Method with parameter (List<String> list, String item) and return type (String)
    public static String findFruit(List<String> list, String item) {
        for (String fruit : list) {
            if (fruit.equals(item)) {
                return fruit;
            }
        }
        return null;
    }
}
