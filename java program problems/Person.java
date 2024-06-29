public class Person {
    private String name;
    private int age;

    // Non-parameterized constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Non-parameterized constructor called");
    }

    // Parameterized constructor with one parameter
    public Person(String name) {
        this.name = name;
        this.age = 0;
        System.out.println("Parameterized constructor with one parameter called");
    }

    // Parameterized constructor with two parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor with two parameters called");
    }

    public void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.display();

        Person person2 = new Person("Alice");
        person2.display();

        Person person3 = new Person("Bob", 25);
        person3.display();
    }
}