package csci1011.jdotylab3;

import java.util.Scanner;

/**
 * CSCI 1011 LAB 3
 * @author Jason Doty
 * A program that tests our knowledge of materials covered so far
 */
public class JDotyLab3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // user input
        System.out.println("Enter the course code:");
        String courseCode = keyboard.nextLine();
        System.out.println();
        // user input
        System.out.println("Enter the course title:");
        String courseTitle = keyboard.nextLine();
        System.out.println();
        
        //concat String variables
        String welcomeMessage = "Welcome to " + courseCode + ": " + courseTitle;
        System.out.println(welcomeMessage);
        System.out.println();
        //toLowerCase method
        System.out.println("Testing toLowerCase method:");
        System.out.println(welcomeMessage.toLowerCase());
        System.out.println();
        //toUpperCase method
        System.out.println("Testing toUpperCase method:");
        System.out.println(welcomeMessage.toUpperCase());
        System.out.println();
        //length method
        System.out.println("Testing length method:");
        System.out.println(welcomeMessage.length());
        System.out.println();
        
        //equals method
        String welcomeMessage2 = welcomeMessage.toUpperCase();
        
        System.out.println("Testing equals method:");
        
        if (welcomeMessage.equals(welcomeMessage2))
            System.out.println("Messages are equal: true ");
        else 
            System.out.println("Messages are equal: false");
        System.out.println();
        
        //equalsIgnore Case method
        System.out.println("Testing equalsIgnoreCase method:");
        
        if (welcomeMessage.equalsIgnoreCase(welcomeMessage2))
            System.out.println("Messages are equal ignoring case: true");
        else
            System.out.println("Messages are equal ignoring case: false");
        System.out.println();
        //replace method
        String courseCode2 = "CSCI 1010";
        System.out.println("Testing replace method:");
        System.out.println(welcomeMessage.replace(courseCode, courseCode2));
        System.out.println();
        //indexOf, substring & concat methods
        System.out.println("Testing indexOf, substring, and concat methods:");
        int position = courseCode.indexOf("1011");
            courseCode = "CSCI " + courseCode.substring(5,position) +"1010";
            welcomeMessage = "Welcome to " + courseCode + ": " + courseTitle;
        System.out.println(welcomeMessage);
    }
}
