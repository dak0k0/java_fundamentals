package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class House extends Residence{

    int garageNumCars;

    public House(String name, String address, float numBathrooms, int numBedrooms, int garageNumCars){
        super(name, address, numBathrooms, numBedrooms);
        this.garageNumCars = garageNumCars;
    }

    public int getGarageNumCars() {
        return garageNumCars;
    }

    public void setGarageNumCars(int garageNumCars) {
        this.garageNumCars = garageNumCars;
    }

    @Override
    public String toString() {
        return "House{" +
                "garageNumCars=" + garageNumCars +
                ", numBathrooms=" + numBathrooms +
                ", numBedrooms=" + numBedrooms +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
