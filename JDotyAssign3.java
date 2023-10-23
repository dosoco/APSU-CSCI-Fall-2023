
package csci1010.jdotyassign3;

import java.util.Scanner;

/**
 * CSCI 1010 Assignment 3
 * @author Jason Doty
 * This program calculates the age of a users dog in human years.
 */
public class JDotyAssign3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String dogName;
        int dogAge;
        int dogWeight;
        double humanAge = 0;
        String yesNo;
        
        do{
        System.out.println("Welcome to Jason Doty's Dog Age Calculator!");
        System.out.println();
        
        System.out.println("Please enter the name of your dog: ");
        dogName = keyboard.next();
        
            do{
            System.out.println("Please enter the actual age of your dog (1-16): ");
            dogAge = keyboard.nextInt();

            }while(dogAge <= 0 || dogAge > 16);
        
            do{
            System.out.println("Please enter your dog's weight in pounds: ");
            dogWeight = keyboard.nextInt();
    
            }while(dogWeight <= 0);
        
            if(dogAge == 1){
                humanAge = 15;
            }else
                if(dogAge >=2 && dogAge <=5){
                    humanAge = dogAge * 4 + 16;
                }else
                    if((dogAge >=6 && dogAge <=16) && (dogWeight <= 20)){
                        humanAge = dogAge * 4 + 16; 
                    }else
                        if((dogAge >=6 && dogAge <=16) && (dogWeight >= 21 && dogWeight <= 50)){
                            humanAge = dogAge * 4.5 + 15;
                        }else
                            if((dogAge >=6 && dogAge <=16) && (dogWeight > 50)){
                                humanAge = dogAge * 7.5;
                            }
            
        System.out.println();
        System.out.println(dogName + "'s age in human years is " + humanAge);
        System.out.println();
        
            do{
            System.out.println("Would you like to calculate the age of another dog? (Y/N): ");
            yesNo = keyboard.next();
                if((!yesNo.equalsIgnoreCase("y")) && (!yesNo.equalsIgnoreCase("n"))){
                    System.out.println("Error: invalid choice");
                }
            
            }while((!yesNo.equalsIgnoreCase("y")) && (!yesNo.equalsIgnoreCase("n")));

        }while(yesNo.equalsIgnoreCase("y"));

        System.out.println("Thank you for using the dog age calculator!");
    }
}
