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

        Person person1 = new Person("Kalle");
        Vehicle car1 = new Car("red", "Porsche", "HH-MA9000", 3);


        // Could do stuff like: Customer customer1 = person.bringCarIntoRepairShop(person1, vehicle1), but than not abstract and lächerlich

        Customer customerFromPerson1 = person1.bringFirstVehicleIntoRepairShop(car1);


        // Appointment appointment1 = officeWorker1.makeAppointment(customerFromPerson1, car1, mechanic1);
        // Repair repair1 = appointment1.createRepair();


        Date dateForAppointment = returnAddedDays(3);

        Repair repair1ForCustomer1ForVehicle1 = officeWorker1.makeAppointment(dateForAppointment, mechanic1, customerFromPerson1, car1);

        repair1ForCustomer1ForVehicle1.fullfillRepairAppointment();


        System.out.println("The repair costs " + repair1ForCustomer1ForVehicle1.getCosts() +
                "€. Does the customer want additional Warranty? \nEnter 1 for Extra Warranty");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("1")) {
            customerFromPerson1.payRepair(repair1ForCustomer1ForVehicle1, true);
        } else {
            customerFromPerson1.payRepair(repair1ForCustomer1ForVehicle1, false);
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
