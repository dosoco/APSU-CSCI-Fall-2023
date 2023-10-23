
package csci1011.jdotylab4;

import java.util.Scanner;

/**
 * CSCI 1011
 * Lab 4
 * @author Jason Doty
 * This program informs users of a professors office hours availability
 */
public class JDotyLab4 {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the day of the week: ");
        String dayOfWeek = keyboard.next();

        System.out.println("Enter a time (XX:XXam/pm): ");
        String timeInput = keyboard.next();
        
        int length = timeInput.length();
        if (length < 7){
            System.out.println("Incorrect time format. (XX:XXam/pm)");
        }else{
        
        String hourStr = timeInput.substring(0, 2);
        String minStr = timeInput.substring(3, 5);
        String ampmStr = timeInput.substring(5, length);
        
        int hour = Integer.parseInt(hourStr);
        int min = Integer.parseInt(minStr);
  
        if((dayOfWeek.equalsIgnoreCase("Monday")
          || dayOfWeek.equalsIgnoreCase("Mon")) != true
          && (dayOfWeek.equalsIgnoreCase("Tuesday")
          || dayOfWeek.equalsIgnoreCase("Tue")) != true
          && (dayOfWeek.equalsIgnoreCase("Wednesday")
          || dayOfWeek.equalsIgnoreCase("Wed")) != true
          && (dayOfWeek.equalsIgnoreCase("Thursday")
          || dayOfWeek.equalsIgnoreCase("Thu")) != true
          && (dayOfWeek.equalsIgnoreCase("Friday")
          || dayOfWeek.equalsIgnoreCase("Fri")) != true
          && (dayOfWeek.equalsIgnoreCase("Saturday")
          || dayOfWeek.equalsIgnoreCase("Sat")) != true
          && (dayOfWeek.equalsIgnoreCase("Sunday")
          || dayOfWeek.equalsIgnoreCase("Sun")) != true)
          {
            System.out.println("Invalid Day");
            System.exit(0);
          }
            else
            if((hour <= 00 || hour > 12)
                || (min < 00 || min > 59) 
                || (length != 7))
            {
                System.out.println("Invalid Time");
                System.exit(0);    
            }
            else
            if((dayOfWeek.equalsIgnoreCase("Monday")
                || dayOfWeek.equalsIgnoreCase("Mon"))
                && (ampmStr.equalsIgnoreCase("pm"))
                && (hour >= 03 && hour <= 05))
            {
                System.out.println("Day of week: " + dayOfWeek);
                System.out.println("Available");
            }
            else
                if((dayOfWeek.equalsIgnoreCase("Thursday")
                || dayOfWeek.equalsIgnoreCase("Thu"))
                && (ampmStr.equalsIgnoreCase("pm"))
                && ((hour == 03 && min >= 30 || hour >=4 ) && hour <= 05))
                {
                System.out.println("Day of week: " + dayOfWeek);
                System.out.println("Available");
                }
            else
                if((dayOfWeek.equalsIgnoreCase("Friday")
                || dayOfWeek.equalsIgnoreCase("Fri"))
                && (ampmStr.equalsIgnoreCase("pm"))
                && ((hour >= 3) || (hour == 4 && min <= 30)))
                {
                System.out.println("Day of week: " + dayOfWeek);
                System.out.println("Available");
                }
            else
                {
                System.out.println("Day of week: " + dayOfWeek);
                System.out.println("Not Available");
                }

        }
    }
       
    }