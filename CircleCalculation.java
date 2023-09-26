package csci1010.circlecalculation;

import java.util.Scanner;

/**
 * Program to compute area of a circle
 * @author Jason Doty
 * Email address: jdoty4@my.apsu.edu
 * Programming Assignment 2
 * Last Changed: Sept 12, 2023
 * 
 */
/*
This is a multi-line comment
*/
public class CircleCalculation {

    public static void main(String[] args) {
        
        double radius; //in inches
        double area; // in square inches
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the radius of a cirlce in inches");
        radius = keyboard.nextDouble();
        area = 3.14159 * radius * radius;
        System.out.println("A circle of radius " + radius + " inches");
        System.out.println("has an area of " + area + " square inches");
    }
}
