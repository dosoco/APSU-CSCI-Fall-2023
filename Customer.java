
package csci1011.jdotylab8;

/**
 *CSCI 1011 Lab 8
 * @author Jason Doty
 * This program evaluates the equality of customer information input by user
 */

import java.util.Scanner;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the customer first name:");
        firstName = keyboard.nextLine();
        System.out.println("Enter the customer last name:");
        lastName = keyboard.nextLine();
        System.out.println("Enter the customer email address:");
        email = keyboard.nextLine();
    }

    public void writeOutput() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
    }

    private boolean hasSameNameAs(Customer otherCustomer) {
        return firstName.equals(otherCustomer.getFirstName()) && lastName.equals(otherCustomer.getLastName());
    }

    private boolean hasSameEmailAs(Customer otherCustomer) {
        return email.equalsIgnoreCase(otherCustomer.getEmail());
    }

    public boolean equals(Customer otherCustomer) {
        return hasSameNameAs(otherCustomer) && hasSameEmailAs(otherCustomer);
    }
}

