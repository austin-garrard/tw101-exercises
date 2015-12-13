package com.thoughtworks.tw101.exercises.exercise6;

public abstract class AbstractMonster implements Monster {

    private String name;
    private int hitPoints;

    public AbstractMonster(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    protected void modifyHitPointsBy(int amount) {
        this.hitPoints += amount;
    }

    public void reportStatus() {
        System.out.format("\tThis %s has %d hit points!\n", this.name, this.hitPoints);
    }


}
