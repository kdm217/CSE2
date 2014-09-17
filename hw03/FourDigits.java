//////////////////////////////////////////////
//Keri McGlothlin
//CSE 002-110 
//September 10th 2014
//Four Digit Java Program
//This program takes a double from the user and prints out the first 4 decimals

import java.util.Scanner;

public class FourDigits{

    //add main method
    public static void main(String[] args) {
        Scanner myScanner; //declare instance of Scanner object
        myScanner = new Scanner( System.in ); //making an instance of scanner
            //prompt the user for the double
   	        System.out.print("Enter a double, I will print the first 4 decimals: ");
   	        double number = myScanner.nextDouble(); //accept user input
   	        number = number*10000;
   	        int newNumber = (int) number; //convert double to int
   	        int digits = newNumber % 10000; //take the remainer of the number/10000
   	        System.out.println("The four digits are:  "+digits);
  
    }//end of main method
    
}//end of class
        