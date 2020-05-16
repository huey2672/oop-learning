package com.huey.learning.oop.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MonsterFactory {

    private static Map<MonsterType, String> monsterImagePathMap = new HashMap<>();

    static {
        monsterImagePathMap.put(MonsterType.MUSHROOM, "/images/monster/mushroom.png");
        monsterImagePathMap.put(MonsterType.TORTOISE, "/images/monster/tortoise.png");
    }

    public static Monster createMonster(MonsterType monsterType, Position position) {
        Monster monster = new Monster();
        monster.setMonsterType(monsterType);
        monster.setPosition(position);
        Image image = ImageFactory.createImage(monsterImagePathMap.get(monsterType));
        monster.setImage(image);
        return monster;
    }

}
