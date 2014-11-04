//////////////////////////////////////////////////
// Keri McGlothlin
// CSE 2
// HW8 java Program
// This program is to help with methods.

import java.util.Scanner;
public class BlockedAgain {
    public static void main(String[] s) {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }

    public static int getInt(){ //make sure the input is valid
        Scanner scan = new Scanner(System.in); //initilize scan
        System.out.print("Enter an in int between 1 and 9, inclusive: ");
        int x = checkInt(scan); //check if valid input
        int y = checkRange(x, scan); //check if valid input
        return y; //this will now be a valid input
    }
    
    public static int checkInt(Scanner scan){ //make sure the input is an int
        while (!scan.hasNextInt()){ //if it is not an int reprompt
            System.out.print("Enter an in int between 1 and 9, inclusive: ");
            scan.next();
            }
        int x = scan.nextInt(); //take the value that is now an int
        return x; //give it back
    }
    
    public static int checkRange(int y, Scanner scan){ //check if its acceptable
        while (y < 1 && y > 9){ //check if the int is within the range
            System.out.println("You did not enter an int in [1,9]; try again: ");
            while(!scan.hasNextInt()){ //if it is not the right input
                System.out.println("You did not enter an int in [1,9]; try again: ");
                scan.next(); //take the new input and try again
            }
        y = scan.nextInt(); //this is now a good input  
        }
    return y; // give the good number back
}

    public static int allBlocks(int a){ //acutally build the blocks
        int i = 1;
        while (i <= a) { //get the rows of different numbers
            int rows = i;
            int columns = 2 * i - 1;
            String chars = "";
            int j = 0;
            while (j < columns) { //get the number of numbers
                chars += i;
                j++;
            }
            int k = 0;
            while (k < rows) { //print the numbers
                System.out.println(chars);
                k++;
            }
            int h = 0;
            while (h < columns) { //get dashes
                System.out.print("-");
                h++;
            }
            System.out.println(""); //get the dashes on the line below numbers
            i++;
        }
        return a;
}
}
