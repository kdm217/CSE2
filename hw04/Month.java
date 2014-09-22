//////////////////////////////////////////////
//Keri McGlothlin
//CSE 002-110 
//September 10th 2014
//Month Java Program
// This program prompts the user for tthe month and tells the number of days

import java.util.Scanner; //import scanner

public class Month{ //main method

   	public static void main(String[] args) {
   	    
   	    Scanner myScanner; //declare instance of Scanner object
   	    myScanner = new Scanner( System.in ); //create instance of scanner
   	    
       	    //prompt the user for the month
       	    System.out.print("Enter an int giving the number of the month (1-12) : ");
       	    
       	    if(myScanner.hasNextInt()){ //if the answer is an int
       	        int month = myScanner.nextInt(); //set month to the int
       	        if ((month <=12) && (month >=1)){
       	        
       	        if (month == 1){ //if the month is january
       	            System.out.println("The month has 31 days"); //print the days
       	        }
       	            
       	        else if (month == 2){ //if the month is january
       	            System.out.print("Enter an int giving the year: ");
       	            if(myScanner.hasNextInt()){ //if the answer is an int
       	                int year = myScanner.nextInt(); //set year to the int
       	                
       	                if ((year % 4 == 0) && year % 100 != 0){ //is a leap year
                            System.out.println("The month has 29 days"); //print the days
       	                }
       	                //is a leap year
       	                else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)){
       	                    System.out.println("The month has 29 days"); //print the days
       	                }
                        else{ // not a leap yeaer                       
                            System.out.println("The month has 28 days"); //print the days
                        }
                        
       	            
       	            }else{ //the thousand was not an int
                    System.out.println("You did not enter an int"); //tell user why
                    return;    //leaves the program
       	            }
                        }
       	        
       	        else if (month == 3){ //if the month is january
       	            System.out.println("The month has 31 days"); //print the days
       	        }
       	            
       	        else if(month == 4){ //if the month is january
       	            System.out.println("The month has 30 days"); //print the days
       	        }
       	        
       	        else if(month == 5){ //if the month is january
       	            System.out.println("The month has 31 days"); //print the days
       	        }    
       	        
       	        else if(month == 6){ //if the month is january
       	            System.out.println("The month has 30 days"); //print the days
       	        }
       	        
       	        else if(month == 7){ //if the month is january
       	            System.out.println("The month has 31 days"); //print the days
       	        }
       	        
       	        else if(month == 8){ //if the month is january
       	            System.out.println("The month has 31 days"); //print the days
       	        }
       	        
       	        else if(month == 9){ //if the month is january
       	            System.out.println("The month has 30 days"); //print the days
       	        }
       	        
       	        else if(month == 10){ //if the month is january
       	            System.out.println("The month has 31 days"); //print the days
       	        }
       	        
       	        else if(month == 11){ //if the month is january
       	            System.out.println("The month has 30 days"); //print the days
       	        }
       	        
       	        else if(month == 12){ //if the month is january
       	            System.out.println("The month has 31 days"); //print the days
       	        }
       	        
       	    }else if ((month >12) || (month <1)){ //the thousand was not an int
                    System.out.println("You did not enter an int between 1-12"); //tell user why
                    return;    //leaves the program
                    }
            
            }else { //the thousand was not an int
                    System.out.println("You did not enter an int"); //tell user why
                    return;    //leaves the program
                    }
                    
       	    } //end of main method
            
            
    }  //end of class