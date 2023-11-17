
package csci1011.jdotylab11;

import java.util.Scanner;

/**
 * CSCI 1011 Lab 11
 * @author Jason Doty
 * This program works with course scores and credit hours to give average grades
 */
public class JDotyLab11 {
    public static void main(String[] args) {
        // Call the createCourse method to create a Course object
        Course course = createCourse();

        // Call the readScores method to read scores of all students
        course.readScores();

        // Call the displayInfo method to display the course information
        course.displayInfo();

        // Display the average score using the getAverage method
        System.out.printf("The average score is: %.2f%n", course.getAverage());

        // Display the maximum score using the getMax method
        System.out.printf("The maximum score is: %.2f%n", course.getMax());

        // Display the minimum score using the getMin method
        System.out.printf("The minimum score is: %.2f%n", course.getMin());
    }

    // Static method to create a Course object
    public static Course createCourse() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the course code:");
        String code = keyboard.nextLine();

        System.out.println("Enter the course title:");
        String title = keyboard.nextLine();

        System.out.println("Enter the credit hour:");
        double creditHours = keyboard.nextDouble();

        System.out.println("Enter the number of students in the course:");
        int numStudents = keyboard.nextInt();

        // Create and return a Course object
        return new Course(code, title, creditHours, numStudents);
    }
}

