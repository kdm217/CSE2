//////////////////////////////////////////////////
// Keri McGlothlin
// CSE 2
// NumberStack java Program
// This program is to help with methods.

import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	
	System.out.println("a ="+a);
 	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
 	System.out.println("The larger of "+a+", "+b+", and "+c+
                  	" is "+larger(a,larger(b,c)));
    System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                  	", and "+c+" are in ascending order");
}

    public static int getInt(Scanner userInput) {
        Scanner scan=new Scanner(System.in);
            System.out.print("Enter an int between 1 and 9: ");
                while (!scan.hasNextInt()) {
                    scan.next(); //get rid of the junk entered by user
                    System.out.print("You did not enter an int; try again- ");
                } //while
                
                int number = scan.nextInt();
                
                while (number > 9 || number < 1) {
                    System.out.print("You did not enter an int; try again- ");
                    number = scan.nextInt();
                } //while

                return number;
    }//getInt method
    
    public static int larger(int input1, int input2){
        int largerInput;
        if (input1 > input2){
            largerInput = input1;
        }
        else if (input1 < input2){
            largerInput = input2;
        }
        else{
            largerInput = input1;
        }
        return largerInput;
    } // larger method
    
   public static boolean ascending(int in1, int in2, int in3){
       boolean ascend;
       if (in1 < in2 && in2 < in3){
           ascend = true;
       }
       else{
           ascend = false;
       }
       return ascend;
   }
      
  }
