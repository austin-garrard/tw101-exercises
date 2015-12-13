package com.thoughtworks.tw101.exercises.exercise6;


public class Orc extends AbstractMonster {

    public Orc() {
        super("Orc", 20);
    }

    @Override
    public void takeDamage(int amount) {
        this.modifyHitPointsBy(-amount);
    }

}
