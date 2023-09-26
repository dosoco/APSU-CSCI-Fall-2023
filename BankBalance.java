package csci1010.bankbalance;

import java.util.Scanner;

/**
 * Program asks user fro input bank balance
 * Adds interest or penalty depending on
 * whether balance is positive or negative
 * @author Jason Doty
 */
public class BankBalance {
    
    public static final double OVERDRAWN_PENALTY = 8.00;
    public static final double INTEREST_RATE = 0.02; // 2% annually

    public static void main(String[] args) {
        
        //define variables
        double balance;
        
        System.out.print("Enter your checking account balnce: $");
        Scanner keyboard = new Scanner(System.in);
        balance = keyboard.nextDouble();
        System.out.println("Original balance $" + balance);
        
        //decision structure
        if (balance >= 0) //condition/boolean-expression that evaluates to true or false
            //action
            balance = balance + (INTEREST_RATE * balance)/12;
        else
            //action
            balance = balance - OVERDRAWN_PENALTY;
        
        //show output to user (output to console)
        System.out.println("After adjusting for one month");
        System.out.println("of interest and penalties,");
        System.out.println("your new balance is $" + balance);
    }
}
