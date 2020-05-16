package com.huey.learning.oop.designpattern.flyweight;

public class FlyweightMain {

    public static void main(String[] args) {

        Monster mushroomMonster1 = MonsterFactory.createMonster(MonsterType.MUSHROOM, new Position(10, 0));
        System.out.println(mushroomMonster1);

        Monster mushroomMonster2 = MonsterFactory.createMonster(MonsterType.MUSHROOM, new Position(20, 0));
        System.out.println(mushroomMonster2);

    }

}
