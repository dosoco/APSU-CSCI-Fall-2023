package csci1011.jdotylab2;

import java.util.Scanner;

/**
 *CSCI 1011 LAB 2
 * @author Jason Doty
 * A program that calculates interest on a deposit
 */

public class JDotyLab2 {
    
    public static final double INTEREST_RATE = 0.059; // 4.9% annually
    

    public static void main(String[] args) {
        //define variables
        double balance;
        double percent = INTEREST_RATE * 100;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to Jason Doty's interest calculator.");
        System.out.println();
        System.out.println("Please enter your initial deposit amount:");
        balance = keyboard.nextDouble();
        
        balance += (balance * INTEREST_RATE);
        
        
        System.out.println("With a " + percent + "% APR your deposit will be worth $" + balance + " in one year");
        
        balance += (balance * INTEREST_RATE)* 2;
        
        System.out.println("and at " + percent + "% APR your deposit will be worth $" + balance + " in two years");
    }
    
}
