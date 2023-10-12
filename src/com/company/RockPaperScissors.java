package com.company;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        char playAgain;

        do {
            // Get move choice from player A
            char playerAChoice = getPlayerMove("Player A");

            // Get move choice from player B
            char playerBChoice = getPlayerMove("Player B");

            // Display the results
            displayResults(playerAChoice, playerBChoice);

            // Prompt the user to play again
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.next().charAt(0);

        } while (Character.toUpperCase(playAgain) == 'Y');

        // Close the scanner
        scanner.close();
    }

    private static char getPlayerMove(String playerName) {
        Scanner scanner = new Scanner(System.in);
        char move;

        do {
            System.out.print(playerName + ", enter your move (R/P/S): ");
            move = scanner.next().toUpperCase().charAt(0);
        } while (move != 'R' && move != 'P' && move != 'S');

        return move;
    }

    private static void displayResults(char playerA, char playerB) {
        System.out.println("Player A chose: " + playerA);
        System.out.println("Player B chose: " + playerB);

        if (playerA == playerB) {
            System.out.println("It's a Tie!");
        } else if ((playerA == 'R' && playerB == 'S') || (playerA == 'P' && playerB == 'R') || (playerA == 'S' && playerB == 'P')) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }

        System.out.println(); // Add a newline for better formatting
    }
}