public class ExampleClass {
    private String value;

    // Non-parameterized constructor
    public ExampleClass() {
        this.value = "Default Value";
        System.out.println("Non-parameterized constructor called");
    }

    // Parameterized constructor
    public ExampleClass(String value) {
        this.value = value;
        System.out.println("Parameterized constructor called with value: " + this.value);
    }

    public void displayValue() {
        System.out.println("The value is: " + this.value);
    }

    public static void main(String[] args) {
        // Using the non-parameterized constructor
        ExampleClass obj1 = new ExampleClass();
        obj1.displayValue();

        // Using the parameterized constructor
        ExampleClass obj2 = new ExampleClass("Custom Value");
        obj2.displayValue();
    }
}