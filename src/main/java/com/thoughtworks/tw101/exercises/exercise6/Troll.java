package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {

    private String name;
    private int hitPoints;

    public Troll() {
        this.name = "Troll";
        this.hitPoints = 40;
    }

    @Override
    public void takeDamage(int amount) {
        this.hitPoints -= amount / 2;
    }

    @Override
    public void reportStatus() {
        System.out.format("\tThis %s has %d hit points!\n", this.name, this.hitPoints);
    }
}
