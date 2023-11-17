
package csci1010.jdotyassign6;

import java.util.Scanner;

/**
 * CSCI 1010 Assignment 6
 * @author Jason Doty
 * This program calculates information about a sequence of tracks on an album
 */
public class JDotyAssign6 {

    private static final int NUM_TRACKS = 12;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] trackLengthsInSeconds = new int[NUM_TRACKS];

        // Display a welcome message
        System.out.println("Welcome to Jason Doty's Album Length Calculator");
        System.out.println("Please enter all track lengths in minutes and seconds separated by a space.\n");

        // Prompt for and read the lengths of 12 tracks
        for (int trackNumber = 1; trackNumber <= NUM_TRACKS; trackNumber++) {
            System.out.print("Track " + trackNumber + ": ");
            int minutes = keyboard.nextInt();
            int seconds = keyboard.nextInt();
            trackLengthsInSeconds[trackNumber - 1] = minutes * 60 + seconds;
        }

        // Calculate and display track information
        displayShortestTrack(trackLengthsInSeconds);
        displayLongestTrack(trackLengthsInSeconds);
        displayTotalAlbumLength(trackLengthsInSeconds);
        displayAverageTrackLength(trackLengthsInSeconds);
    }

    private static void displayTime(int totalSeconds) {
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        System.out.printf("%d:%02d", minutes, seconds);
    }

    private static void displayShortestTrack(int[] trackLengthsInSeconds) {
        int shortestTrack = 0;
        for (int i = 1; i < trackLengthsInSeconds.length; i++) {
            if (trackLengthsInSeconds[i] < trackLengthsInSeconds[shortestTrack]) {
                shortestTrack = i;
            }
        }
        System.out.print("The shortest track is #" + (shortestTrack + 1) + " at ");
        displayTime(trackLengthsInSeconds[shortestTrack]);
        System.out.println();
    }

    private static void displayLongestTrack(int[] trackLengthsInSeconds) {
        int longestTrack = 0;
        for (int i = 1; i < trackLengthsInSeconds.length; i++) {
            if (trackLengthsInSeconds[i] > trackLengthsInSeconds[longestTrack]) {
                longestTrack = i;
            }
        }
        System.out.print("The longest track is #" + (longestTrack + 1) + " at ");
        displayTime(trackLengthsInSeconds[longestTrack]);
        System.out.println();
    }

    private static void displayTotalAlbumLength(int[] trackLengthsInSeconds) {
        int totalLength = 0;
        for (int trackLength : trackLengthsInSeconds) {
            totalLength += trackLength;
        }
        System.out.print("The total length of the album is: ");
        displayTime(totalLength);
        System.out.println();
    }

    private static void displayAverageTrackLength(int[] trackLengthsInSeconds) {
        int totalLength = 0;
        for (int trackLength : trackLengthsInSeconds) {
            totalLength += trackLength;
        }
        int averageLength = totalLength / NUM_TRACKS;
        System.out.print("The average length of a track is: ");
        displayTime(averageLength);
        System.out.println();
    }
}


