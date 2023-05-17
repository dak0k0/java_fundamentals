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
            cardRank = "A";
        } else if(1 < cardValue & cardValue < 11){
            return Integer.toString(cardValue);
        } else if(cardValue == 11){
            cardRank = "Jack";
        } else if (cardValue == 12){
            cardRank = "Queen";
        } else if (cardValue == 13){
            cardRank = "King";
        } else{
            cardRank = "Invalid card value";
        }
        return cardRank;
    }
}
