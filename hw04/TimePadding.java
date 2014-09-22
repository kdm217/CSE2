//////////////////////////////////////////////
//Keri McGlothlin
//CSE 002-110 
//September 10th 2014
//Time Padding Java Program
// This program prompts the user for seconds in a day and returns it padded

import java.util.Scanner; //import scanner

public class TimePadding{ //main method

   	public static void main(String[] args) {
   	    
   	    Scanner myScanner; //declare instance of Scanner object
   	    myScanner = new Scanner( System.in ); //create instance of scanner
   	    
       	    //prompt the user for the number
       	    System.out.print("Enter the time in seconds: ");
       	    
       	    if(myScanner.hasNextInt()){ //if the answer is an int
       	        int nSeconds = myScanner.nextInt(); //set input to the int
       	        
       	        int hours = (nSeconds/3600); //get the hours from seconds
       	        int minutes = (nSeconds/60) - (hours*60); //get the minutes from seconds
       	        int seconds = nSeconds - (minutes*60 + hours*3600); //remaining secs
       	        
       	        if ((nSeconds < 86400) && (nSeconds >= 0)){
       	        
       	        if ((hours <=9 ) && (minutes <=9 ) && (seconds <=9)){
       	            System.out.println("The time is 0"+ hours+":0"+minutes+":0"+seconds);
       	        }
       	        
       	        else if ((hours >9 ) && (minutes >9 ) && (seconds <=9)){
       	            System.out.println("The time is "+ hours+":"+minutes+":0"+seconds);
       	        }
       	        
       	        else if ((hours >9 ) && (minutes <=9 ) && (seconds <=9)){
       	            System.out.println("The time is "+ hours+":0"+minutes+":0"+seconds);
       	        }
       	        
       	        else if ((hours <=9 ) && (minutes >9 ) && (seconds >9)){
       	            System.out.println("The time is 0"+ hours+":"+minutes+":"+seconds);
       	        }
       	        
       	        else if ((hours <=9 ) && (minutes <=9 ) && (seconds >9)){
       	            System.out.println("The time is 0"+ hours+":0"+minutes+":"+seconds);
       	        }
       	        
       	        else{
       	        //print the final time
       	        System.out.println("The time is "+ hours+":"+minutes+":"+seconds);
       	        }
       	        
       	        }else{ //if the time is more than one day
       	            System.out.println("This is not one day");
       	            return; //leaves the program
       	        }
       	            
       	    }else { //the thousand was not an int
                System.out.println("You did not enter an int"); //tell user why
                return;    //leaves the program
                }
                    
       	    } //end of main method
            
            
    }  //end of class
