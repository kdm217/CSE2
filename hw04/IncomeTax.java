//////////////////////////////////////////////
//Keri McGlothlin
//CSE 002-110 
//September 10th 2014
//Income Tax Java Program
// This program prompts the user for their income and responds with their tax

import java.util.Scanner; //import scanner

public class IncomeTax{ //main method

   	public static void main(String[] args) {
   	    
   	    Scanner myScanner; //declare instance of Scanner object
   	    myScanner = new Scanner( System.in ); //create instance of scanner
   	    
       	    //prompt the user for amount of money they make
       	    System.out.print("Enter an int giving the number of thousands: "); //prompt user
       	    
       	    if(myScanner.hasNextInt()){ //if the answer is an int
       	        int thousands = myScanner.nextInt(); //set thousands to the int
       	        
       	        if ((thousands < 20) && (thousands >= 0 )){ //if the number is less than 20
       	            int taxRate = 5; //tax rate for 20 thousand
       	            thousands = (thousands*1000); //convert the number to thousands
       	            double taxAmount =  ((taxRate/100.0) * thousands); //the amount due
       	            double taxAmount$=(int)(taxAmount*100)/100.0;
       	            System.out.println("The tax rate on $"+thousands+" is "+taxRate+
       	            "%, and the tax is $"+taxAmount$); //print the final amount
       	        }
       	            
       	        else if ((thousands >= 20) && (thousands < 40)) {
       	            int taxRate = 7; //tax rate for 20-40 thousand
       	            thousands = (thousands*1000); //convert the number to thousands
       	            double taxAmount =  ((taxRate/100.0) * thousands); //the amount due
       	            double taxAmount$=(int)(taxAmount*100)/100.0;
       	            System.out.println("The tax rate on $"+thousands+" is "+taxRate+
       	            "%, and the tax is $"+taxAmount$); //print the final amount
       	        }
       	        
       	        else if ((thousands >= 40) && (thousands < 78)) {
       	            int taxRate = 12; //tax rate for 40-78 thousand
       	            thousands = (thousands*1000); //convert the number to thousands
       	            double taxAmount =  ((taxRate/100.0) * thousands); //the amount due
       	            double taxAmount$=(int)(taxAmount*100)/100.0;
       	            System.out.println("The tax rate on $"+thousands+" is "+taxRate+
       	            "%, and the tax is $"+taxAmount$); //print the final amount
       	        }
       	        else if (thousands >= 78) {
       	            int taxRate = 14; //tax rate for 78 thousand
       	            thousands = (thousands*1000); //convert the number to thousands
       	            double taxAmount =  ((taxRate/100.0) * thousands); //the amount due
       	            double taxAmount$=(int)(taxAmount*100)/100.0;
       	            System.out.println("The tax rate on $"+thousands+" is "+taxRate+
       	            "%, and the tax is $"+taxAmount$); //print the final amount
       	        }
       	        
       	    }else{ //the thousand was not an int
                    System.out.println("You did not enter an int"); //tell user why
                    return;    //leaves the program
                    }
            
            
    }  //end of main method
    
} //end of class
       	            