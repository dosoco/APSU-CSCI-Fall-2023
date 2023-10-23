package csci1011.jdotylab5;

import java.util.Scanner;

/**
 * CSCI 1011 Lab 5
 * @author Jason Doty
 *  This program is a calculator application for users to use.
 */
public class JDotyLab5 {

    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            int selection;
            
        
            System.out.println("Choose one of the following options: ");
            System.out.println("1. Perform an arithmetic operation ");
            System.out.println("2. Apply a function ");
            System.out.println("3. Calculate a factorial ");
            System.out.println("4. Exit the program ");
            selection = keyboard.nextInt();
            do{
                
                switch(selection){
                    
                    case 1:
//                        while(selection == 1){   
                            System.out.println("Enter an expression of the form NUM OP NUM:");
                                
                                    int num1 = keyboard.nextInt();
                                    String charInput = keyboard.next();
                                    int num2 = keyboard.nextInt();
                                    char op = charInput.charAt(0);
                                    int output;
                                
                                
                                    switch(op){
                                        case '+':
                                            output = num1 + num2;
                                            System.out.println("Result: " + output);
                                            System.out.println("Perform another arithmetic operation?");
                                            System.out.println("(yes or no)");
                                            String answer = keyboard.next();
                                                if(answer.equalsIgnoreCase("yes")){
                                                    
                                                }else{
                                                System.out.println("Thank you for using Jason Doty's calculator!");
                                                System.exit(0);  
                                                }
                                        break;
                                        case '-':
                                            output = num1 - num2;
                                            System.out.println("Result: " + output);
                                            System.out.println("Perform another arithmetic operation?");
                                            System.out.println("(yes or no)");
                                            answer = keyboard.next();
                                                if(answer.equalsIgnoreCase("yes")){
                                                    
                                                }else{
                                                System.out.println("Thank you for using Jason Doty's calculator!");
                                                System.exit(0);   
                                                }
                                        break;
                                        case '*':
                                            output = num1 * num2;
                                            System.out.println("Result: " + output);
                                            System.out.println("Perform another arithmetic operation?");
                                            System.out.println("(yes or no)");
                                            answer = keyboard.next();
                                                if(answer.equalsIgnoreCase("yes")){
                                                    
                                                }else{
                                                System.out.println("Thank you for using Jason Doty's calculator!");
                                                System.exit(0);   
                                                }
                                        break;
                                        case '/':
                                            output = num1 / num2;
                                            System.out.println("Result: " + output);
                                            System.out.println("Perform another arithmetic operation?");
                                            System.out.println("(yes or no)");
                                            answer = keyboard.next();
                                                if(answer.equalsIgnoreCase("yes")){
                                                    
                                                }else{
                                                System.out.println("Thank you for using Jason Doty's calculator!");
                                                System.exit(0);   
                                                }
                                        break;
                                        case '%':
                                            output = num1 % num2;
                                            System.out.println("Result: " + output);
                                            System.out.println("Perform another arithmetic operation?");
                                            System.out.println("(yes or no)");
                                            answer = keyboard.next();
                                                if(answer.equalsIgnoreCase("yes")){
                                                    
                                                }else{
                                                System.out.println("Thank you for using Jason Doty's calculator!");
                                                System.exit(0);   
                                                }
                                        break;
                                        default:
                                            System.out.println("Unknown operator: " + op);
                                            System.out.println("Perform another arithmetic operation?");
                                            System.out.println("(yes or no)");
                                            answer = keyboard.next();
                                                if(answer.equalsIgnoreCase("yes")){
                                                    
                                                }else{
                                                System.out.println("Thank you for using Jason Doty's calculator!");
                                                System.exit(0);    
                                                }
                                        break;
                        
                                    }
//                                }
                                
                        break;
                    case 2:
//                        while(selection == 2){   
                            System.out.println("Enter an expression of the form FUNC ARG:");    
                                String func = keyboard.next();
                                double arg = keyboard.nextDouble();
                                double output2;
                                    switch(func){
                                        case "log":
                                            output2 = Math.log10(arg);
                                            System.out.println("Result: " + output2);
                                            System.out.println("Apply another function?");
                                            System.out.println("(yes or no)");
                                            String answer = keyboard.next();
                                                if(answer.equalsIgnoreCase("yes")){
                                                    
                                                }else{
                                                System.out.println("Thank you for using Jason Doty's calculator!");
                                                System.exit(0);   
                                                }
                                        break;
                                        case "ln":
                                            output2 = Math.log(arg);
                                            System.out.println("Result: " + output2);
                                            System.out.println("Apply another function?");
                                            System.out.println("(yes or no)");
                                            answer = keyboard.next();
                                                if(answer.equalsIgnoreCase("yes")){
                                                    
                                                }else{
                                                System.out.println("Thank you for using Jason Doty's calculator!");
                                                System.exit(0);   
                                                }
                                        break;
                                        case "sqrt":
                                            output2 = Math.sqrt(arg);
                                            System.out.println("Result: " + output2);
                                            System.out.println("Apply another function?");
                                            System.out.println("(yes or no)");
                                            answer = keyboard.next();
                                                if(answer.equalsIgnoreCase("yes")){
                                                    
                                                }else{
                                                System.out.println("Thank you for using Jason Doty's calculator!");
                                                System.exit(0);   
                                                }
                                        break;
                                        default:
                                            System.out.println("Unknown function: " + func);
                                            System.out.println("Apply another function?");
                                            System.out.println("(yes or no)");
                                            answer = keyboard.next();
                                                if(answer.equalsIgnoreCase("yes")){
                                                    
                                                }else{
                                                System.out.println("Thank you for using Jason Doty's calculator!");
                                                System.exit(0);   
                                                }
                                        break;
                        
                                    }
//                                }
                        break;
                    case 3:
                          
                            System.out.println("Enter a number:");    
                                int num = keyboard.nextInt();
                                int product_sum = 0;
                                int index = 1;
                                int product;
                                
                                while(index < num){
                                 product = index * num;
                                 index ++;
                                 product_sum += product;
                                }
                                System.out.println("Result: " + product_sum);
                                 System.out.println("Apply another function?");
                                 System.out.println("(yes or no)");
                                 String answer = keyboard.next();
                                    if(answer.equalsIgnoreCase("yes")){
                                                    
                                    }else{
                                    System.out.println("Thank you for using Jason Doty's calculator!");
                                    System.exit(0);   
                                    }
                                
                        break;
                    case 4:
                        System.out.println("Thank you for using Jason Doty's calculator!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
        }
        
        }while (selection != 4);
}
}
