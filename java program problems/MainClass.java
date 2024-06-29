class Employee {
    // Declare attributes
    private int id;
    private String name;
    private double salary;

    // Constructor to initialize the attributes
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters for the attributes
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

public class MainClass {
    public static void main(String[] args) {
        // Create instances of Employee
        Employee emp1 = new Employee(1, "John Doe", 50000);
        Employee emp2 = new Employee(2, "Jane Smith", 60000);
        Employee emp3 = new Employee(3, "Mike Johnson", 55000);

        // Store instances in an array
        Employee[] employees = {emp1, emp2, emp3};

        // Traverse the array using a for loop
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}