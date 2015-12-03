package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

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

        guessMachine.printAllGuesses();


    }
}
