public class Box {
    private double width;
    private double height;
    private double depth;

    // Non-parameterized constructor
    public Box() {
        this.width = 0;
        this.height = 0;
        this.depth = 0;
        System.out.println("Non-parameterized constructor called");
    }

    // Parameterized constructor with one parameter (cube)
    public Box(double side) {
        this.width = this.height = this.depth = side;
        System.out.println("Parameterized constructor with one double parameter called");
    }

    // Parameterized constructor with three parameters
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        System.out.println("Parameterized constructor with three double parameters called");
    }

    public double volume() {
        return this.width * this.height * this.depth;
    }

    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println("Volume of box1: " + box1.volume());

        Box box2 = new Box(5);
        System.out.println("Volume of box2: " + box2.volume());

        Box box3 = new Box(2, 3, 4);
        System.out.println("Volume of box3: " + box3.volume());
    }
}
