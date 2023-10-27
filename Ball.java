package csci1010.jdotyassign4;

/**
 * CSCI 1010 Assignment 4
 * @author Jason Doty
 * This program simulates what happens when a ball is thrown at a particular angle and initial velocity
 */


public class Ball {
    private double hDist;
    private double vDist;
    private double hSpeed;
    private double vSpeed;

    public void initialize(double angle, double velocity, double height) {
        hDist = 0;
        vDist = height;
        hSpeed = velocity * Math.cos(Math.toRadians(angle));
        vSpeed = velocity * Math.sin(Math.toRadians(angle));
    }

    public void update(double time) {
        hDist += hSpeed * time;
        vDist += vSpeed * time - 0.5 * 9.8 * time * time;
        vSpeed -= 9.8 * time;
    }

    public double getHDist() {
        return hDist;
    }

    public double getVDist() {
        return vDist;
    }
}

