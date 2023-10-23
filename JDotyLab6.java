package csci1011.jdotylab6;

import java.util.Scanner;

/**
 *CSCI 1011 LAB 6
 * @author Jason Doty
 * This program is an arithmetic calculator that quizzes the user as well as
 * displays addition and multiplication tables.
 */
public class JDotyLab6 {
 
public static final int MAXIMUM_VALUE = 12;
public static final char MULTIPLY = '*';
public static final char ADD = '+';


public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
        int selection;
        int addNum;
        int multNum;
        int correctAnswers = 0;
        int addAnswer;
        int multAnswer;
        int col = 1;
        int colDash = 1;
        int row = 1;
        int addRow;
        String dash = "----";

       
        System.out.println("Welcome to Jason Doty's arithmetic quiz program");
        // loop to run program until user opts out
        do{
        System.out.println();
        System.out.println("Please choose from the following options: ");
        System.out.println("1. Addition Quiz ");
        System.out.println("2. Multiplication Quiz ");
        System.out.println("3. Addition Table ");
        System.out.println("4. Multiplication Table ");
        System.out.println("5. Exit the program ");
        selection = keyboard.nextInt();

            //Switch statement to run code for user selected option
            switch(selection){

                case 1:
                //user selects Addition Quiz
                    do{
                    System.out.println("Please choose a number between 1 and 12");
                    addNum = keyboard.nextInt();

                    }while(addNum < 1 || addNum >= MAXIMUM_VALUE);

                    for(int counter = 1; counter <= MAXIMUM_VALUE; counter++){
                       System.out.println(addNum + " " +  ADD + " " + counter + " =");
                       addAnswer = keyboard.nextInt();
                       if(addAnswer == (addNum + counter)){
                           correctAnswers += 1;

                       }
                    }  
                    System.out.println("You got " + correctAnswers + " right out of " + MAXIMUM_VALUE);
//                    System.exit(0);
                    break;
                case 2:
                //user selects Multiplication Quiz
                    do{
                    System.out.println("Please choose a number between 1 and 12");
                    multNum = keyboard.nextInt();
                    //error check for proper input
                    }while(multNum < 1 || multNum >= MAXIMUM_VALUE);

                    for(int counter = 1; counter <= MAXIMUM_VALUE; counter++){
                       System.out.println(multNum + " " +  MULTIPLY + " " + counter + " =");
                       multAnswer = keyboard.nextInt();
                       if(multAnswer == (multNum * counter)){
                           correctAnswers += 1;

                       }
                    }  
                    System.out.println("You got " + correctAnswers + " right out of " + MAXIMUM_VALUE);
//                    System.exit(0);

                    break;
                case 3:
                //user selects Addition Table
                    System.out.print("    |");
                    for(col = 1; col <= MAXIMUM_VALUE; col++){
                        System.out.printf("%4d", col);
                        
                    }
                    System.out.println();
                    System.out.print("----+");
                    for(colDash = 1; colDash <= MAXIMUM_VALUE; colDash++){
                        System.out.printf("%4s", dash);
                    }
                    System.out.println();
                    for(row = 1; row <= MAXIMUM_VALUE; row++){
                        System.out.print(row + "  |");
                         for(col = 1; col <= MAXIMUM_VALUE; col++){
                        System.out.printf( "%4d", col + row);    
                         }
                         System.out.println();
                    }
//                    System.exit(0);
                    break;
                case 4:
                //user selects Multiplication Table
                    System.out.print("    |");
                    for(col = 1; col <= MAXIMUM_VALUE; col++){
                        System.out.printf("%4d", col);
                        
                    }
                    System.out.println();
                    System.out.print("----+");
                    for(colDash = 1; colDash <= MAXIMUM_VALUE; colDash++){
                        System.out.printf("%4s", dash);
                    }
                    System.out.println();
                    for(row = 1; row <= MAXIMUM_VALUE; row++){
                        System.out.print(row + "  |");
                         for(col = 1; col <= MAXIMUM_VALUE; col++){
                        System.out.printf( "%4d", col * row);    
                         }
                         System.out.println();
                    }
//                    System.exit(0);
                    break;
                case 5:
                // user opts out of program
                    System.out.println("Thank you for using Jason Doty's arithmetic quiz program!");
                    System.exit(0);
                    break;
                default:
                //prompts user to make a valid choice
                    System.out.println("Invalid Choice");
                    break;
    }

                }while (selection != 5);

}
}

