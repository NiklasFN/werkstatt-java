import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    @Test
    public void bringVehicleIntoRepairShop() throws Exception {

        Vehicle vehicle1 = new Car("blue", "1", "dsa", 2);
        Vehicle vehicle2 = new Car("blue", "1", "dsa", 2);
        Customer customer = new Customer("hans", vehicle1);

        int counter = customer.listOfVehicles.
        customer.bringVehicleIntoRepairShop(vehicle2);
    }

}