package labs_examples.objects_classes_methods.labs.oop.D_my_oop.Exercise_01_package;

import java.util.ArrayList;

public class Entity {

    // instance variables
    protected int health;
    protected static int level;
    protected static int levelUpHealthModifier = 1;
    protected ArrayList<Item> items = new ArrayList<>();
    protected Job job;

    // constructors
    public Entity(){
        health = 100;
        level = 1;
    }

    public Entity(int level) {
        this.level = level;
        this.health = 100 + level * levelUpHealthModifier;
    }

    public Entity(int level, ArrayList<Item> items) {
        this.level = level;
        this.health = 100 + level * levelUpHealthModifier;
        this.items = items;
    }

    // methods
    public void levelUp(){
        level++;
        health += levelUpHealthModifier;
    }

    // getters & setters
    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        health = 100 + level * levelUpHealthModifier;
    }

    public int getLevelUpHealthModifier() {
        return levelUpHealthModifier;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
