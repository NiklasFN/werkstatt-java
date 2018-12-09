import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer extends Person {


    int customerID;
    Date customerSince;
    public ArrayList<Vehicle> listOfVehicles = new ArrayList<Vehicle>();


    public static int idCounter = 1;

    public Customer(String name, String address, Vehicle v1) {
        super(name, address);
        this.customerID = idCounter;
        this.customerSince = new Date();
        this.listOfVehicles.add(v1);

        idCounter++;

        System.out.println("A new customer has been created\n");

    }

    public Customer(String name, Vehicle v1) {
        super(name);
        this.customerID = idCounter;
        this.customerSince = new Date();
        this.listOfVehicles.add(v1);

        idCounter++;

        System.out.println("A new customer has been created\n");

    }



    public void payRepair(Repair repair, boolean extraWarranty) {
        double costs = repair.getCosts();

        if (extraWarranty) {
            costs *= 1.25;
            // could use format, but cant be bothered
            System.out.println("The customer chose to buy additional warranty. The Total price for the repair is "
                    + ((double) ((int) (costs * 100))) / 100);
        } else {
            System.out.println("The customer dont want no additional warranty. The Total price for the repair is "
                    + ((double) ((int) (costs * 100))) / 100);


        }
    }


    public double buyAdditionalWarranty() {

        return 0;
    }

    public void makeAppointment() {


    }

    public void bringVehicleIntoRepairShop(Vehicle vehicle) {
        listOfVehicles.add(vehicle);
    }


}
