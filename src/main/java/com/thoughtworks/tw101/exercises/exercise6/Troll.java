package com.thoughtworks.tw101.exercises.exercise6;

public class Troll extends AbstractMonster {


    public Troll() {
        super("Troll", 40);
    }

    @Override
    public void takeDamage(int amount) {
        this.modifyHitPointsBy(-amount / 2);
    }

}
