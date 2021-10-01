package org.robert.c130.assessments;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        boolean keepPlaying = true;

        while (keepPlaying) {

            int rounds = getNumberOfRounds();

            int[] winCounts = playRounds(rounds);

            announceWinner(winCounts);

            keepPlaying = isPlayAgain();
        }
        System.out.println("Thanks for playing");
    }

    private static boolean isPlayAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play again? (yes/no)");
        String playAgainStr = scanner.nextLine();
        return playAgainStr.toLowerCase(Locale.ROOT).equals("yes");
    }

    private static int[] playRounds(int rounds) {
        Random random = new Random();
        int playerWins = 0;
        int cpuWins = 0;
        int ties = 0;
        for (int round = 0; round< rounds; round++) {
            int playerChoice = getPlayerChoice();
            int cpuChoice = random.nextInt(3) + 1;

            int winner = (playerChoice - cpuChoice + 3) % 3;
            switch (winner) {
                case 0:
                    System.out.println("Tie");
                    ties++;
                    break;
                case 1:
                    System.out.println("Congratulations! You won this round");
                    playerWins++;
                    break;
                case 2:
                    System.out.println("Sorry. The computer won this one");
                    cpuWins++;
                    break;
            }
        }
        return new int[]{playerWins, cpuWins, ties};
    }

    private static void announceWinner(int[] winCounts) {
        int playerWins = winCounts[0];
        int cpuWins = winCounts[1];
        int ties = winCounts[2];

        System.out.print("The final results are:\n" + ties + " ties, " + playerWins + " wins you, " + cpuWins + "" +
                " losses for you. So ");
        if (playerWins == cpuWins) {
            System.out.println("the final result was a tie.");
        }
        else if (playerWins > cpuWins) {
            System.out.println("you win! Congratulations!");
        }
        else {
            System.out.println("you lose. Sorry :(");
        }
    }

    private static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        int rounds;
        do {
            System.out.print("How many rounds (1-10)?: ");
            rounds = scanner.nextInt();
            if (1 <= rounds && rounds <= 10) {
                isValid = true;
            }
        } while(!isValid);
        return rounds;
    }

    private static int getPlayerChoice() {
        Scanner scanner = new Scanner(System.in);
        int playerChoice = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print("What's your choice? (1: Rock, 2: Paper, 3: Scissors): ");
            playerChoice = scanner.nextInt();
            if (playerChoice==1 || playerChoice==2 || playerChoice==3) {
                isValid = true;
            }
        }
        return playerChoice;
    }
}


