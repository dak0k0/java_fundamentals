package labs_examples.objects_classes_methods.labs.objects;

class Airplane {
    AirplaneEngine engine;
    AirplaneChassis chassis;
    AirplaneWings wings;
    AirplaneWheels wheels;

    double fuelCapacity;
    double currentFuelLevel;

    public Airplane(AirplaneEngine engine, AirplaneChassis chassis, AirplaneWings wings, AirplaneWheels wheels, double fuelCapacity, double currentFuelLevel) {
        this.engine = engine;
        this.chassis = chassis;
        this.wings = wings;
        this.wheels = wheels;
        this.fuelCapacity = fuelCapacity;
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

    double horsepower;
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

    double weight;
    int capacity;

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

    double lift;

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
    double height;

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

