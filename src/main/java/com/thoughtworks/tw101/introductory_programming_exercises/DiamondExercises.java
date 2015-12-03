package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

    public static void printCenteredAsterisks(int numAsterisk, int maxWidth) {
        StringBuilder sb = new StringBuilder();
        int numPadding = maxWidth - numAsterisk;

        //pad the front
        for (int p = 0; p < numPadding / 2; p++) {
            sb.append(" ");
        }

        //add the asterisks
        for (int a = 0; a < numAsterisk; a++) {
            sb.append("*");
        }

        System.out.println(sb.toString());
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        int maxWidth = (int) Math.pow(2, n) + 1;

        for (int i = 0; i < n; i++) {
            int numAsterisk = i == 0 ? 1 : (int) Math.pow(2, i) + 1;
            printCenteredAsterisks(numAsterisk, maxWidth);
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        int maxWidth = (int) Math.pow(2, n) + 1;

        for (int i = 0; i < n; i++) {
            int numAsterisk = i == 0 ? 1 : (int) Math.pow(2, i) + 1;
            printCenteredAsterisks(numAsterisk, maxWidth);
        }

        for (int i = n - 2; i >= 0; i--) {
            int numAsterisk = i == 0 ? 1 : (int) Math.pow(2, i) + 1;
            printCenteredAsterisks(numAsterisk, maxWidth);
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        int maxWidth = (int) Math.pow(2, n) + 1;

        for (int i = 0; i < n - 1; i++) {
            int numAsterisk = i == 0 ? 1 : (int) Math.pow(2, i) + 1;
            printCenteredAsterisks(numAsterisk, maxWidth);
        }

        StringBuilder sb = new StringBuilder();
        int numPadding = maxWidth - (int) Math.pow(2, n - 1);
        for (int p = 0; p < numPadding / 2; p++) {
            sb.append(" ");
        }
        sb.append("Austin");
        System.out.println(sb.toString());

        for (int i = n - 2; i >= 0; i--) {
            int numAsterisk = i == 0 ? 1 : (int) Math.pow(2, i) + 1;
            printCenteredAsterisks(numAsterisk, maxWidth);
        }
    }
}
