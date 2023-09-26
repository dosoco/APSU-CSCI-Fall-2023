package csci1010.grader;

import java.util.Scanner;

/**
 *
 * @author Jason Doty
 */
public class Grader {

    public static void main(String[] args) {
        //declafre variables
        int score;
        char grade;
        
        //get input
        System.out.println("Enter your score. ");
        Scanner keyboard = new Scanner(System.in);
        score = keyboard.nextInt();
        
//        grade = 'F';
        //decisionmaking
//        if (score >= 90)
//            grade = 'A';
//        //end of if-stmt
//        
//        if (score >= 80 && score < 90)
//            grade = 'B';
//        
//        if (score >= 70 && score < 80)
//            grade = 'C';
//        
//        if (score >= 60 && score < 70)
//            grade = 'D';
        
//        if (score < 60)
//            grade = 'F';
        if (score >= 90)
            grade = 'A';
        //end of if-stmt
        
        else if (score >= 80)
            grade = 'B';
        
        else if (score >= 70)
            grade = 'C';
        
        else if (score >= 60)
            grade = 'D';
        
        else grade ='F';
        
        //dispaly output
        System.out.println("Score = " + score);
        System.out.println("Grade = " + grade);
    }
}
