package com.example.lindawang.poker;

public class card {
    char[] suits = {'c','d','h','s'};
    int value;
    public card(int value){
        this.value = value;
    }


    public String get(){
        return  value%13+1 +"" + suits[value/13];
    }
}
