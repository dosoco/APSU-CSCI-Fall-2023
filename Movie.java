package csci1011.jdotylab7;

import java.util.Scanner;

/**
 *CSCI 1011 Lab 7
 * @author Jason Doty
 * This program takes user input of Movie information and returns a formatted 
 * version
 */

public class Movie {
    private String title;
    private String director;
    private int year;

    public Movie() {
        // Default constructor
    }

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the title of the movie:");
        title = keyboard.nextLine();

        System.out.println("Enter the director of the movie:");
        director = keyboard.nextLine();

        System.out.println("Enter the year the movie was released:");
        year = keyboard.nextInt();
    }

    public void writeOutput() {
        System.out.println(title + " dir. " + director + " (" + year + ")");
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public void setMovie(String newTitle, String newDirector, int newYear) {
        title = newTitle;
        director = newDirector;
        year = newYear;
    }
}

