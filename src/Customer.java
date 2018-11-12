import java.util.Date;

public class Customer extends Person {


    int customerID;
    Date customerSince;


    public static int idCounter = 1;

    public Customer(String name, String address) {
        super(name, address);
        this.customerID = idCounter;
        this.customerSince = new Date();

        idCounter++;
    }


    public double buyAdditionalWarranty() {

        return 0;
    }

    public void makeAppointment(){



    }

    public void bringCarIntoRepairShop(){}


}
