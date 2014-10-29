//////////////////////////////////////////////////
// Keri McGlothlin
// CSE 2
// HW8 java Program
// This program is to help with methods.

import java.util.Scanner;
public class HW8{
    
      public static void main(String []arg){
        char input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        input = getInput(scan, "Cc");
        System.out.println("You entered '" + input + "'");
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
        input = getInput(scan, "yYnN", 5); //give up after 5 attempts
        if (input != ' ') {
            System.out.println("You entered '" + input + "'");
        }
        input = getInput(scan, "Choose a digit.", "0123456789 ");
        System.out.println("You entered '" + input + "'");
    }
    
    public static char getInput(Scanner user, String letter) {
        String charac = user.next();
        int length = charac.length();
        while (length > 1) {
            System.out.println("You should enter exactly one character");
            charac = user.next();
            length = charac.length();
        }
        char num = charac.charAt(0);
        while (num != ('c') && num != ('C')) {
            System.out.println("You did not enter a character from the list 'Cc'; try again");
            charac = user.next();
            length = charac.length();
            num = charac.charAt(0);
        }
        return num;
    }

    public static char getInput(Scanner user, String words, int x) {
        x = 0;
        String charac = user.next();
        int length = charac.length();
        while (length > 1) {
            x++;
            if (x > (x-1)) {
                System.out.println("You failed after "+x+ " tries");
                char y = ' ';
                return y;
            }
            System.out.println("Enter exactly one character");
            charac = user.next();
            length = charac.length();
        }

        char num = charac.charAt(0);
        x = 0;
        while (num != ('y') && num != ('Y') && num != ('n') && num != ('N')) {
            x++;
            if (x > (x-1)) {
                System.out.println("you failed after "+x+" tries");
                char y = ' ';
                return y;
            }
            System.out.println("You did not enter a character from the list 'Cc'; try again-");
            charac = user.next();
            length = charac.length();
            num = charac.charAt(0);
        }
        return num;
    }
    
    public static char getInput(Scanner user, String letter, String number) {
        System.out.println(letter);
        System.out.print("Enter one of - "+number);
        String charac = user.next();
        int length = charac.length();
        while (length > 1) {
            System.out.println("You should enter exactly one character");
            System.out.println(letter);
            System.out.print("Enter one of - "+number);
            charac = user.next();
            length = charac.length();
        }
        char num = charac.charAt(0);
        
        while (num != ('0') && num != ('1') && num != ('2') && num != ('3') && 
        num != ('4') && num != ('5') && num != ('6') && num != ('7') && num != ('8') && num != ('9')) {
            System.out.println("You did not enter an acceptable character");
            System.out.println(letter);
            System.out.print("Enter one of - "+number);
            charac = user.next();
            num = charac.charAt(0);
        }
        return num;
    }
}