import java.util.Date;

public class Repair {

    private Date dateOfRepair;
    private Mechanic mechanic;
    private Vehicle vehicle;
    private double costs;
    private boolean extraWarranty;
    private Customer customer;

    public Repair(Date dateOfRepair, Mechanic mechanic, Customer c1, Vehicle v1) {
        this.dateOfRepair = dateOfRepair;
        this.mechanic = mechanic;
        customer = c1;
        vehicle = v1;


    }

    public double getCosts() {
        return ((double) ((int) (this.costs * 100))) / 100;
    }

    public void fullfillRepairAppointment() {
        mechanic.repairVehicle(vehicle);
        costs = (Math.random() * 2000);
    }


    public void payRepair(boolean extraWarranty) {

        if (extraWarranty) {
            costs *= 1.25;
            // could use format, but cant be bothered
            System.out.println("The customer chose to buy additional warranty. The Total price for the repair is "
                    + ((double) ((int) (this.costs * 100))) / 100);
        } else {
            System.out.println("The customer dont want no additional warranty. The Total price for the repair is "
                    + ((double) ((int) (this.costs * 100))) / 100);


        }
    }


}
