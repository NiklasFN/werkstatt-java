import java.util.Date;

public class Repair {

    Date dateOfRepair;
    Mechanic mechanic;
    Vehicle vehicle;
    double costs;
    boolean extraWarranty;

    public Repair(Date dateOfRepair, Mechanic mechanic, Vehicle v1, double costs, boolean extraWarranty) {
        this.dateOfRepair = dateOfRepair;
        this.mechanic = mechanic;
        vehicle = v1;
        this.costs = costs;
        this.extraWarranty = extraWarranty;
    }


    public void fullfillRepairAppointment(){
        mechanic.repairVehicle(vehicle);
    }

}
