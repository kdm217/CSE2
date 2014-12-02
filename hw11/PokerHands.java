////////////////////////////////////
//Keri McGlothlin
//CSE 002-110
//September 24th
//Poker Hands program.
//This program helps with arrays.

import java.util.Scanner;//import scanner

public class PokerHands{ //main method

    public static void main(String[] args) {
        Scanner scan; //declare instance of scanner object
        scan = new Scanner(System.in); //create instance of scanner 
            
            int[] hand = new int[5]; //create hand array
            for (int i = 0; i < hand.length; i++) {
                hand[i] = -1;
            }
            String answer = "y"; //initialize variables
            char suit = 'a';
            String number = "0";
            
            while(true){ //keep going until 5 cards correctly drawn
            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- "); //prompt user
            answer = scan.next(); //take answer
            if ((!(answer.equals("y"))) && (!(answer.equals("Y")))) { //start from top if not y
                break;
            }
            for(int i=0; i<5; i++){ //ask for the suit
            System.out.print("Enter the suit: 'c', 'd', 'h', or 's'-");
            suit = scan.next().charAt(0);
            if (suit == 'c'){ //convert to a number for easier understanding
                suit = 1;
            } 
            else if (suit == 'd'){
                suit = 2;
            }
            else if (suit == 'h'){
                suit = 3;
            }
            else if (suit == 's'){
                suit = 4;
            }
            else{
                suit = 0;
            }
            if (suit == 0) { //if not a valid input for a suit repompt
                System.out.println("You did not enter a valid response");
                System.out.print("Enter the suit: 'c', 'd', 'h', or 's'-");
                suit = scan.next().charAt(0);
            }
            System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'-");
            number = scan.next(); //take the card number
            
            if(suit == 1){ //store the card as a number from 0-51
                if(number.equals("a")){
                    hand[i] = 0;
                }
                else if(number.equals("k")){
                    hand[i] = 1;
                }
                else if(number.equals("q")){
                    hand[i] = 2;
                }
                else if(number.equals("j")){
                    hand[i] = 3;
                }
                else if(number.equals("10")){
                    hand[i] = 4;
                }
                else if(number.equals("9")){
                    hand[i] = 5;
                }
                else if(number.equals("8")){
                    hand[i] = 6;
                }
                else if(number.equals("7")){
                    hand[i] = 7;
                }
                else if(number.equals("6")){
                    hand[i] = 8;
                }
                else if(number.equals("5")){
                    hand[i] = 9;
                }
                else if(number.equals("4")){
                    hand[i] = 10;
                }
                else if(number.equals("3")){
                    hand[i] = 11;
                }
                else if(number.equals("2")){
                    hand[i] = 12;
                }
                else{ //if the card is not an acceptable input try again
                    break;
                }
            }
            if(suit == 2){
                if(number.equals("a")){
                    hand[i] = 13;
                }
                else if(number.equals("k")){
                    hand[i] = 14;
                }
                else if(number.equals("q")){
                    hand[i] = 15;
                }
                else if(number.equals("j")){
                    hand[i] = 16;
                }
                else if(number.equals("10")){
                    hand[i] = 17;
                }
                else if(number.equals("9")){
                    hand[i] = 18;
                }
                else if(number.equals("8")){
                    hand[i] = 19;
                }
                else if(number.equals("7")){
                    hand[i] = 20;
                }
                else if(number.equals("6")){
                    hand[i] = 21;
                }
                else if(number.equals("5")){
                    hand[i] = 22;
                }
                else if(number.equals("4")){
                    hand[i] = 23;
                }
                else if(number.equals("3")){
                    hand[i] = 24;
                }
                else if(number.equals("2")){
                    hand[i] = 25;
                }
                else{ //if the card is not an acceptable input try again
                    break;
                }
            }
            if(suit == 3){
                if(number.equals("a")){
                    hand[i] = 26;
                }
                else if(number.equals("k")){
                    hand[i] = 27;
                }
                else if(number.equals("q")){
                    hand[i] = 28;
                }
                else if(number.equals("j")){
                    hand[i] = 29;
                }
                else if(number.equals("10")){
                    hand[i] = 30;
                }
                else if(number.equals("9")){
                    hand[i] = 31;
                }
                else if(number.equals("8")){
                    hand[i] = 32;
                }
                else if(number.equals("7")){
                    hand[i] = 33;
                }
                else if(number.equals("6")){
                    hand[i] = 34;
                }
                else if(number.equals("5")){
                    hand[i] = 35;
                }
                else if(number.equals("4")){
                    hand[i] = 36;
                }
                else if(number.equals("3")){
                    hand[i] = 37;
                }
                else if(number.equals("2")){
                    hand[i] = 38;
                }
                else{ //if the card is not an acceptable input try again
                    break;
                }
            }
            if(suit == 4){
                if(number.equals("a")){
                    hand[i] = 39;
                }
                else if(number.equals("k")){
                    hand[i] = 40;
                }
                else if(number.equals("q")){
                    hand[i] = 41;
                }
                else if(number.equals("j")){
                    hand[i] = 42;
                }
                else if(number.equals("10")){
                    hand[i] = 43;
                }
                else if(number.equals("9")){
                    hand[i] = 44;
                }
                else if(number.equals("8")){
                    hand[i] = 45;
                }
                else if(number.equals("7")){
                    hand[i] = 46;
                }
                else if(number.equals("6")){
                    hand[i] = 47;
                }
                else if(number.equals("5")){
                    hand[i] = 48;
                }
                else if(number.equals("4")){
                    hand[i] = 49;
                }
                else if(number.equals("3")){
                    hand[i] = 50;
                }
                else if(number.equals("2")){
                    hand[i] = 51;
                }
                else{ //if the card is not an acceptable input try again
                    break;
                }
                
            } //outer if

            if(hand[4] != -1){ //once the hand is full exit the loop
                break;
            }
            } //for
            showOneHand(hand); //print out the pretty format of the cards
            
            //Straight
            int[] freq = new int[13];
            for(int j=0; j<hand.length; j++){
                for(int i=0; i<freq.length; i++){
                    if (hand[j]%13 == i){
                        freq[i] += 1; //put in a 1 if the card matches the spot
                    }
                }
            }
            int count = 0;
            for (int i=0; i<freq.length; i++){
                if((freq[i] == 1) || (freq[i+1] == 1)){
                    count++; //if there is a 1 next to another 1 add 1 to count
                }
            }
            if (count == 4){ // if there are 5 1s in a row it is a straight
                System.out.println("This is a Straight");
            }
            
            int index = 0; //create the array for counting pairs
            int[] five = new int[5];
            for(int i=0; i<five.length; i++){
                for(int j=0; j<freq.length; j++){
                    if(freq[j] == 0){
                        index++;
                    }
                }
                five[i] = index;
            }
            //print out the pairs
            if(five[1] == 1 || five[2] == 1){
                System.out.print("This is a Full House");
            }
            else if (five[1] == 1){
                System.out.println("This is a pair");
            }
            else if (five[2] == 1){
                System.out.println("This is a three of kind");
            }
            else if (five[3] == 1){
                System.out.println("This is a four of kind");
            }

            }//while end
            
            
    }
    
    public static void showOneHand(int hand[]){ //display which rank are in which suit
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "}; //declare array
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "}; //declare array
	String out="";
	for(int s=0;s<4;s++){ //add the amount of suits to the suit column
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank]; //add the cards to the output
  	out+='\n';
	}
	System.out.println(out);
  }
} 
