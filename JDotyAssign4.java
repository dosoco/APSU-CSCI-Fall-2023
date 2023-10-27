package csci1010.jdotyassign4;

import java.util.Scanner;

/**
 * CSCI 1010 Assignment 4
 * @author Jason Doty
 * This program simulates what happens when a ball is thrown at a particular angle and initial velocity
 */
public class JDotyAssign4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Jason Doty's ball simulator!");

        System.out.print("Please enter the angle in degrees: ");
        double angle = keyboard.nextDouble();

        System.out.print("Please enter the initial velocity: ");
        double velocity = keyboard.nextDouble();

        System.out.print("Please enter the initial height: ");
        double height = keyboard.nextDouble();

        System.out.print("Please enter the time interval: ");
        double timeInterval = keyboard.nextDouble();

        Ball ball = new Ball();
        ball.initialize(angle, velocity, height);

        while (ball.getVDist() > 0) {
            ball.update(timeInterval);
        }

        System.out.println("\nDistance traveled: " + ball.getHDist() + " meters.");
    }
}
