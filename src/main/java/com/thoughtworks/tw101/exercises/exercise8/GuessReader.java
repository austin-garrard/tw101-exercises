package com.thoughtworks.tw101.exercises.exercise8;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Reads guesses from an InputStream. Provides prompts and error messages to a PrintStream.
 *
 * @author Austin Garrard
 * @version 1.0
 */
public class GuessReader {

    private Scanner scanner;
    private PrintStream printStream;
    private int upperBound;

    public GuessReader(int upperBound, InputStream inputStream, PrintStream printStream) {
        this.scanner = new Scanner(inputStream);
        this.printStream = printStream;
        this.upperBound = upperBound;
    }

    /**
     * Prompts the user to guess a number.
     *
     * @return -1 if the input is not a number or not in bounds, the input otherwise
     */
    public int readGuess() {
        int guess;

        this.printStream.print(" > ");
        try {
            guess = this.scanner.nextInt();
        } catch (InputMismatchException e) {
            this.printStream.println("Please enter a number in the range (1,100).");
            this.scanner.next();
            return -1;
        } catch (NumberFormatException e) {
            //including due to instructions, but Scanner.nextInt() does not throw NumberFormatException
            this.printStream.println("Please enter a number in the range (1,100).");
            this.scanner.next();
            return -1;
        }

        if (guess <= 1 || guess >= this.upperBound) {
            this.printStream.println("Please enter a number in the range (1,100).");
            return -1;
        }

        return guess;
    }
}
