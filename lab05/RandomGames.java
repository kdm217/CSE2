////////////////////////////////////
//Keri McGlothlin
//CSE 002-110
//September 24th
//Random Games
//This program takes user inputs and runs a game with switch statements.

import java.util.Scanner;//import scanner

public class RandomGames{ //main method

    public static void main(String[] args) {
        
        Scanner myScanner; //declare instance of scanner object
        myScanner = new Scanner(System.in); //create instance of scanner 
        
            //prompt user for input
            System.out.print("Enter R or r for Roulette, C or c for craps,"+
            " P or p for pick a card: ");
            
            String game = myScanner.next(); //assign game to user input
            
            switch (game) {
                case "R": //user inputs R
                case "r": //user inputs r
                    int number = (int)(Math.random()*38); //get a random number
                    
                    switch(number){ //switch statement
                        case 37: //00 case
                            System.out.println("Roulette: 00"); //print what you got
                            break;
                        default: //all numbers from 0-36
                            System.out.println("Roulette: "+number); //print the number
                            break;
                    }//end switch with number
                    
                    break;
                
                case "C": //user inputs C
                case "c": //user inputs c
                    int number1 = (int)((Math.random()*6)+1); //get a random number
                    int number2 = (int)((Math.random()*6)+1); //get a random number
                    
                    System.out.println("Craps: "+number1+" + "+number2+" = "+
                    (number1+number2)); //print the craps game
                    
                    break;
                
                case "P": //user inputs P
                case "p": //user inputs p
                    int suit = (int)((Math.random()*4)+1); //get a random number
                    int cardNumber = (int)((Math.random()*13)+1); //get a random number
                    
                    switch(cardNumber){
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                             switch(suit){
                                case 1: //hearts
                                    System.out.println(cardNumber+" of Hearts"); //print
                                    break;
                                case 2: //diamonds
                                    System.out.println(cardNumber+" of Diamonds"); //print
                                    break;
                                case 3: //clubs
                                    System.out.println(cardNumber+" of Clubs"); //print
                                    break;
                                case 4: //spades
                                    System.out.println(cardNumber+" of Spades"); //print
                                    break;
                            } //end of hearts
                            break;
                            
                        case 1: //Ace
                            switch(suit){
                                case 1: //hearts
                                    System.out.println("Ace of Hearts"); //print
                                    break;
                                case 2: //diamonds
                                    System.out.println("Ace of Diamonds"); //print
                                    break;
                                case 3: //clubs
                                    System.out.println("Ace of Clubs"); //print
                                    break;
                                case 4: //spades
                                    System.out.println("Ace of Spades"); //print
                                    break;
                            } //end of aces
                            break;
                            
                        case 11: //jack
                            switch(suit){
                                case 1: //hearts
                                    System.out.println("Jack of Hearts"); //print
                                    break;
                                case 2: //diamonds
                                    System.out.println("Jack of Diamonds"); //print
                                    break;
                                case 3: //clubs
                                    System.out.println("Jack of Clubs"); //print
                                    break;
                                case 4: //spades
                                    System.out.println("Jack of Spades"); //print
                                    break;
                            } //end of jacks
                            break;
                            
                        case 12: //queen
                            switch(suit){
                                case 1: //hearts
                                    System.out.println("Queen of Hearts"); //print
                                    break;
                                case 2: //diamonds
                                    System.out.println("Queen of Diamonds"); //print
                                    break;
                                case 3: //clubs
                                    System.out.println("Queen of Clubs"); //print
                                    break;
                                case 4: //spades
                                    System.out.println("Queen of Spades"); //print
                                    break;
                            }//end of queens
                            break;
                            
                        case 13: //king
                            switch(suit){
                                case 1: //hearts
                                    System.out.println("King of Hearts"); //print
                                    break;
                                case 2: //diamonds
                                    System.out.println("King of Diamonds"); //print
                                    break;
                                case 3: //clubs
                                    System.out.println("King of Clubs"); //print
                                    break;
                                case 4: //spades
                                    System.out.println("King of Spades"); //print
                                    break;
                            } //end of kings
                            break;
                    } //end of switch card number
                    
                    break;
                
                
                default: //user inputs anything that is not valid
                    System.out.println("This is not one of 'R', 'r', 'C', 'c',"+
                    "'P', or 'p'"); //print
                    break;
                
            }//end of switch game
            
            
    } //end of class
}// end of main methof