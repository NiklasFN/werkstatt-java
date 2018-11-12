import java.util.Date;

public abstract class Vehicle {

    String color;
    String brand;
    String licensePlate;
    Date warrentyTill;
    public boolean isRepaired;


    public Vehicle(String color, String brand, String licensePlate, boolean isRepaired){

        this.licensePlate = licensePlate;
        this.brand = brand;
        this.color = color;
        warrentyTill = new Date();
        this.isRepaired = isRepaired;
    }



}
