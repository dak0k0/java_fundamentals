package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class Townhouse extends House{

    char unitLetter;

    public Townhouse(String name, String address, float numBathrooms, int numBedrooms, int garageNumCars, char unitLetter){
        super(name, address, numBathrooms, numBedrooms, garageNumCars);
        this.unitLetter = unitLetter;
    }

    public char getUnitLetter() {
        return unitLetter;
    }

    public void setUnitLetter(char unitLetter) {
        this.unitLetter = unitLetter;
    }

    @Override
    public String toString() {
        return "Townhouse{" +
                "unitLetter=" + unitLetter +
                ", garageNumCars=" + garageNumCars +
                ", numBathrooms=" + numBathrooms +
                ", numBedrooms=" + numBedrooms +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
