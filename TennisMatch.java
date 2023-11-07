
package csci1010.jdotyassign5;

/**
 * CSCI 1010
 * @author Jason Doty
 * This program is a tennis match simulator
 */
public class TennisMatch {
    private int setsToWin;
    private double player1WinProbability;
    private double player2WinProbability;
    private boolean player1Serving;
    private int player1Games;
    private int player2Games;
    private int player1Sets;
    private int player2Sets;
    private String results;

    public TennisMatch(int setsToWin, double player1WinProbability, double player2WinProbability) {
        this.setsToWin = setsToWin;
        this.player1WinProbability = player1WinProbability;
        this.player2WinProbability = player2WinProbability;
        this.player1Serving = true;
        this.player1Games = 0;
        this.player2Games = 0;
        this.player1Sets = 0;
        this.player2Sets = 0;
        this.results = "";
    }

    private void playSet() {
        player1Games = 0;
        player2Games = 0;
        String setResult = "";

        while (!setOver()) {
            playGame();
        }

        if (player1Games > player2Games) {
            player1Sets++;
        } else {
            player2Sets++;
        }

        setResult = player1Games + "-" + player2Games;
        results = results + " " + setResult;
    }

    private void playGame() {
        double randomValue = Math.random();

        if (player1Serving) {
            if (randomValue <= player1WinProbability) {
                player1Games++;
            } else {
                player2Games++;
            }
        } else {
            if (randomValue <= player2WinProbability) {
                player2Games++;
            } else {
                player1Games++;
            }
        }

        player1Serving = !player1Serving;
    }

    private boolean matchOver() {
        return player1Sets == setsToWin || player2Sets == setsToWin;
    }

    private boolean setOver() {
        return (player1Games >= 6 && player1Games >= player2Games + 2) || (player2Games >= 6 && player2Games >= player1Games + 2);
    }

    public void playMatch() {
        while (!matchOver()) {
            playSet();
        }

        String winner;
        if (player1Sets > player2Sets) {
            winner = "Player 1";
        } else {
            winner = "Player 2";
        }

        System.out.println(winner + " wins:" + results);
    }
}
