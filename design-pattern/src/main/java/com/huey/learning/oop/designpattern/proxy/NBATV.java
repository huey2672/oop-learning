package com.huey.learning.oop.designpattern.proxy;

public class NBATV implements NBALive {

    @Override
    public void liveGame(Team homeTeam, Team visitingTeam) {
        System.out.println("Welcome to the game live, " + visitingTeam + " vs. " + homeTeam);
    }

}
