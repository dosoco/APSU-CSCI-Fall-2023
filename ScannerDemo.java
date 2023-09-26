package csci1010.scannerdemo;

import java.util.Scanner;


/**
 *
 * @author Jason Doty
 */
public class ScannerDemo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter two whole numbers seperated by one or more spaces.");
        
        int n1 = keyboard.nextInt();
        int n2 = keyboard.nextInt();
        System.out.println("You entered " + n1 + " and " + n2);
        
        System.out.println("Next enter two numbers.");
        System.out.println("A decimal point is OK.");
        
        double d1 = keyboard.nextDouble();
        double d2 = keyboard.nextDouble();
        System.out.println("You entered " + d1 + " and " + d2);
        
        System.out.println("Next enter two words: ");
        String s1 = keyboard.next();
        String s2 = keyboard.next();
        
        System.out.println("You entered \"" + s1 + "\" and \"" + s2 + "\"");
        
        keyboard.nextLine();
        
        System.out.println("Next enter a line of text:");
        s1 = keyboard.nextLine();
        System.out.println("You entered: \"" + s1 + "\"");
        
        
    }
}
