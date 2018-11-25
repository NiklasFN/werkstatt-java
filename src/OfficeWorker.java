import java.util.Date;

public class OfficeWorker extends Employee{

    public OfficeWorker(String name, String address){
        super(name, address);
    }


    public Repair makeAppointment(Date dateOfRepair, Mechanic mechanic, Customer c1, Vehicle v1){
        Repair repair = new Repair(dateOfRepair, mechanic, c1, v1 );
        return repair;
    }





}
