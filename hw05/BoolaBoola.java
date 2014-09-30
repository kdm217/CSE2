//////////////////////////////////////////////////
// Keri McGlothlin
// CSE 2
// BoolaBoola java Program
// This program will randomly generate a combination of trues and falses and && 
// and || then promt the user to see if they know what it will return with

import java.util.Scanner;

public class BoolaBoola{ //create class

    public static void main(String[] args){ //create main method
    
        Scanner myScanner; //create instance
        myScanner = new Scanner(System.in); //create instance of variable
        
            int first = (int)((Math.random()*2)+1); //get random number
            int second = (int)((Math.random()*2)+1); //get random number
            int third = (int)((Math.random()*2)+1); //get random number
            int fourth = (int)((Math.random()*2)+1); //get random number
            int fifth = (int)((Math.random()*2)+1); //get random number
            
            String firstSpot = "0";
            String secondSpot = "0";
            String thirdSpot = "0";
            String fourthSpot = "0";
            String fifthSpot = "0";
            
            //create random instances of trues falses and &&s and ||s
            switch(first){
                case 1: //true
                    firstSpot = "true";
                    break;
                case 2: //false
                    firstSpot = "false";
                    break;
            }// end of trueFalse switch
            switch(second){
                case 1: //true
                    secondSpot = "&&";
                    break;
                case 2: //false
                    secondSpot = "||";
                    break;
            }// end of trueFalse switch
            switch(third){
                case 1: //true
                    thirdSpot = "true";
                    break;
                case 2: //false
                    thirdSpot = "false";
                    break;
            }// end of trueFalse switch
            switch(fourth){
                case 1: //true
                    fourthSpot = "&&";
                    break;
                case 2: //false
                    fourthSpot = "||";
                    break;
            }// end of trueFalse switch
            switch(fifth){
                case 1: //true
                    fifthSpot = "true";
                    break;
                case 2: //false
                    fifthSpot = "false";
                    break;
            }// end of trueFalse switch
            
            System.out.print("Does "+firstSpot+" "+secondSpot+" "+thirdSpot+" "+
            fourthSpot+" "+fifthSpot+" have the value true(t/T) or false(f/F)? ");
            
            String firstAnswer = "0"; //initialize firstAnswer
            String guess = myScanner.next(); //take user input
            
            String realGuess = "0"; //initialize
            
            switch (guess){ //convert user input to correct format
                case "f":
                case "F":
                    realGuess = "false";
                    break;
                case "t":
                case "T":
                    realGuess = "true";
                    break;
            }
            
            if (fourthSpot == "&&"){ //&& precedance
                if ((thirdSpot == "false") || (fifthSpot == "false")){
                    firstAnswer = "false";
                }
                else if ((thirdSpot == "true") && (fifthSpot == "true")){
                    firstAnswer = "true";
                }
                if (secondSpot.equals("&&")){
                    if ((firstSpot == "false") || (firstAnswer == "false")){
                        String secondAnswer = "false";
                        if (realGuess == secondAnswer){
                            System.out.println("Correct"); //user's correct
                        }
                        else{
                            System.out.println("Wrong; try again"); //user's wrong
                        }
                    }
                    else if ((firstSpot == "true") && (firstAnswer == "true")){
                        String secondAnswer = "true";
                        if (realGuess == secondAnswer){
                            System.out.println("Correct"); //user's correct
                        }
                        else{
                            System.out.println("Wrong; try again"); //user's wrong
                        }
                    }
                }//second spot if &&
                
                else if (secondSpot == "||"){
                    if ((firstSpot == "true") || (firstAnswer == "true")){
                        String secondAnswer = "true";
                        if (realGuess == secondAnswer){
                            System.out.println("Correct"); //user's correct
                        }
                        else{
                            System.out.println("Wrong; try again"); //user's wrong
                        }
                    }
                    else if ((firstSpot == "false") && (thirdSpot == "false")){
                        String secondAnswer = "false";
                        if (realGuess == secondAnswer){
                            System.out.println("Correct"); //user's correct
                            return;
                        }
                        else{
                            System.out.println("Wrong; try again"); //user's wrong
                            return;
                        }
                    }
                }//second spot if ||
            }//fourth spot if &&
            
            else if (fourthSpot == "||"){
                if (secondSpot.equals("&&")){
                    if ((firstSpot == "false") || (thirdSpot == "false")){
                        firstAnswer = "false";
                        //System.out.println("firstAnswer = " +firstAnswer);
                    }
                    else if ((firstSpot == "true") && (thirdSpot == "true")){
                        firstAnswer = "true";
                        //System.out.println("firstAnswer = " +firstAnswer);
                    }
                }//second spot if &&
                
                else if (secondSpot == "||"){
                    if ((firstSpot == "true") || (thirdSpot == "true")){
                        firstAnswer = "true";
                        //System.out.println("firstAnswer = " +firstAnswer);
                    }
                    else if ((firstSpot == "false") && (thirdSpot == "false")){
                        firstAnswer = "false";
                        //System.out.println("firstAnswer = " +firstAnswer);
                    }
                }//second spot if ||
                
                if ((firstAnswer == "true") || (fifthSpot == "true")){
                    String secondAnswer = "true";
                    if (realGuess == secondAnswer){
                        System.out.println("Correct"); //user's correct
                    }
                    else{
                        System.out.println("Wrong; try again"); //user's correct
                    }
                }
                else if ((firstAnswer == "false") && (fifthSpot == "false")){
                    String secondAnswer = "false";
                    if (realGuess == secondAnswer){
                        System.out.println("Correct"); //user's correct
                    }
                    else{
                        System.out.println("Wrong; try again"); //user's wrong
                    }
                }
            }
    } //end of main method
} //end of class