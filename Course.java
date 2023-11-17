
package csci1011.jdotylab11;

import java.util.Scanner;

/**
 * CSCI 1011 Lab 11
 * @author Jason Doty
 * This project works with course scores and credits to give average grades
 */
public class Course {
    // Private instance variables
    private final String courseCode;
    private final String courseTitle;
    private final double creditHours;
    private final double[] scores;

    // Four-argument constructor
    public Course(String courseCode, String courseTitle, double creditHours, int numStudents) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
        this.scores = new double[numStudents];
    }

    // Public method to read scores
    public void readScores() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter scores for " + scores.length + " students:");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = keyboard.nextDouble();
        }
    }

    // Public method to display course information
    public void displayInfo() {
        System.out.println(courseCode + ": " + courseTitle + " (" + creditHours + " credit hours)");
        System.out.println("Class size: " + scores.length);
        System.out.print("Scores:");
        for (double score : scores) {
            System.out.print(" " + score);
        }
        System.out.println();  // Move to the next line after printing scores
    }

    // Private helper method to calculate the sum of scores
    private double calculateSum() {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum;
    }

    // Public method to get the average score
    public double getAverage() {
        double sum = calculateSum();
        return sum / scores.length;
    }

    // Public method to get the maximum score
    public double getMax() {
        double max = scores[0];
        for (double score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    // Public method to get the minimum score
    public double getMin() {
        double min = scores[0];
        for (double score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }
}
