
package csci1010.whiledemo;

import java.util.Scanner;

/**
 *
 * @author Jason Doty
 */
public class WhileDemo {

    public static void main(String[] args) {
        
        int count, number;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = keyboard.nextInt();
        
        count = 1;
        
        System.out.println("number = " + number + ", count = " + count);
        
        while (count < number)
        {
            System.out.print(count + ", ");
            count ++;
            System.out.println("number = " + number + ", count = " + count);
        }//end of while loop
        
        System.out.println();
        System.out.println("Buckle my shoe.");
    }
}
