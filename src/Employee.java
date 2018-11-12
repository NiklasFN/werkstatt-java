public abstract class Employee extends Person {

    private int employeeID;

    private static int empCounter = 1;

    public int getEmployeeID() {
        return employeeID;
    }



    protected Employee(String name, String address){
        super(name, address);
        employeeID = empCounter;

        empCounter++;
    }


    public String toString()
    {
        return "The Employee " + employeeID + " is called " + getName();

    }


}
