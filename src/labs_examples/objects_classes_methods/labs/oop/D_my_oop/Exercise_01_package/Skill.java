package labs_examples.objects_classes_methods.labs.oop.D_my_oop.Exercise_01_package;

public class Skill {

    protected String name;
    protected String description;
    protected int damage;
    protected int levelLearned;
    protected boolean skillUsed = false;

    // constructors
    public Skill() {}

    public Skill(int levelLearned, String name) {
        this.name = name;
    }

    public Skill(int levelLearned, String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public Skill(int levelLearned, String name, String description, int damage) {
        this.name = name;
        this.description = description;
        this.damage = damage;
    }
}
