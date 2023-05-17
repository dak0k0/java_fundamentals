package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.A;

class PolymorphismDemo {

    public static void main(String[] args) {

        // Overload
        System.out.println("Overloading demo:");
        OverloadingDemo overloadingDemo1 = new OverloadingDemo();
        OverloadingDemo overloadingDemo2 = new OverloadingDemo(1,2,3);
        System.out.println(overloadingDemo1.toString());
        System.out.println(overloadingDemo2.toString());
        System.out.println();

        // Override
        System.out.println("Overriding demo");
        OverridingDemoParent parent = new OverridingDemoParent();
        OverridingDemoChild child = new OverridingDemoChild();
        parent.someMethod();
        child.someMethod();

        OverridingDemoParent child2 = new OverridingDemoChild();
        child2.someMethod(); // Prints child called
        System.out.println(child2.name); // Prints parent
        // child2.childUniqueMethod(); // Error, because childUniqueMethod() is only accessible by children
        // Essentially, when using a superclass reference variable for a subclass object, if a method is defined in the superclass but is overriden in the subclass, the overriden method will be used.
        // This is useful for when you do not know the type of an object. For example, in an ArrayList containing both children and parents, we should iterate through using an iterator of the parent superclass.
        // We will be able to access overriden methods, but methods unique to child classes will be unavailable.
        // For more information, visit: https://www.geeksforgeeks.org/referencing-subclass-objects-subclass-vs-superclass-reference/#
        System.out.println();

        // Interface
        System.out.println("Interface demo");
        Warrior warrior = new Warrior();
        Assassin assassin = new Assassin();
        Mage mage = new Mage();

        warrior.dmgMitigationSkill();
        assassin.dmgMitigationSkill();
        mage.dmgMitigationSkill();
    }

}

interface ClassAbilities{

    void regularAttack();
    void dpsSkill();
    void dmgMitigationSkill();


}

class Warrior implements ClassAbilities{

    public void regularAttack(){
        System.out.println("Warrior executes regular attack!");
    }
    public void dpsSkill(){
        System.out.println("Warrior executes a DPS skill!");
    }
    public void dmgMitigationSkill(){
        System.out.println("Warrior enters tank stance!");
    }

}

class Assassin implements ClassAbilities{

    public void regularAttack(){
        System.out.println("Assassin executes regular attack!");
    }
    public void dpsSkill(){
        System.out.println("Assassin executes a DPS skill!");
    }
    public void dmgMitigationSkill(){
        System.out.println("Assassin turns invisible!");
    }

}

class Mage implements ClassAbilities{

    public void regularAttack(){
        System.out.println("Mage executes regular attack!");
    }
    public void dpsSkill(){
        System.out.println("Mage executes a DPS skill!");
    }
    public void dmgMitigationSkill(){
        System.out.println("Mage casts a shield spell!");
    }

}

class OverloadingDemo {

    int a;
    int b;
    int c;

    public OverloadingDemo(){
        a = 0;
        b = 0;
        c = 0;
    }

    public OverloadingDemo(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "OverloadingDemo{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

class OverridingDemoParent {

    String name = "parent";
    public void someMethod(){
        System.out.println("Parent method called");
    }

}

class OverridingDemoChild extends OverridingDemoParent {

    String name = "child";
    @Override
    public void someMethod(){
        System.out.println("Child method called");
    }

    public void childUniqueMethod(){
        System.out.println("This method is unique to children");
    }

}