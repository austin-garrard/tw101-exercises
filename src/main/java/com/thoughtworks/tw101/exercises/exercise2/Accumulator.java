package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private int value;

    public Accumulator() {
        this.value = 0;
    }

    public void increment() {
        this.value++;
    }

    public int total() {
        return this.value;
    }

}
