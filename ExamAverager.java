
package csci1010.examaverager;

import java.util.Scanner;

/**
 *Computes the average of a list of(non negative) exam scores.
 * Repeats computation for more exams until the user says to stop.
 * @author Jason Doty
 */
public class ExamAverager {

    public static void main(String[] args) {
        System.out.println("Program to compute average of list");
        System.out.println(" (non negative) exam scores.");
        double sum, next;
        int numberOfStudents;
        String answer;
        
        Scanner keyboard = new Scanner(System.in);
        
        
        //sentinel value
        //negative values as sentinel
        
        do{
            System.out.println("enter scores one by one; ");
            System.out.println("Enter a negative number to stop.");
        //add up all the scores
        //divide sum by number of scores/students
        
            sum = 0;
            numberOfStudents = 0;
            next = keyboard.nextDouble();
            while (next >= 0){
            sum = sum + next;
            numberOfStudents++;
            next = keyboard.nextDouble();
            }//end of while loop
            if (numberOfStudents > 0)
                System.out.println("Average score: " + sum/numberOfStudents);
            else
                System.out.println("No scores to average");
            System.out.println("Average another exam?");
            System.out.println("(yes or no)");
            answer = keyboard.next();
        }while (answer.equalsIgnoreCase("yes"));
    }
}
