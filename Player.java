package com.example.createtask_project;

import java.util.ArrayList;

public class Player {
    private String playerName = "";
    private int points = 0;
    private ArrayList<String> answers;
    public Player(String pn){
        playerName = pn;
    }
    public String getPlayerName(){
        return playerName;
    }
    public int getPoints(){
        return points;
    }
    public void increasePoints(int multiplier){
        points+=multiplier;
    }
}
