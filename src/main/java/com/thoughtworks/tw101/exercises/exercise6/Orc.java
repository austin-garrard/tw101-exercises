package com.thoughtworks.tw101.exercises.exercise6;


public class Orc implements Monster {

    private String name;
    private int hitPoints;

    public Orc() {
        this.name = "Orc";
        this.hitPoints = 20;
    }

    @Override
    public void takeDamage(int amount) {
        this.hitPoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.format("\tThis %s has %d hit points!\n", this.name, this.hitPoints);
    }
}
