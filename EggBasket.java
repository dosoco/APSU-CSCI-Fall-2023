
package csci1010.eggbasket;


import java.util.Scanner;
/**
 *
 * @author Jason Doty
 */
public class EggBasket {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        Compute total eggs from number of baskets & eggs per basket
           int numberOfBaskets, eggsPerBasket, totalEggs;
           //variables names in lowerCamelCase
           //Indentifier: letters, digits (0-9), underscore (_)
           Scanner keyboard = new Scanner(System.in);
           System.out.println("Enter the number of eggs in each basket:");
           eggsPerBasket = keyboard.nextInt();
           System.out.println("Enter the number of baskets:");
           numberOfBaskets = keyboard.nextInt();
           
           totalEggs = numberOfBaskets * eggsPerBasket;
           
           System.out.println("If you have");
           System.out.println(eggsPerBasket + " eggs per basket and");
           System.out.println(numberOfBaskets + " baskets, then");
           System.out.println("the total number of eggs is " + totalEggs);
    }
}
