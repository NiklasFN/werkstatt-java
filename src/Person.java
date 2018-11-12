public abstract class Person {

    private String name;
    private String address;

    protected Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }




}
