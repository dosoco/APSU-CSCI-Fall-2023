
package csci1010.speciesequalsdemo;

/**
 *
 * @author Jason Doty
 */
public class SpeciesEqualsDemo {

    public static void main(String[] args) {
        
        Species s1 = new Species(), s2 = new Species();
        s1.setSpecies("Klingon Ox", 10, 15);
        s2.setSpecies("Klingon Ox", 10, 15);
        
        if (s1 == s2)
            System.out.println("match with ==");
        else
            System.out.println("Do not match with ==");
        if (s1.equals(s2))
            System.out.println("Match with the method equals()");
        else
            System.out.println("Do not match with the methos equals()");
        System.out.println("Now change lingon Ox to lowercase");
        s2.setSpecies("klingon ox", 10, 15);
        if(s1.equals(s2))
            System.out.println("match with the method equals()");
        else System.out.println("Do not match with the method equals()");
    }
}
