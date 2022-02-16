package com.sophia;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to Blackjack!");
        Card testCard = new Card(Suit.DIAMONDS,3);
        Card queenHearts = new Card(Suit.HEARTS,12);
        Card aceClubs = new Card(Suit.CLUBS,1);
//        System.out.println(testCard.toString());
//        System.out.println(queenHearts.toString());
//        System.out.println(aceClubs.toString());
        Deck deck = new Deck();
        deck.shuffle();
        //System.out.println(deck.getCards());
        Player sophia = new Player("sophia",100);
        Dealer dealer = new Dealer();
        //System.out.println("You just drew a : ");
       // sophia.drawCard(deck);

        while(true){//outer while true loop is to show, either keep playing ot leave the table
            System.out.println("Hello! would you like (1) start a new game? or (2) leave the Blackjack table?");
            sophia.getHand().clear();//we ensure that if we're starting with empty hands for the player or dealer
            dealer.getHand().clear();
            int userResponse = input.nextInt();
            if(userResponse == 2){
                break;
            }else if(userResponse == 1){
                //start the game logic
                for(int i = 0;i < 2;i++){
                    sophia.drawCard(deck);
                    dealer.drawCard(deck);
                }
                //display hand
                sophia.displayHand();
                System.out.println("#################");
                dealer.displayHand();
                while (true){
                    //we need to add a check to see if the user is over 21,then they lose
                    //we also need to add logic for dealer , so they keep hitting until they have 17
                    System.out.println("Would you, " + sophia.getName() + " like to (1) hit,or (2) stand?");
                    int userHitOrStand = input.nextInt();
                    if(userHitOrStand == 1){
                        sophia.drawCard(deck);
                        sophia.displayHand();
                    }else if(userHitOrStand == 2){
                        break;
                    }
                }

            }

        }

    }
}
