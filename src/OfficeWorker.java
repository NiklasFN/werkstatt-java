import java.util.Date;

public class OfficeWorker extends Employee{

    public OfficeWorker(String name, String address){
        super(name, address);
    }


    public Repair makeAppointment(Date d1, Mechanic m, Vehicle v1, double costs, boolean xw){
        Repair repair = new Repair(d1, m, v1, costs, xw );
        return repair;
    }





}
