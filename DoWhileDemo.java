
package csci1010.dowhiledemo;

import java.util.Scanner;

/**
 *
 * @author Jason Doty
 */
public class DoWhileDemo {

    public static void main(String[] args) {
        int count, number;
        
        System.out.println("Enter a number:");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        
        count = 1;
        
        System.out.println("number = " + number + ", count = " + count);
        
        do
        {
            System.out.println("Start iteration: number = " + number + ", count = " + count);
            System.out.println(count + ", ");
            count ++;
            System.out.println("End iteration: number = " + number + ", count = " + count);

        }while (count < number);
        
        System.out.println();
        System.out.println("Buckle my shoe.");
    }
}
