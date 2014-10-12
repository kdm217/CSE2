//////////////////////////////////////////////////
// Keri McGlothlin
// CSE 2
// Root java Program
// This program will print the square root out using a while loop

import java.util.Scanner;

public class Root{ //create class

    public static void main(String[] args){ //create main method
    
        Scanner myScanner; //create instance
        myScanner = new Scanner(System.in); //create instance of variable
        
        System.out.print("Enter a number you would like to find the square root of: ");
        if (myScanner.hasNextInt()){ //if int
            double number = myScanner.nextDouble();
            if (number <= 0){
                System.out.println("You did not enter an int");
                return;
            }
            double low = 0; //initialize low
            double high = number + 1; //initialize high
            double difference = (high-low);
            double middle = (high + low)/2; //initialize middle
            
            while (difference >= .0000001){
                if ((middle*middle)>number){
                    high = middle;
                }
                else if ((middle*middle)<number){
                    low = middle;
                }
                middle = (high + low)/2;
                difference = (high-low);
            } //while
            
            System.out.println("The square root is: " + middle);
        }//if
        
        
        else{ //anything not an int
            System.out.println("You did not enter an int");
        } //else
        
        
        
    } // end of main method
} //end of class
        