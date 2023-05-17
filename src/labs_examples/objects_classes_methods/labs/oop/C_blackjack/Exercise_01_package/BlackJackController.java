package labs_examples.objects_classes_methods.labs.oop.C_blackjack.Exercise_01_package;

import java.util.Scanner;

public class BlackJackController {

    public static void main(String[] args) {

        playBlackJack();

    }

    public static void playBlackJack(){

        Player user = new Player();
        Player computer = new Player();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user's name: ");
        String username = scanner.nextLine();
        System.out.println();

        user.setName(username);
        computer.setName("computer");

        Deck deck = new Deck();
        deck.populateDeck();
        for(int i = 0; i < 2; i++){
            deck.deal(user);
            deck.deal(computer);
        }
        printHand(user);

        String answer;
        do {
            System.out.println("Would you like another card? (Y/N): ");
            answer = scanner.nextLine();
            System.out.println();
            if(answer.equals("Y")){
                deck.deal(user);
                printHand(user);
            } else if(!answer.equals("Y") & !answer.equals("N")){
                System.out.println("Invalid answer. Selecting N....");
            } else{}

            if(computer.computerAI()){
                deck.deal(computer);
                computer.hand.getHandScore();
                System.out.println("The computer hits!");
            } else {
                System.out.println("The computer stays!");
            }

        } while( !(!answer.equals("Y") & !computer.computerAI()) & !(user.hand.greaterThan21() | computer.hand.greaterThan21()) );

        System.out.println();
        System.out.println(user.name + "'s hand was worth " + user.hand.getHandScore() + ".");
        System.out.println("The computer's hand was worth " + computer.hand.getHandScore() + ".");
        if(user.hand.greaterThan21() & !computer.hand.greaterThan21()){
            System.out.println(user.name + " busted! The computer wins!");
        } else if (computer.hand.greaterThan21() & !user.hand.greaterThan21()) {
            System.out.println("The computer busted! " + user.name + " wins!");
        } else if (computer.hand.getHandScore() > user.hand.getHandScore()){
            System.out.println("The computer wins!");
        } else if (user.hand.getHandScore() > computer.hand.getHandScore()) {
            System.out.println(user.name + " wins!");
        } else{
            System.out.println("It's a draw!");
        }

    }

    public static void printHand(Player player){

        System.out.print("Your hand: ");
        for(Card card : player.hand.cards){
            System.out.print(card.getRank() + " of " + card.suit + " | ");
        }
        System.out.println();
        System.out.println("The value of your hand is " + player.hand.getHandScore());
        System.out.println();

    }

}
