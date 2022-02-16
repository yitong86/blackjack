package com.sophia;

import java.util.ArrayList;
import java.util.List;

public interface Actor {
    //public static final int cnt = 1;
     List<Card> hand = new ArrayList<>();


    public abstract void drawCard(Deck deck);//abstract method
}
