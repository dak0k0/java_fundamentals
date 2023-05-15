package labs_examples.objects_classes_methods.labs.objects;

class Exercise_03 {

    public static void main(String[] args) {

        Person personOne = new Person("The Rizzler", 36, 750000);
        Car personOneCar = new Car("Chevy Volt", "Blue");

        System.out.println(personOne.getName() + " drives a " + personOneCar.getModel() + ".");

    }

}

class Person{

    String name;
    int age;
    double netWorth;

    public Person(String name, int age, double netWorth) {
        this.name = name;
        this.age = age;
        this.netWorth = netWorth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(double netWorth) {
        this.netWorth = netWorth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", netWorth=" + netWorth +
                '}';
    }
}
