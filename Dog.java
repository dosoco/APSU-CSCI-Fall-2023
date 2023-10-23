package csci1010.dogdemo;

/**
 *
 * @author Jason Doty
 */

/*
Class name: Dog

Attributes:
Name
Breed
Age

Methods:
writeOutput(): Print to screen name, breed, age in calendar and human years
getAgeInHumanYears(): Returns dog age i human years according to formula
*/
public class Dog {
    
    //attributes
    public String name;
    public String breed;
    public int age;
    
    //methods
    public void writeOutput(){
        System.out.println("name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age in calendar years: " + age);
        System.out.println("Age in human years: " + getAgeInHumanYears());
        System.out.println();
    }
    
    public int getAgeInHumanYears(){
        int humanAge = 0; //local variable
        if(age <= 2){
            humanAge = age * 11;
            //return age*11
        }else{
            humanAge = 22 + ((age - 2) * 5);
            //returns 22 + ((age-2) *5)
        }
    return humanAge;
    }
}
