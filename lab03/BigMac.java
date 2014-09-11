//////////////////////////////////////////////
//Keri McGlothlin
//CSE 002-110 
//September 10th 2014
//Big Mac Java Program
//Computes the cost of buying Big Macs using a Scanner class to ask the user
//how many Big Macs, the tax percentage, and cost per Big Mac

import java.util.Scanner;

    public class BigMac {
    	// main method required for every Java program
   	    public static void main(String[] args) {
   	         Scanner myScanner; //declare instance of Scanner object
   	         myScanner = new Scanner( System.in ); //making an instance of scanner
   	         System.out.print(
   	             "Enter the number of Big Macs(an integer > 0): ");//prompt user
   	        int nBigMacs = myScanner.nextInt(); //accept user input
   	        //The next print statement will prompt user for cost of BigMac
   	        System.out.print("Enter the cost per Big Mac as”+“ a double (in the form xx.xx)");
            double bigMac$ = myScanner.nextDouble(); // assign this variable to bigMac$
            //The next print statement will prompt user for percent tax
        	System.out.print(
        	    "Enter the percent tax as a whole number (xx): ");
        	double taxRate = myScanner.nextDouble(); //assign this variable to taxRate
            taxRate/=100; //user enters percent, but I want proportion
            //The next segment will print out the input from the user nicely
            double cost$; //change cost$ to a double
            int dollars,   //whole dollar amount of cost 
            dimes, pennies; //for storing digits
            //to the right of the decimal point 
            //for the cost$ 
            cost$ = nBigMacs*bigMac$*(1+taxRate);
            //get the whole amount, dropping decimal fraction
            dollars=(int)cost$;
            //get dimes amount, e.g., 
            // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
            //  where the % (mod) operator returns the remainder
            //  after the division:   583%100 -> 83, 27%5 -> 2 
            dimes=(int)(cost$*10)%10; //force dimes to be an int now
            pennies=(int)(cost$*100)%10; //force pennies to nwo be an int
            System.out.println("The total cost of " +nBigMacs
             +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +  
             " sales tax of "+ (int)(taxRate*100) + "%, is $"
             +dollars+'.'+dimes+pennies); //prints out the answer nicely
         		  }  //end of main method   
  } //end of class
