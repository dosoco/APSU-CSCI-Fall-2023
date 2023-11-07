
package csci1010.jdotyassign5;

import java.util.Scanner;

/**
 * CSCI 1010
 * @author Jason Doty
 * This program is a tennis match simulator
 */
public class JDotyAssign5 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Jason Doty's Tennis Match Simulator");

        char playAgain;
        do {
            System.out.print("Please enter the number of sets needed to win a match: ");
            int setsToWin = keyboard.nextInt();
            System.out.print("Please enter the probability of player 1 winning: ");
            double player1WinProbability = keyboard.nextDouble();
            System.out.print("Please enter the probability of player 2 winning: ");
            double player2WinProbability = keyboard.nextDouble();

            TennisMatch match = new TennisMatch(setsToWin, player1WinProbability, player2WinProbability);
            match.playMatch();

            System.out.print("Would you like to run another simulation? (Y/N): ");
            playAgain = keyboard.next().charAt(0);
        } while (playAgain == 'Y' || playAgain == 'y');
        System.out.println("Thank you for using Jason Doty's Tennis Match Simulator");
    } 
    
}
