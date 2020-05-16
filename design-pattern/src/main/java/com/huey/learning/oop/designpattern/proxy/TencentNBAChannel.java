package com.huey.learning.oop.designpattern.proxy;

public class TencentNBAChannel implements NBALive {

    private Visitor visitor;
    private NBALive nbaLive;

    public TencentNBAChannel(Visitor visitor) {
        this.visitor = visitor;
        this.nbaLive = new NBATV();
    }

    @Override
    public void liveGame(Team homeTeam, Team visitingTeam) {
        if (visitor.isVIP()) {
            System.out.println("Dear member, Welcome to Tencent NBA.");
            nbaLive.liveGame(homeTeam, visitingTeam);
        } else {
            System.out.println("Sorry, you are not the VIP.");
        }
    }

}
