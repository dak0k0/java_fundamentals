package labs_examples.objects_classes_methods.labs.oop.D_my_oop.Exercise_01_package;

import java.sql.Array;
import java.util.ArrayList;

public class Warrior extends Entity{

    protected int levelUpHealthModifier = 20;
    protected ArrayList<Skill> skills = new ArrayList<>();
    protected Skill swordAttack = new Skill(1,"Sword Attack", "A simple attack with a sword.", 10);
    protected Skill shieldBlock = new Skill(5, "Shield Block", "A simple block with a shield.", 0);

    // constructors
    public Warrior() {
        health = 100;
        level = 1;;
    }

    public Warrior(int level){
        this.level = level;
        health = 100 + level * levelUpHealthModifier;
    }

    public Warrior(int level, ArrayList<Item> items){
        this.level = level;
        health = 100 + level * levelUpHealthModifier;
        this.items = items;
    }

    // methods
    public static void checkSkills(){

    }
}
