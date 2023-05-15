package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class Apartment extends Residence {

    int apartmentNumber;

    public Apartment(String name, String address, float numBathrooms, int numBedrooms, int apartmentNumber){
        super(name, address, numBathrooms, numBedrooms);
        this.apartmentNumber = apartmentNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "apartmentNumber=" + apartmentNumber +
                ", numBathrooms=" + numBathrooms +
                ", numBedrooms=" + numBedrooms +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
