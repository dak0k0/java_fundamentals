package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class Building {

    protected String name;
    protected String address;

    public Building(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
