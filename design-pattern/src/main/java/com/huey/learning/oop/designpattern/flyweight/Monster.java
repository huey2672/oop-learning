package com.huey.learning.oop.designpattern.flyweight;

import lombok.Data;

@Data
public class Monster {

    private MonsterType monsterType;
    private Position position;
    private Image image;

    public void render() {
        // Our code for rendering the monster
    }

    public void moveUp(int d) {
        position.setY(position.getY() + d);
    }

    public void moveDown(int d) {
        position.setY(position.getY() - d);
    }

    public void moveLeft(int d) {
        position.setX(position.getX() - d);
    }

    public void moveRight(int d) {
        position.setX(position.getX() + d);
    }
}
