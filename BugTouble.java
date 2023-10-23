
package csci1010.bugtouble;

import java.util.Scanner;

/**
 *
 * @author Jason Doty
 * 
 */
public class BugTouble {
    
    public static final double GROWTH_RATE = 0.95;
    public static final double ONE_BUG_VOLUME = 0.002;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
 //           1. get Volume of house
                System.out.println("Enter the total volume of your house");
                System.out.print("in cubic feet:");
                   double houseVolume = keyboard.nextDouble();
 
 
 //          2. Get initial number of roaches in house
                System.out.println("Enter the estimated number of");
                System.out.println("roaches in your house:");
                int startPopulation = keyboard.nextInt();
 
 
 //          3.Compute number of weeks until house is full of roaches
 //              Incrementally add up new bugs per week
 //              repeat until the house is full
                 int countWeeks = 0;
                double population = startPopulation;
                double totalBugVolume = population * ONE_BUG_VOLUME;
  
 //Repeat until the house is full
 //repeat until totalBugVolumne reaches houseVolume
                
               double newBugs, newBugVolume;
               
               while (totalBugVolume < houseVolume)
              {
                  
                   newBugs = population * GROWTH_RATE;
                   newBugVolume = newBugs * ONE_BUG_VOLUME;
                   population = population + newBugs;
  
                   totalBugVolume = totalBugVolume + newBugVolume;
                   countWeeks++;
               }
 
 
 //          4. display results
//               System.out.println("countweeks, population, totalBugVolume: " 
//               + countWeeks + ", " + population + ", " + totalBugVolume + '.');
            System.out.println("Starting with a roach population of "
                    + startPopulation);
            System.out.println("and a house with a volume of "
            + houseVolume + "cubic feet,");
            System.out.println("and after " + countWeeks + " weeks");
            System.out.println("the house will be filled with "
             + (int) population + " roaches.");
            System.out.println("They will fill a volume of "
            + (int) totalBugVolume + " cubic feet.");
            System.out.println("Better call Debugging Experts Inc.");
            
            
    }
}
