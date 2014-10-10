////////////////////////////////////
//Keri McGlothlin
//CSE 002-110
//September 24th
//Enigma1
//This program will be debugged

/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a proportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+x+"%  ");
   //print out the proportion remaining for select percentages
   double y = (1.001 - x/100.0); //convert to the proportion remaining here
   y=(int)(y*100)/100.0; //make sure in two digit decimal
   if(y==0.93){  //when the user enters 7
      System.out.printf("The proportion remaining is "+0.93+"\n");
   }
    else if(y==0.59){//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    }
    else if(y==0.86){//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    }
    else if(y==0.67){//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    }
    else if(y==0.4){//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
    }
   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * There was an issue of the numbers that had more than the exact two decimals
 * in the remainder to not go through their if statements, so I made the numbers
 * into their proportion form before the ifs and converted them to be exactly
 * only two decimals so that this issue does not arise.
 */

