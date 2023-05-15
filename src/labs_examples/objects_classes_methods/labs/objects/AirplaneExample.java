package labs_examples.objects_classes_methods.labs.objects;

class AirplaneExample{

    public static void main(String[] args) {

        AirplaneEngine engine = new AirplaneEngine(500);
        AirplaneChassis chassis = new AirplaneChassis(1000,300);
        AirplaneWings wings = new AirplaneWings(10000);
        AirplaneWheels wheels = new AirplaneWheels(2);
        Airplane airplane = new Airplane(engine, chassis, wings, wheels, 1000, 750);

        System.out.println("This airplane has the following properties:" +
                                "\n - " + airplane.getEngine().toString() +
                                "\n - " + airplane.getChassis().toString() +
                                "\n - " + airplane.getWings().toString() +
                                "\n - " + airplane.getWheels().toString() +
                                "\n - Fuel Capacity: " + airplane.getFuelCapacity() +
                                "\n - Current Fuel: " + airplane.getCurrentFuelLevel());

    }

}

class Airplane {
    private AirplaneEngine engine;
    private AirplaneChassis chassis;
    private AirplaneWings wings;
    private AirplaneWheels wheels;

    private double fuelCapacity;
    private double currentFuelLevel;

    public Airplane(AirplaneEngine engine, AirplaneChassis chassis, AirplaneWings wings, AirplaneWheels wheels, double fuelCapacity, double currentFuelLevel) {
        this.engine = engine;
        this.chassis = chassis;
        this.wings = wings;
        this.wheels = wheels;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public AirplaneEngine getEngine() {
        return engine;
    }

    public void setEngine(AirplaneEngine engine) {
        this.engine = engine;
    }

    public AirplaneChassis getChassis() {
        return chassis;
    }

    public void setChassis(AirplaneChassis chassis) {
        this.chassis = chassis;
    }

    public AirplaneWings getWings() {
        return wings;
    }

    public void setWings(AirplaneWings wings) {
        this.wings = wings;
    }

    public AirplaneWheels getWheels() {
        return wheels;
    }

    public void setWheels(AirplaneWheels wheels) {
        this.wheels = wheels;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "engine=" + engine +
                ", chassis=" + chassis +
                ", wings=" + wings +
                ", wheels=" + wheels +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                '}';
    }
}

class AirplaneEngine{

    private double horsepower;
    public AirplaneEngine(double horsepower){
        this.horsepower = horsepower;
    }

    public double getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(double horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "AirplaneEngine{" +
                "horsepower=" + horsepower +
                '}';
    }
}

class AirplaneChassis{

    private double weight;
    private int capacity;

    public AirplaneChassis(double weight, int capacity) {
        this.weight = weight;
        this.capacity = capacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "AirplaneChassis{" +
                "weight=" + weight +
                ", capacity=" + capacity +
                '}';
    }
}

class AirplaneWings{

    private double lift;

    public AirplaneWings(double lift) {
        this.lift = lift;
    }

    public double getLift() {
        return lift;
    }

    public void setLift(double lift) {
        this.lift = lift;
    }

    @Override
    public String toString() {
        return "AirplaneWings{" +
                "lift=" + lift +
                '}';
    }
}

class AirplaneWheels{
    private double height;

    public AirplaneWheels(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "AirplaneWheels{" +
                "height=" + height +
                '}';
    }
}

