import java.util.Calendar;
import java.util.Date;

public class main {


    public static void main(String args[]) {

        System.out.println("Welcome to our RepairOld Shop");



        OfficeWorker officeWorker1 = new OfficeWorker("Jenny", "Jenny's Street 1, Hamburg");
        Mechanic mechanic1 = new Mechanic("Gunter", "Gunters Gasse 10, Hamburg");
        Master master1 = new Master("Fritz", "Fritzweg 22, Hamburg");

        System.out.println("The repair shop and its employees have been created");

        Person customer1 = new Customer("Manny", "Hupenalee 100, Hamburg");
        Vehicle car1Customer1 = new Car("red", "Porsche", "HH-MA9000", 3);

        System.out.println("A new customer has been created\n");

        Date dateForAppointment = returnAddedDays(2);

        Repair appCustomer1 = officeWorker1.makeAppointment(dateForAppointment, mechanic1, car1Customer1);

        System.out.println("An Repair has been made");

        System.out.println("2 days later");

//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();


        System.out.println("Welcome to the repair");

        mechanic1.repairVehicle(car1Customer1);

        // repairForCustomer1.appointment.mechanic.repairVehicle();



    }







    public static Date returnAddedDays(int days) {
        Date newDate;
        Calendar c1 = Calendar.getInstance();
        c1.add(Calendar.DAY_OF_MONTH, days);
        newDate = c1.getTime();
        return newDate;
    }

}
