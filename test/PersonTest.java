import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {


    @Test
    public void bringFirstVehicleIntoRepairShop() throws Exception {

        // given
        Person person = new Person("Hans");
        Car car = new Car("blue", "Audi", "HH-KF-88", 4);

        // When
        Customer customer = person.bringFirstVehicleIntoRepairShop(car);
        //then

        assertTrue(Customer.class == customer.getClass());

    }


    @Test
    public void isCounterIncrementing() throws Exception {

        Person person = new Person("Hans");
        Car car = new Car("blue", "Audi", "HH-KF-88", 4);

        // When
        int custCountBefore = Customer.idCounter;
        Customer customer = person.bringFirstVehicleIntoRepairShop(car);
        int custCountAfter = Customer.idCounter;

        assertTrue(custCountBefore < custCountAfter);
        //then
        assertTrue(custCountAfter - custCountBefore == 1);
    }


    }