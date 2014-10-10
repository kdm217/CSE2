//////////////////////////////////////////////////
// Keri McGlothlin
// CSE 2
// LoopTheLoop java Program
// This program will print the amount of stars you desire in incrementing lines

import java.util.Scanner;

public class LoopTheLoop{ //create class

    public static void main(String[] args){ //create main method
    
        Scanner myScanner; //create instance
        myScanner = new Scanner(System.in); //create instance of variable
        
        while(true){
        System.out.print("Enter an int between 1 and 15: ");
        
        if (myScanner.hasNextInt()){ //if int
            int nStars = myScanner.nextInt(); //set user input to nStars
            if (nStars >= 1 && nStars <= 15){
                int start = 1;
                int x = 1;
                String chars = "";
                
                while (start <= nStars){
                    chars = "";
                    x = 1;
                while (x <= start){
                    chars = chars + "*";
                    x++;
                    }//inner while
                    System.out.println(chars);
                    start++;
                }//outer while
            }//inner if
            else{
                System.out.println("Your int was not in the range [1.15]");
            }
            
        }//outer if
        
        else{ //anything not 1-15 user inputted
            System.out.println("Your int was not in the range [1.15]");
        } //else

        System.out.print("Enter y or Y to go again: ");
        String answer = myScanner.next();
        if ((!(answer.equals("y"))) && (!(answer.equals("Y")))){
            break;
        }
        }//big while
    }// main method
    
} //class