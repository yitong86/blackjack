package com.sophia;

import java.util.*;

public class Deck {
    private List<Card> deck ;
    private  final static  int[] RANKS = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    //List<Card> arrList = new ArrayList<>();
    //ArrayList<Card> arrList = new ArrayList<>();

    public Deck() {
        //collections ->List->ArrayLists();
        this.deck = new ArrayList<>();
        for (int i = 0; i < RANKS.length; i++) {//all of our ranks range from 1-13//i=0 Ace
            //for each loop.Suit is datatype
            for (Suit s : Suit.values()) {//Ace DIAMONDS/CLUBS/SPADES/HEARTS
                //{KEY:VALUE,KEY2,VAL2...}
                //Do you want to iterate over a ) the keys,b) the values,c)both
                deck.add(new Card(s, RANKS[i]));//make instance for Card constructor Card(Suit suit,int rank) add to deck ArrayList
               // System.out.println(deck.get(deck.size() - 1));//deck.get(0) deck[0]

            }

        }
    }
    public void shuffle(){
        Collections.shuffle(deck);
    }
    //make get to access the code outside this class
    public  List<Card> getDeck(){
        return deck;
    }
}


