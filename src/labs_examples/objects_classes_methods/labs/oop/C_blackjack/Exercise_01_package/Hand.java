package labs_examples.objects_classes_methods.labs.oop.C_blackjack.Exercise_01_package;

import java.util.ArrayList;

public class Hand {

    // instance variables
    ArrayList<Card> cards = new ArrayList<>();
    int handValue;

    // constructor
    public Hand(){}

    public Hand(ArrayList<Card> cards, int handValue) {
        this.cards = cards;
        this.handValue = handValue;
    }

    // methods
    public int getHandScore(){
        handValue = 0;
        for(Card card : cards){
            if(card.cardValue <= 10){
                handValue += card.cardValue;
            } else{
                handValue += 10;
            }
        }

        return handValue;
    }

    public boolean greaterThan21(){
        return handValue > 21;
    }
}
