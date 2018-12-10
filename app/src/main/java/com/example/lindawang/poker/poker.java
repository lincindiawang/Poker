package com.example.lindawang.poker;

import java.util.Random;

public class poker {
    card[] cards = new card[52];
    public poker(){
        for (int i = 0; i < 52; i++) {
            int r = new Random(  ).nextInt(52);
            card tmp = cards[i];
            cards[i] = cards[r];
            cards[r] = tmp;
        }
    }



}
