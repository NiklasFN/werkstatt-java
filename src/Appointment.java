import java.util.Date;

public class Appointment {

    private Date dateOfRepair;
    private Mechanic mechanic;
    private Vehicle vehicle;
    private Customer customer;

    public Appointment(Date dateOfRepair, Mechanic mechanic, Vehicle vehicle, Customer customer) {
        this.dateOfRepair = dateOfRepair;
        this.mechanic = mechanic;
        this.vehicle = vehicle;
        this.customer = customer;
    }



}
