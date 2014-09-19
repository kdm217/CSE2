//////////////////////////////////////////////
//Keri McGlothlin
//CSE 002-110 
//September 10th 2014
//Four Digit Java Program
//This program takes the user input of how many big macs they want and whether
// or not they want fries. It should report a statement to reenter if entered incorrectly.

import java.util.Scanner; //import scanner

public class BigMacAgain{ //main method

   	public static void main(String[] args) {
   	    
   	    Scanner myScanner; //declare instance of Scanner object
   	    myScanner = new Scanner( System.in ); //create instance of scanner
   	    
       	    //prompt the user for amounnt of BigMacs
       	    System.out.print("Enter the number of Big Macs: "); //prompt user
       	    
       	    if(myScanner.hasNextInt()){ //if the answer is an int
       	        int nBigMacs = myScanner.nextInt(); //set nBigMacs to the int
       	        double BigMacs$ = (int) (((2.22*nBigMacs)*100)/100.0); //create the total cost
       	        
       	        if (nBigMacs > 0){ //if the number is greater than 0
       	        
                System.out.println("You ordered "+nBigMacs+" Big Macs for a cost of $"
                +nBigMacs+"x2.22 = $"+ BigMacs$); //print the cost of Big Macs
                    
       	            }else{ //the number is not greater than 0
                    System.out.println("You did not enter a number greater than 0");
                    return;    //leaves the program
                    }
           	        
           	        System.out.print("Do you want an order of fries (Y/y/N/n)? ");
                    String answer = myScanner.next(); //take the letter answer 
                    
                    if (answer.equals("Y")){ //if the user inputted Y
                        //print out the cost of fries
                        System.out.println("You ordered fries at a cost of $2.15");
                        System.out.println("The total cost of the meal is $"+(2.15
                        + BigMacs$)); //print the total cost of the meal
                        
                        }else if (answer.equals("y")){ //if the user inputted y
                            //print out the cost of fries
                            System.out.println("You ordered fries at a cost of $2.15");
                            System.out.println("The total cost of the meal is $"+(2.15
                            + BigMacs$)); //print the total cost of the meal
                            
                        }else if (answer.equals("N")) { //if the user inputted N
                            System.out.println("The total cost of the meal is $"+
                            BigMacs$); //print the total cost of the meal
                            
                        }else if (answer.equals("n")){ //if the user inputted n
                            System.out.println("The total cost of the meal is $"+
                            BigMacs$); //print the total cost of the meal
                    
                        }else{ //the user put in something not a Y,y,N,or n
                            System.out.println("You did not enter a y,Y,n,or N");
                            return;    //leaves the program
                        }
            
       	    
       	        }else{ //the nBigMac was not an int
                    System.out.println("You did not enter an int"); //tell user why
                    return;    //leaves the program
                    }
            
            
    }  //end of main method
    
} //end of class