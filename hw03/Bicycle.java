//////////////////////////////////////////////
//Keri McGlothlin
//CSE 002-110 
//September 10th 2014
//Bicycle Java Program
//This program takes counts and seconds to return the distance traveled in miles,
// the time it took in minutes and the average mph

import java.util.Scanner;

public class Bicycle{

    //add main method
    public static void main(String[] args) {
        Scanner myScanner; //declare instance of Scanner object
        myScanner = new Scanner( System.in ); //making an instance of scanner
   	        System.out.print("Enter the number of seconds: "); //prompt user secs
   	        int nSeconds = myScanner.nextInt(); //accept user input
   	        System.out.print("Enter the number of counts: "); //prompt user counts
   	        int nCounts = myScanner.nextInt(); // assign this variable to nCounts
   	        double diameter = 27, //known diameter is 27 inches
   	            PI=3.14159, //the numberical value of pi
                feetPerMile=5280, //how many feet are in a mile
                inchesPerFoot=12, //how many inches are in one foot
                secondsPerMinute=60, //how many seconds are in a minute
                minutesPerHour=60; //how many minutes are in an hour
            double nMinutes = (nSeconds/secondsPerMinute); //convert sec to min
            double nMiles = nCounts*diameter*PI/inchesPerFoot/feetPerMile; //miles
            double mph = nMiles/(nMinutes/minutesPerHour); //calculates mph
           
            //convert mph double into an double with 2 decimal places
            double nMph=(int)(mph*100)/100.0;
            
            //convert miles double into an double with 2 decimal places
            double nDist = (int) (nMiles*100)/100.0;
            
            //Print out the output data.
            System.out.println("The distance was "+nDist+" miles and took "+nMinutes+
            " minutes.");
            System.out.println("The average mph was "+nMph);
            
    }//end of main method
    
}//end of class
        
        