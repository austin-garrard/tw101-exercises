package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

public class Main {

    public static void main(String[] args) {

        int upperBound = 100;
        GuessMachine guessMachine = new GuessMachine(upperBound);
        GuessReader guessReader = new GuessReader(upperBound, System.in, System.out);

        System.out.format("A random number between 1 and %d has been generated. Guess it.\n", upperBound);
        boolean guessed = false;
        while (!guessed) {
            int number = guessReader.readGuess();

            if (number == -1) {
                continue;
            }

            int result = guessMachine.checkGuess(number);

            if (result == 0) {
                System.out.println("Correct!");
                guessed = true;
            } else if (result == 1) {
                System.out.println("Guess Higher.");
            } else if (result == -1) {
                System.out.println("Guess Lower.");
            }
        }


    }
}
