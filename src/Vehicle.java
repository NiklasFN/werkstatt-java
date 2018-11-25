import java.util.Date;

public abstract class Vehicle {

    String color;
    String brand;
    String licensePlate;
    Date warrentyTill;
    public boolean isRepaired = false;


    public Vehicle(String color, String brand, String licensePlate){

        this.licensePlate = licensePlate;
        this.brand = brand;
        this.color = color;
        warrentyTill = new Date();
    }



}
