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




    public double buyAdditionalWarranty() {

        return 0;
    }

    public void makeAppointment(){



    }

    public void bringCarIntoRepairShop(){}


}
