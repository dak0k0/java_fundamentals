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

        user.setName(username);
        computer.setName("computer");

        System.out.println();

        System.out.println("Enter starting money: ");
        int potValue = scanner.nextInt();
        user.setPotValue(potValue);
        computer.setPotValue(potValue);

        System.out.println();

        Deck deck = new Deck();
        deck.populateDeck();

        do {
            System.out.println("How much would you like to wager?");
            int betValue = scanner.nextInt();
            user.betValue = betValue;
            computer.betValue = betValue;

            System.out.println();

            user.hand = new Hand();
            computer.hand = new Hand();

            for(int i = 0; i < 2; i++){
                deck.deal(user);
                deck.deal(computer);
            }
            printHand(user);

            String answer;
            do {
                System.out.println("Would you like another card? (Y/N):");
                answer = scanner.next();
                System.out.println();
                if(answer.equals("Y")){
                    deck.deal(user);
                    printHand(user);
                } else if (!answer.equals("Y") & !answer.equals("N")) {
                    System.out.println("Invalid answer. Selecting 'N...'\n");
                } else{}

                if(computer.computerAI()){
                    deck.deal(computer);
                    computer.hand.getHandScore();
                    System.out.println("The computer hits!\n");
                } else{
                    System.out.println("The computer stays!\n");
                }

            } while(!(!answer.equals("Y") & !computer.computerAI()) & !(user.hand.greaterThan21() | computer.hand.greaterThan21()));

            printWinner(determineWinner(user, computer, betValue));

        } while(user.potValue > 0 & computer.potValue > 0);

    }

    public static void printHand(Player player){

        System.out.print("Your hand: ");
        for(Card card : player.hand.cards){
            System.out.print(card.getRank() + " of " + card.suit + " | ");
        }
        System.out.println();
        System.out.println("The value of your hand is " + player.hand.getHandScore() + "\n");

    }

    public static Player[] determineWinner(Player user, Player computer, int betValue){
        Player[] playerList = new Player[2];
        System.out.println(user.name + "'s hand was worth " + user.hand.getHandScore() + ".");
        System.out.println("The computer's hand was worth " + computer.hand.getHandScore() + ".");
        if((user.hand.greaterThan21() & !computer.hand.greaterThan21()) | ((computer.hand.getHandScore() > user.hand.getHandScore()) & !computer.hand.greaterThan21())){
            playerList[0] = computer;
            playerList[1] = user;
            computer.potValue += betValue;
            user.potValue -= betValue;
            return playerList;
        } else if ((computer.hand.greaterThan21() & !user.hand.greaterThan21()) | (user.hand.getHandScore() > computer.hand.getHandScore())) {
            playerList[0] = user;
            playerList[1] = computer;
            computer.potValue -= betValue;
            user.potValue += betValue;
            return playerList;
        } else{
            return null;
        }
    }

    public static void printWinner(Player[] playerList){
        Player winner = playerList[0];
        Player loser = playerList[1];
        if(loser.hand.greaterThan21()){
            System.out.println(loser.name + " busted! " + winner.name + " wins!");
        } else{
            System.out.println(winner.name + " wins!");
        }
        System.out.println();
        for(Player player : playerList){
            System.out.println(player.name + " now has " + player.potValue + " dollars.");
        }
        System.out.println();
    }

    public static void printWinner(){
        System.out.println("It's a draw!");
    }
}
