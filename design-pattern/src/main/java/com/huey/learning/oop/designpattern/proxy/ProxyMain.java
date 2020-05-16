package com.huey.learning.oop.designpattern.proxy;

public class ProxyMain {

    public static void main(String[] args) {

        Visitor huey = new Visitor();
        NBALive tencentNBAChannelForHuey = new TencentNBAChannel(huey);
        tencentNBAChannelForHuey.liveGame(Team.ROCKETS, Team.LAKERS);

        huey.buyMemberships();
        tencentNBAChannelForHuey.liveGame(Team.ROCKETS, Team.LAKERS);

    }

}
