
package csci1010.jdotyassign2;

import java.util.Scanner;

/**
 * CSCI 1010
 * Assignment 2
 * @author Jason Doty
 * This program will help people plan their workouts
 */
public class JDotyAssign2 {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to Jason Doty's Workout Calculator");
        System.out.println();
        System.out.println("Please enter your weight:");
            int weight = keyboard.nextInt();
            
        System.out.println("Please enter the minutes spent playing badminton:");
            int badmintonMins = keyboard.nextInt();
            //badminton caculations
            double badmintonCalsPerMin = .044;
            double badmintonBurnRate = (weight * badmintonCalsPerMin) * badmintonMins;
            
        System.out.println("Please enter the minutes spent running:");
            //running calculations
            int runningMins = keyboard.nextInt();
            double runningCalsPerMin = .087;
            double runningBurnRate = (weight * runningCalsPerMin) * runningMins;
            
        System.out.println("Please enter the minutes spent walking:");
            //walking calculations
            int walkingMins = keyboard.nextInt();
            double walkingCalsPerMin = .036;
            double walkingBurnRate = (weight * walkingCalsPerMin) * walkingMins;
            
        System.out.println("Please enter the minutes spent lifting weights:");
            //weight lifting calculations
            int liftingMins = keyboard.nextInt();
            double liftingCalsPerMin = .042;
            double liftingBurnRate = (weight * liftingCalsPerMin) * liftingMins;
            
        System.out.println();
        System.out.printf("You spent "+ badmintonMins + " minutes playing badminton and burned %6.2f calories.", badmintonBurnRate);
        System.out.println();
        System.out.printf("You spent " + runningMins + " minutes running and burned %6.2f calories.", runningBurnRate);
        System.out.println();
        System.out.printf("You spent " + walkingMins + " minutes walking and burned %6.2f calories.", walkingBurnRate);
        System.out.println();
        System.out.printf("You spent " + liftingMins + " minutes lifting weights and burned %6.2f calories.", liftingBurnRate);
        System.out.println();
        
        //total time calculations
        int totalTime = badmintonMins + runningMins + walkingMins + liftingMins;
        int hours = totalTime / 60;
        int mins = totalTime % 60;
        //total calories calculations
        double totalCalsBurned = badmintonBurnRate + runningBurnRate + walkingBurnRate + liftingBurnRate;
        
        System.out.printf("You spent " + hours + " hours and " + mins + " minutes working out and burned %6.2f calories.", totalCalsBurned);
        
    }
}
