
package csci1011.jdotylab8;


/**
 *CSCI 1011 Lab 8
 * @author Jason Doty
 * This program evaluates the equality of customer information input by user
 */


public class JDotyLab8 {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.readInput();
        customer1.writeOutput();

        Customer customer2 = new Customer();
        customer2.readInput();
        customer2.writeOutput();

        System.out.println("Using == operator:");
        if (customer1 == customer2) {
            System.out.println("Customer1 is equal to customer2 using the == operator");
        } else {
            System.out.println("Customer1 is not equal to customer2 using the == operator");
        }

        System.out.println("Using equals method:");
        if (customer1.equals(customer2)) {
            System.out.println("Customer1 is equal to customer2 using the equals method");
        } else {
            System.out.println("Customer1 is not equal to customer2 using the equals method");
        }

        customer1 = customer2; // Assign customer2 to customer1

        System.out.println("Using == operator after assignment:");
        if (customer1 == customer2) {
            System.out.println("Customer1 is equal to customer2 using the == operator");
        } else {
            System.out.println("Customer1 is not equal to customer2 using the == operator");
        }

        customer2.setEmail("nobody@nowhere.com");
        customer1.writeOutput();
    }
}
   
