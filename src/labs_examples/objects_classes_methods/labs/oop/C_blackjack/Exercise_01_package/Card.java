package labs_examples.objects_classes_methods.labs.oop.C_blackjack.Exercise_01_package;

public class Card {

    char suit;
    int cardValue;
    String cardRank;

    public Card(char suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public String getRank(){
        if(cardValue == 1){
            return "A";
        } else if(1 < cardValue & cardValue < 11){
            return Integer.toString(cardValue);
        } else if(cardValue == 11){
            return "Jack";
        } else if (cardValue == 12){
            return "Queen";
        } else if (cardValue == 13){
            return "King";
        } else{
            return "Invalid card value";
        }
    }
}
