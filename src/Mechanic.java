public class Mechanic extends Employee{

    public Mechanic(String name, String address) {
        super(name, address);
    }


    public void repairVehicle(Vehicle v1){
        v1.isRepaired = true;
        System.out.println("The vehicle has been repaired");
    }


}
