//////////////////////////////////////////////
// Keri McGlothlin
// CSE 2
// Burger King Program
// This program will prompt the user for their Burger King order and print it out

import java.util.Scanner; //import scanner

public class BurgerKing{ //create main method

    public static void main(String[] args) {
        
        Scanner myScanner;// create instance
        myScanner = new Scanner(System.in); //create instance of variable
        
            System.out.print("Enter a letter to indicate a choice of \n"+
            "Burger (B or b) \n"+
            "Soda (S or s) \n"+
            "Fries (F or f)): \n"); //promt user for order
            
            String order = myScanner.next(); //assign user input to order
            int orderNum = order.length(); //number of letters in user input order
            
            switch(order) {
                case "b":
                case "B": //burgers
                    System.out.print("Enter A or a for 'all the fixins' \n"+
                    "C or c for cheese \n"+
                    "N or n for none of the above: "); //prompt user
                    String fixIn = myScanner.next(); //assign fixIn to the user input
                    switch(fixIn) {
                    case "A": 
                    case "a": //if a or A entered print...
                            System.out.print("You ordered a burger with all the fixins \n");
                            return;
                    case "C":
                    case "c": //if a c or C entered
                        System.out.print("You ordered a burger with cheese \n"); //print
                        return;
                    case "N":
                    case "n": //if a N or n
                        System.out.print("You ordered a plain burger \n"); //print
                        return;
                    default: //did not enter the right input
                        System.out.print("You did not enter any of A, a, C, C, N, n \n");
                        return; //leave program
                    } //end of fixin switch
                
                case "S":
                case "s": //soda
                System.out.print("Do you want Pepsi (p or P), \n"+
                "Coke (c or C), Sprite (s or S) or Mountain Dew (M or m): \n");
                String soda = myScanner.next(); //assign user input to soda
                switch (soda) {
                    case "P":
                    case "p": //if P or p entered print...
                        System.out.print("You ordered a Pepsi \n");
                        return;
                    case "c":
                    case "C": //if a c or C entered
                        System.out.print("You ordered a coke \n"); //print
                        return;
                    case "S":
                    case "s":  //if a S or s
                        System.out.print("You ordered a Sprite \n"); //print
                        return;
                    case "M":
                    case "m": //if a M or m
                        System.out.print("You ordered a Mountain Dew \n"); //print
                        return;
                    default: //did not enter the right input
                        System.out.print("You did not enter any of P, p,C, c, S, s, M, m \n");
                        return; //leave program
                } //end of soda switch
         
            case "F":
            case "f": //fries if
                System.out.print("Do you want a large or small order of fries (l,L,s, or S): \n");
                String fries = myScanner.next(); //assign user input to fries
                switch(fries) {
                    case "L":
                    case "l": //if L or l entered print...
                        System.out.print("You ordered a large fry \n"); //print
                        return;
                    case "s":
                    case "S": //if S or s entered print...
                        System.out.print("You ordered a small fry \n"); //print
                        return;
                    default: //user did not enter the right input
                        System.out.print("You did not enter any of S, s, L, l \n"); //print
                        return; //leave program
                } //end of fries switch
            
            default: //did not enter the right input
                if (orderNum > 1){
                    System.out.print("a single character expected \n"); //print
                }
                else {
                    System.out.print("You did not enter any of B, b, S, s, F, or f \n");
                    return;//leave program
                }
           
            } //end of order switch
            
                    
    } //end of class
    
} // end main method