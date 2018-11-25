import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class main {


    public static void main(String args[]) {

        System.out.println("Welcome to our Repair Old Shop");


        OfficeWorker officeWorker1 = new OfficeWorker("Jenny", "Jenny's Street 1, Hamburg");
        Mechanic mechanic1 = new Mechanic("Gunter", "Gunters Gasse 10, Hamburg");
        Master master1 = new Master("Fritz", "Fritzweg 22, Hamburg");

        System.out.println("The repair shop and its employees have been created");

        Vehicle car1Customer1 = new Car("red", "Porsche", "HH-MA9000", 3);
        Customer customer1 = new Customer("Manny", "Hupenalee 100, Hamburg", car1Customer1);

        // Could do stuff like: Customer customer1 = person.bringCarIntoRepairShop(person1, vehicle1), but than not abstract and lächerlich


        Date dateForAppointment = returnAddedDays(2);

        Repair repair1ForCustomer1ForVehicle1 = officeWorker1.makeAppointment(dateForAppointment, mechanic1, customer1, car1Customer1);

        repair1ForCustomer1ForVehicle1.fullfillRepairAppointment();

        System.out.println("2 days later");

        System.out.println("The repair costs " + repair1ForCustomer1ForVehicle1.getCosts() +
                "€. Does the customer want additional Warranty? \nEnter 1 for Extra Warranty");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("1")) {
            repair1ForCustomer1ForVehicle1.payRepair(true);
        } else {
            repair1ForCustomer1ForVehicle1.payRepair(false);
        }






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
