package labs_examples.objects_classes_methods.labs.objects;

class Exercise_04 {

    public static void main(String[] args) {

        Instrument instrumentOne = new Instrument();
        Instrument instrumentTwo = new Instrument("Clarinet","Woodwinds");
        Instrument instrumentThree = new Instrument("Trumpet", "Brass", "G3 - C5");

        Instrument[] instrumentsArray = {instrumentOne, instrumentTwo, instrumentThree};

        for(Instrument instrument : instrumentsArray){
            System.out.println(instrument.getName() + ": " + instrument.toString());
        }

    }

}

class Instrument{

    String name;
    String family;
    String range;

    public Instrument(){}

    public Instrument(String name, String family){
        this.name = name;
        this.family = family;
    }

    public Instrument(String name, String family, String range){
        this.name = name;
        this.family = family;
        this.range = range;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", range='" + range + '\'' +
                '}';
    }
}