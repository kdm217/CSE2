//////////////////////////////////////////////
//Keri McGlothlin
//CSE 002-110 
//September 10th 2014
//Income Tax Java Program
// This program prompts the user for 6 digits and returns whether it is valid

import java.util.Scanner; //import scanner

public class CourseNumber{ //main method

   	public static void main(String[] args) {
   	    
   	    Scanner myScanner; //declare instance of Scanner object
   	    myScanner = new Scanner( System.in ); //create instance of scanner
   	    
       	    //prompt the user for 6 digit number
       	    System.out.print("Enter a six digit number giving the course semester: ");
       	    
       	    if(myScanner.hasNextInt()){ //if the answer is an int
       	        int input = myScanner.nextInt(); //set input to the int
       	        int year = input/100; //get the first 4 digits
       	        
       	        if ((year > 1864) && (year < 2015)){ //if the number is b/w 1865-2014
       	            int nSemester = input%100; //get the last 2 digits
       	            
       	            if (nSemester == 10){
       	                String semester = "Spring"; //the semester is spring
       	                System.out.println("The course was offered in the "+
       	                semester+" semester of " + year); //print the whole statement
       	            }
       	                
       	            else if (nSemester == 20){
       	                String semester = "Summer 1"; //the semester is spring
       	                System.out.println("The course was offered in the "+
       	                semester+" semester of " + year); //print the whole statement
       	            }
       	                
       	            else if (nSemester == 30){
       	                String semester = "Summer 2"; //the semester is spring
       	                System.out.println("The course was offered in the "+
       	                semester+" semester of " + year); //print the whole statement
       	            }
       	                
       	            else if (nSemester == 40){
       	                String semester = "Fall"; //the semester is spring
       	                System.out.println("The course was offered in the "+
       	                semester+" semester of " + year); //print the whole statement
       	            }
       	            
       	            else{
       	                //print that the input is incorrect
       	                System.out.println(nSemester +" is not a legitimate semester");
       	            }

       	        }else if ((year >2014) || (year < 1865)){ // if invalid year
       	        //}else{
       	         System.out.println("The number was outside the range [186510,201440]");
       	         }
       	         
       	    }else { //the thousand was not an int
                    System.out.println("You did not enter an int"); //tell user why
                    return;    //leaves the program
                    }
                    
       	    } //end of main method
            
            
    }  //end of class
