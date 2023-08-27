public class Constructor {
    String make;
    String model;
    int year;

    // Constructor with parameters
    public Constructor(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        Constructor myCar = new Constructor("Toyota", "Camry", 2023);



    }
}
