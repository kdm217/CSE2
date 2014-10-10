////////////////////////////////////
//Keri McGlothlin
//CSE 002-110
//September 24th
//Enigma0
//This program will be debugged

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
    
    public static void main(String[] args){
        
        Scanner scan=new Scanner(System.in);
        
            System.out.print("Enter an int- ");
            
            int n;
            
            if (scan.hasNextInt()){
                n=scan.nextInt();
                System.out.println("You entered "+n);
            }
            else{
                n=4;
                System.out.println("You entered "+n);
            }
            
            int k=4,p=6,q=7,r=8;
            
            switch(k+p+q+r){
                case 25: 
                    System.out.println("sum is 25");
                    System.out.println("Again, you entered "+ n);
                    break;
                default:
                    System.out.println("To repeat, you entered "+ n);
                    break;
            }
      }
    }

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 -fix the problem with n being defined within the if statement to bring it out of
 the if and then change the else to redefine n and not have the int in front, also
 right before the switch statement don't redefine n.
 -no need for case 24, the case will always be 25.
 -need to break the end of the default to finish the program and the case 25,
 also add the 'Again' statement as stated in the original output.
 
 */