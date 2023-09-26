package csci1010.bmi;

import java.util.Scanner;

/**
 *
 * @author Jason Doty
 */
public class BMI {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

          //declare variables
          int pounds, feet, inches;
          double heightMeters, mass, BMI;
          
          
          //asetup and read input
          Scanner keyboard = new Scanner(System.in);
          System.out.println("Enter your weight in pounds. ");
          pounds = keyboard.nextInt();
          System.out.println("Enter height in feet " + 
                  "followed by a space" + 
                  "then additional inches. ");
            feet = keyboard.nextInt();
            inches = keyboard.nextInt();
            
          //convert mass & height
          heightMeters = (feet * 12 + inches) * 0.0254;
          mass = pounds / 2.2;

          //compute BMI
          BMI = mass / (heightMeters * heightMeters);
          System.out.println("Your BMI is: " + BMI);
          
          //decision structure to print risk category
          System.out.print("Your risk category is: ");
          if (BMI < 18.5)
              System.out.println("Underweight");
          else if (BMI < 25)
              System.out.println("This is normal weight");
          else if (BMI < 30)
              System.out.println("Overweight");
          else
              System.out.println("Obese");
    }
}
