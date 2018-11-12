public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String color, String brand, String licensePlate, int doors){
        super(color, brand, licensePlate);
        numberOfDoors = doors;
    }

}
