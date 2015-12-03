package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Random;

/**
 * Chooses a random number and provides feedback on guess of that number
 *
 * @author Austin Garrard
 * @version 1.0
 */
public class GuessMachine {

    private int numberToGuess;
    private ArrayList<Integer> allGuesses;

    /**
     * Constructs a GuessMachine with a random number to guess between 1 and upperBound (exclusive)
     *
     * @param upperBound The upper bound of the random number
     */
    public GuessMachine(int upperBound) {
        this.numberToGuess = new Random().nextInt(upperBound) + 1;
        this.allGuesses = new ArrayList<Integer>();
    }

    /**
     * Gives feedback on a guess of the number to guess
     *
     * @param number The guess
     * @return 0 if the guess equals the number to guess, -1 if the guess is less than the number to guess, 1 if the guess is the number to guess
     */
    public int checkGuess(int number) {
        this.allGuesses.add(number);

        if (number > this.numberToGuess) {
            return -1;
        } else if (number < this.numberToGuess) {
            return 1;
        }

        return 0;
    }

    /**
     * Prints all guesses that have been checked.
     */
    public void printAllGuesses() {
        System.out.println("All Guesses:");
        for (Integer guess : this.allGuesses) {
            System.out.format("\t%d\n", guess);
        }
    }
}
