package csci1011.jdotylab7;
import java.util.Scanner;
/**
 *CSCI 1011 Lab 7
 * @author Jason Doty
 * This program takes user input of Movie information and returns a formatted 
 * version
 */
public class JDotyLab7 {

    public static void main(String[] args) {
        Movie movie = new Movie();

        // Test the Movie class
        movie.readInput();
        movie.writeOutput();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a new title:");
        String newTitle = keyboard.nextLine();

        // Store the current director and year
        String oldDirector = movie.getDirector();
        int oldYear = movie.getYear();

        // Update the movie title
        movie.setMovie(newTitle, oldDirector, oldYear);

        // Display the updated movie details
        movie.writeOutput();
    }
}
