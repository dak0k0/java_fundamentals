package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class Residence extends Building{

    protected float numBathrooms;
    protected int numBedrooms;

    public Residence(String name, String address, float numBathrooms, int numBedrooms){
        super(name, address);
        this.numBathrooms = numBathrooms;
        this.numBedrooms = numBedrooms;
    }


    public float getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(float numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    @Override
    public String toString() {
        return "Residence{" +
                ", numBathrooms=" + numBathrooms +
                ", numBedrooms=" + numBedrooms +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
