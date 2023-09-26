package csci1010.stringequalitydemo;

import java.util.Scanner;

/**
 *
 * @author Jason Doty
 */
public class StringEqualityDemo {

    public static void main(String[] args) {
        //declare variables required
        String s1, s2;
        
        System.out.println("Enter two lines of text: ");
        Scanner keyboard = new Scanner(System.in);
        
        s1 = keyboard.nextLine();
        s2 = keyboard.nextLine();
        
        //comparison & dipslay (using if-else)
        if (s1.equals(s2))
            System.out.println("The two lines are equal. ");
            //action1
        else
            //action2
            System.out.println("The two lines are not equal.");
        //end of first if-else statement
        if (s1.equals(s2))
            System.out.println("The two lines are equal. ");
            //action1
        else
            //action2
            System.out.println("The two lines are not equal.");
        //end of second if-else statement
        
        if (s1.equalsIgnoreCase(s2))
            System.out.println("But the lines are equal, ignoring case");
        else
            System.out.println("Lines are not equal, even ignoring case");
    }
}
