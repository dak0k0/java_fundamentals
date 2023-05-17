package labs_examples.objects_classes_methods.labs.oop.C_blackjack.Exercise_01_package;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    // instance variables
    Card[] cards;
    ArrayList<Integer> usedCards;

    // constructor
    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    // methods
    public void populateDeck(){

        char[] suits = {'♠', '♦', '♥', '♣'};
        int[] ranks = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        for(char suit : suits){
            for(int rank : ranks){
                for(int i = 1; i <= 52; i++){
                    cards[i].setSuit(suit);
                    cards[i].setCardValue(rank);
                }
            }
        }
    }

    public void deal(Player player) {

        int chosenCard;

        do {
            Random rand = new Random();
            chosenCard = rand.nextInt(52) + 1;
        } while (usedCards.contains(chosenCard));

        player.hand.cards.add(cards[chosenCard]);
        usedCards.add(chosenCard);

    }

    // getters & setters
    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }
}
