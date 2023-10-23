
package csci1010.speciesequalsdemo;

import java.util.Scanner;

/**
 *
 * @author Jason Doty
 */
public class Species {
    private String name;
    private int population;
    private double growthRate;
    
    public void reaadInput(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the species name?");
        name = keyboard.nextLine();
        
        System.out.println("What is the population of the species?");
        population = keyboard.nextInt();
        
        System.out.println("Enter growth rate (% increase per year");
        growthRate = keyboard.nextDouble();
        
    }
    
    public void WriteOutput(){
        System.out.println("Name = " + this.name);
        System.out.println("Population = " + this.population);
        System.out.println("Growth rate = " + this.growthRate + "%");
    }
    
    public int predictPopulation(int years){
        int result = 0;
        double populationAmount = this.population;
        int count = years;
        
        while ((count > 0) && (populationAmount > 0)){
            populationAmount += (this.growthRate / 100) * populationAmount;
            count --;
        }
        if (populationAmount > 0)
            result = (int)populationAmount;
        
        return result;
    }
    
    //mutator method
    public void setSpecies(String newName, int newPopulation, double newGrowthRate){
        this.name = newName;
        if(newPopulation > 0)
            population = newPopulation;
        else
        {
            System.out.println("Error: usiong a negative population.");
            System.exit(0);
        }
        growthRate = newGrowthRate;
    }
    
    //accessor method
    public String getName(){
        return this.name;
    }
    public int getPopulation(){
        return population;
    }
    public double getGrowthRate(){
        return growthRate;
    }
    public boolean equals(Species otherObject){
        return (this.name.equalsIgnoreCase(otherObject.name) 
                && this.population == otherObject.population 
                && this.growthRate == otherObject.growthRate);
    }
}
