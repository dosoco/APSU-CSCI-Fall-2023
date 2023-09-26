
package csci1010.dotyassign1;
import java.util.Scanner;
/**
 *
 * @author Jason Doty
 * Program Description: Users are asked to input numbers that are then calculated to produce area and perimeter values for three geometric shapes which are then printed to the terminal.
 * Course: CSCI 1010
 * Assignment Name: Programming Assignment 1
 */
public class DotyAssign1 {

    public static void main(String[] args) {
         System.out.println("Welcome to Jason's geometry calculator.");
        System.out.println();
        
        System.out.println("Enter the square's side:");
        int sq1;
        
        Scanner keyboard = new Scanner(System.in);
        sq1 = keyboard.nextInt();
        System.out.println();
        
        System.out.println("Square Area:");
        System.out.println(sq1 * sq1);
        System.out.println();
        
        System.out.println("Square Perimeter:");
        System.out.println(sq1 * 4);
        System.out.println();
        
        System.out.println("Enter the Rectangle's length:");
        int rectLen;
        rectLen = keyboard.nextInt();
        System.out.println();
        
        System.out.println("Enter the Rectangle's width:");
        int rectWid;
        rectWid = keyboard.nextInt();
        System.out.println();
        
        System.out.println("Rectangle Area:");
        System.out.println(rectLen * rectWid);
        System.out.println();
        
        System.out.println("Rectangle Perimeter:");
        System.out.println((rectLen + rectWid) * 2);
        System.out.println();
        
        System.out.println("Enter the Triangle's base:");
        int triBas;
        triBas = keyboard.nextInt();
        System.out.println();
        
        System.out.println("Enter the Triangle's height:");
        int triHig;
        triHig = keyboard.nextInt();
        System.out.println();
        
        System.out.println("Triangle Area:");
        System.out.println((triBas*triHig)/2);
        System.out.println();
      
        
    }
}
