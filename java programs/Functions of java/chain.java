public class chain {
    private String make;
    private String model;
    private int year;

    // Constructor
    public chain(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to set the make of the car
    public chain setMake(String make) {
        this.make = make;
        return this;
    }

    // Method to set the model of the car
    public chain setModel(String model) {
        this.model = model;
        return this;
    }

    // Method to set the year of the car
    public chain setYear(int year) {
        this.year = year;
        return this;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car make: " + make);
        System.out.println("Car model: " + model);
        System.out.println("Car year: " + year);
    }

    public static void main(String[] args) {
        // Creating a new Car object and using method chaining
        chain myCar = new chain("Toyota", "Camry", 2020)
                        .setMake("Honda")
                        .setYear(2022)
                        .setModel("Accord");

        // Displaying car information
        myCar.displayInfo();
    }
}

