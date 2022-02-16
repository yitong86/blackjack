package com.sophia;

public class Card {
    //Card have two main properties:suit,rank
    //suit:Diamonds,Clubs,Hearts,Spades
    //Rank:Ace ,2,3...10,Jack,Queen King
    //we need to make our own specific enum for suit.
    private Suit suit;
    private int rank;//1 = ace,11 = jack,12 = queen,13 = king
    public  Card(Suit suit,int rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    @Override
    public  String toString(){
        String strRank = "";
        switch (rank){

            case 1 -> strRank = "Ace";
            case 11 -> strRank = "Jack";
            case 12 -> strRank = "Queen";
            case 13 -> strRank = "King";
            default -> strRank = Integer.toString(rank);//rank = 2.rank ="2"
            //return the String object representing this Integer’s value.
        }
        return "This is the " + strRank + " of " + this.suit;
    }
}
