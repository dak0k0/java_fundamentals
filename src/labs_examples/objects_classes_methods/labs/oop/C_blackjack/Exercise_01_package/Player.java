package labs_examples.objects_classes_methods.labs.oop.C_blackjack.Exercise_01_package;

public class Player {

    // instance variables
    String name;
    Hand hand = new Hand();
    int potValue;

    // constructors

    public Player(){}

    public Player(String name, Hand hand, int potValue) {
        this.name = name;
        this.hand = hand;
        this.potValue = potValue;
    }

    // methods
    public boolean computerAI(){
        return hand.handValue < 16;
    }

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }
}
