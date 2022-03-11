package com.example.createtask_project;

public class Game {
    private String[] bank = new String[]{
            "Slugs are very slow. Centipedes are fast. I am ____",
            "We never did find ____.",
            "This is your captain speaking. Fasten your seatbealts and prepare for ____.",
            "I made it out the trenches but ____ makes me want to go back.",
            "I got 99 problems but ____ isn't one of them.",
            "My gym teacher got fired for adding ____ to the obstacle course.",
            "In his newest act, David Blaine had to escape from ____.",
            "Even Thanos couldn't snap away ____.",
            "____, the newest show on Netflix.",
            "Harry, I'm going to let your in on a little secret. Every day, once a day, give yourself____.",
            "I'm not racist or anything, but I really don't like ____.",
            "The new Avengers movie was great until they added ____.",
            "NASA has announced that ____ may be headed on a collision course with Jupiter.",
            "Rub a dub dub, ____ in a tub!",
            "What don't you want to find in your Chinese food?",
            "How am I maintaining my relationship status?",
            "Coming to Broadway this season, ____: The Musical",
            "Rumor has it that Vladimir Putin's favorite delicacy is stuffed ____.",
            "But before I kill you, Mr. Bond, I must show you ____.",
            "Next on ESPN2, the World Series of ____.",
            "What gives me uncontrollable gas?"

    };
    private String[] game = new String[5];
    public Game(){
        for(int i = 0; i<game.length; i++){
            game[i] = bank[(int) (Math.random()* bank.length)];
        }
    }

    public String[] getGame(){
        return game;
    }


}
