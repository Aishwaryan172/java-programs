class Student {
    // Declare attributes
    int age;
    String name;

    // Constructor to initialize attributes
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Solution {
    public static void main(String[] args) {
        // Create two instances of Student
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        
        // Store them in an array
        Student[] students = { student1, student2 };
        
        // Traverse the array using a for loop and print details
        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Age: " + student.age);
        }
    }
}