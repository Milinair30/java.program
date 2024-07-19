package com.classdemo;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate random choices for the computer
        Random random = new Random();

        // Game instructions
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your move (rock, paper, or scissors). To exit the game, type 'exit'.");

        while (true) {
            // Get the user's move
            System.out.print("Your move: ");
            String userMove = scanner.nextLine().toLowerCase();

            // Check if the user wants to exit the game
            if (userMove.equals("exit")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }

            // Validate the user's move
            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                System.out.println("Invalid move. Please enter 'rock', 'paper', or 'scissors'.");
                continue;
            }

            // Generate the computer's move
            int computerMoveIndex = random.nextInt(3);
            String computerMove;
            if (computerMoveIndex == 0) {
                computerMove = "rock";
            } else if (computerMoveIndex == 1) {
                computerMove = "paper";
            } else {
                computerMove = "scissors";
            }

            // Determine the winner
            System.out.println("Computer move: " + computerMove);
            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((userMove.equals("rock") && computerMove.equals("scissors")) ||
                       (userMove.equals("paper") && computerMove.equals("rock")) ||
                       (userMove.equals("scissors") && computerMove.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        // Close the scanner
        scanner.close();
    }
}

