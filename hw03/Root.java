//////////////////////////////////////////////
//Keri McGlothlin
//CSE 002-110 
//September 10th 2014
//Root Java Program
//This program takes a double from the user and guesses at the cube root

import java.util.Scanner;

public class Root{

    //add main method
    public static void main(String[] args) {
        Scanner myScanner; //declare instance of Scanner object
        myScanner = new Scanner( System.in ); //making an instance of scanner
            //prompt the user for the double to be cube rooted
   	        System.out.print("Enter a double, I will print the cube root: ");
   	        double nEntered = myScanner.nextDouble(); //accept user input
   	        double myGuess = nEntered/3; //guess at a crude cube root
   	        //make the guess more accurate
   	        myGuess = (myGuess*myGuess*myGuess+nEntered)/(3*myGuess*myGuess);
   	        myGuess = (2*myGuess*myGuess*myGuess+nEntered)/(3*myGuess*myGuess);
   	        myGuess = (2*myGuess*myGuess*myGuess+nEntered)/(3*myGuess*myGuess);
   	        myGuess = (2*myGuess*myGuess*myGuess+nEntered)/(3*myGuess*myGuess);
   	        myGuess = (2*myGuess*myGuess*myGuess+nEntered)/(3*myGuess*myGuess);
   	        
   	        System.out.println("The cube root is "+myGuess+": \n"+myGuess+"*"
   	        +myGuess+"*"+myGuess+"= \n"+(myGuess*myGuess*myGuess));
            
    }//end of main method
    
}//end of class