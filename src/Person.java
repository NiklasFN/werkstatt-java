public class Person {

    private String name;
    private String address = "Keine Adresse genannt";

    protected Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    protected Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }


    public Customer bringFirstVehicleIntoRepairShop(Vehicle vehicle) {

        Customer customer = new Customer(this.name, vehicle);
        return customer;
    }


}
