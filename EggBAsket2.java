package csci1010.eggbasket2;

import java.util.Scanner;

/**
 *
 * @author Jason Doty
 */
public class EggBAsket2 {

    public static void main(String[] args) {
        //compute for total eggs from number of baskets & eggs per basket
        int numberOfBaskets, eggsPerBasket, totalEggs;
        
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
        
        eggsPerBasket = eggsPerBasket - 2;
        
        totalEggs = numberOfBaskets * eggsPerBasket;
        System.out.println("You now have");
        System.out.println(eggsPerBasket + " eggs per basket and");
        System.out.println(numberOfBaskets + " baskets, then");
        System.out.println("the total number of eggs is " + totalEggs);
    }
}
