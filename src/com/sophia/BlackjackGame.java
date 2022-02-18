package com.sophia;

public class BlackjackGame {

    public static void evaluateGame(int playerPoints, int dealerPoints) {
        //this is where we need to add the appropriate conditional logic to determine
        //the outcome of the game
        if (playerPoints > 21 && dealerPoints < 21) {
            System.out.println("BUST! You lost:(");
        } else if (playerPoints == 21 && dealerPoints != 21) {
            System.out.println("Congratulations! You win :)");
        } else if (playerPoints < 21 && playerPoints > dealerPoints) {
            System.out.println("Congratulations! You win :)");
        } else if (dealerPoints < 21 && playerPoints > dealerPoints) {
            System.out.println("Sorry! You lost :( Dealer was close to 21");
        } else if (dealerPoints > 21 && playerPoints <= 21) {
            System.out.println("Congratulations!Dealer busts, you win :)");
        } else if (dealerPoints == 21 && playerPoints < 21){
            System.out.println("Sorry! Dealer got blackjack");
        }
    }
}
