//////////////////////////////////////////////////
// Keri McGlothlin
// CSE 2
// PokerOdds java Program
// This program will help with arrays.

import java.util.Random;
import java.util.Scanner;
public class PokerOdds {
    public static void main(String[] arg) {
        showHands();
        simulateOdds();
    }


    public static void showHands() {
        Scanner scan = new Scanner(System.in);
        String answer = "";

        int[] deck = new int[52]; //create deck array
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        int[] hand = new int[5]; //create hand array with -1s
        for (int i = 0; i < hand.length; i++) {
            hand[i] = -1;
        }
        while (true) {
            String cardClub = " ";
            String cardDiamond = " ";
            String cardHeart = " ";
            String cardSpade = " ";

            for (int i = 0; i < 5; i++) { //set hand number to face cards
                int rand = (int)(Math.random() * 51 - i);
                hand[i] = deck[rand];
                deck[51 - i] = -1;

                if ((hand[i] / 13) == 0) { //clubs
                    if ((hand[i] % 13) == 0) { //ace
                        cardClub += "A ";
                    }
                    if ((hand[i] % 13) == 1) { //king
                        cardClub += "K ";
                    }
                    if ((hand[i] % 13) == 2) { //queen
                        cardClub += "Q ";
                    }
                    if ((hand[i] % 13) == 3) { //jack
                        cardClub += "J ";
                    }
                    if ((hand[i] % 13) == 4) { //10
                        cardClub += "10 ";
                    }
                    if ((hand[i] % 13) == 5) { //9
                        cardClub += "9 ";
                    }
                    if ((hand[i] % 13) == 6) { //8
                        cardClub += "8 ";
                    }
                    if ((hand[i] % 13) == 7) { //7
                        cardClub += "7 ";
                    }
                    if ((hand[i] % 13) == 8) { //6
                        cardClub += "6 ";
                    }
                    if ((hand[i] % 13) == 9) { //5
                        cardClub += "5 ";
                    }
                    if ((hand[i] % 13) == 10) { //4
                        cardClub += "4 ";
                    }
                    if ((hand[i] % 13) == 11) { //3
                        cardClub += "3 ";
                    }
                    if ((hand[i] % 13) == 12) { //2
                        cardClub += "2 ";
                    }
                }

                if ((hand[i] / 13) == 1) { //diamonds
                    if ((hand[i] % 13) == 0) { //ace
                        cardDiamond += "A ";
                    }
                    if ((hand[i] % 13) == 1) { //king
                        cardDiamond += "K ";
                    }
                    if ((hand[i] % 13) == 2) { //queen
                        cardDiamond += "Q ";
                    }
                    if ((hand[i] % 13) == 3) { //jack
                        cardDiamond += "J ";
                    }
                    if ((hand[i] % 13) == 4) { //10
                        cardDiamond += "10 ";
                    }
                    if ((hand[i] % 13) == 5) { //9
                        cardDiamond += "9 ";
                    }
                    if ((hand[i] % 13) == 6) { //8
                        cardDiamond += "8 ";
                    }
                    if ((hand[i] % 13) == 7) { //7
                        cardDiamond += "7 ";
                    }
                    if ((hand[i] % 13) == 8) { //6
                        cardDiamond += "6 ";
                    }
                    if ((hand[i] % 13) == 9) { //5
                        cardDiamond += "5 ";
                    }
                    if ((hand[i] % 13) == 10) { //4
                        cardDiamond += "4 ";
                    }
                    if ((hand[i] % 13) == 11) { //3
                        cardDiamond += "3 ";
                    }
                    if ((hand[i] % 13) == 12) { //2
                        cardDiamond += "2 ";
                    }

                }
                if ((hand[i] / 13) == 2) { //hearts
                    if ((hand[i] % 13) == 0) { //ace
                        cardHeart += "A ";
                    }
                    if ((hand[i] % 13) == 1) { //king
                        cardHeart += "K ";
                    }
                    if ((hand[i] % 13) == 2) { //queen
                        cardHeart += "Q ";
                    }
                    if ((hand[i] % 13) == 3) { //jack
                        cardHeart += "J ";
                    }
                    if ((hand[i] % 13) == 4) { //10
                        cardHeart += "10 ";
                    }
                    if ((hand[i] % 13) == 5) { //9
                        cardHeart += "9 ";
                    }
                    if ((hand[i] % 13) == 6) { //8
                        cardHeart += "8 ";
                    }
                    if ((hand[i] % 13) == 7) { //7
                        cardHeart += "7 ";
                    }
                    if ((hand[i] % 13) == 8) { //6
                        cardHeart += "6 ";
                    }
                    if ((hand[i] % 13) == 9) { //5
                        cardHeart += "5 ";
                    }
                    if ((hand[i] % 13) == 10) { //4
                        cardHeart += "4 ";
                    }
                    if ((hand[i] % 13) == 11) { //3
                        cardHeart += "3 ";
                    }
                    if ((hand[i] % 13) == 12) { //2
                        cardHeart += "2 ";
                    }

                }
                if ((hand[i] / 13) == 3) { //spades
                    if ((hand[i] % 13) == 0) { //ace
                        cardSpade += "A ";
                    }
                    if ((hand[i] % 13) == 1) { //king
                        cardSpade += "K ";
                    }
                    if ((hand[i] % 13) == 2) { //queen
                        cardSpade += "Q ";
                    }
                    if ((hand[i] % 13) == 3) { //jack
                        cardSpade += "J ";
                    }
                    if ((hand[i] % 13) == 4) { //10
                        cardSpade += "10 ";
                    }
                    if ((hand[i] % 13) == 5) { //9
                        cardSpade += "9 ";
                    }
                    if ((hand[i] % 13) == 6) { //8
                        cardSpade += "8 ";
                    }
                    if ((hand[i] % 13) == 7) { //7
                        cardSpade += "7 ";
                    }
                    if ((hand[i] % 13) == 8) { //6
                        cardSpade += "6 ";
                    }
                    if ((hand[i] % 13) == 9) { //5
                        cardSpade += "5 ";
                    }
                    if ((hand[i] % 13) == 10) { //4
                        cardSpade += "4 ";
                    }
                    if ((hand[i] % 13) == 11) { //3
                        cardSpade += "3 ";
                    }
                    if ((hand[i] % 13) == 12) { //2
                        cardSpade += "2 ";
                    }
                }
            }
            System.out.println("Spades :" + cardSpade);
            System.out.println("Hearts :" + cardHeart);
            System.out.println("Diamonds :" + cardDiamond);
            System.out.println("Clubs :" + cardClub);

            for (int i = 0; i < hand.length; i++) { 
            hand[i] = -1;
            }
            
            System.out.print("Enter y or Y to go again: "); //go again
            answer = scan.next(); //take answer
            if ((!(answer.equals("y"))) && (!(answer.equals("Y")))) {
                break;
            }
        }
    }

    public static void simulateOdds(){
        
        int[] deck = new int[52]; //set deck
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        int[] hand = new int[5]; //set hand
        for (int i = 0; i < hand.length; i++) {
            hand[i] = -1;
        }
        
        int cardA = 0; //set counters for the doubles of each type
        int cardK = 0;
        int cardQ = 0;
        int cardJ = 0;
        int card10 = 0;
        int card9 = 0;
        int card8 = 0;
        int card7 = 0;
        int card6 = 0;
        int card5 = 0;
        int card4 = 0;
        int card3 = 0;
        int card2 = 0;
        int dubTotal = 0;

        for(int j=0; j<=10000; j++){ //run through 10000 hands
        for (int i = 0; i < 5; i++) { //create the hand to cards in a deck
                int rand = (int)(Math.random() * 51 - i);
                
                hand[i] = deck[Math.abs(rand)]; //no negatives
                deck[51 - i] = -1;

                if ((hand[i] % 13) == 0) { //ace
                    cardA++;
                }
                if ((hand[i] % 13) == 1) { //king
                    cardK++;
                }
                if ((hand[i] % 13) == 2) { //queen
                    cardQ++;
                }
                if ((hand[i] % 13) == 3) { //jack
                    cardJ++;
                }
                if ((hand[i] % 13) == 4) { //10
                    card10++;
                }
                if ((hand[i] % 13) == 5) { //9
                    card9++;
                }
                if ((hand[i] % 13) == 6) { //8
                    card8++;
                }
                if ((hand[i] % 13) == 7) { //7
                    card7++;
                }
                if ((hand[i] % 13) == 8) { //6
                    card6++;
                }
                if ((hand[i] % 13) == 9) { //5
                    card5++;
                }
                if ((hand[i] % 13) == 10) { //4
                    card4++;
                }
                if ((hand[i] % 13) == 11) { //3
                    card3++;
                }
                if ((hand[i] % 13) == 12) { //2
                    card2++;
                }
        }
        int dubs =0; //for couting the total number of doubles
        for(int i=0; i<5; i++){
            for(int k=i+1; k<4; k++){
                if(hand[i] == hand[k]){
                    dubs++;
                }
            }
        }
        
        if(dubs==1){ //set the number of pairs
        dubTotal+=dubs;
        }
        }
        
        System.out.println("A :" + cardA); //print the pairs of each type
        System.out.println("K :" + cardK);
        System.out.println("Q :" + cardQ);
        System.out.println("J :" + cardJ);
        System.out.println("10 :" + card10);
        System.out.println("9 :" + card9);
        System.out.println("8 :" + card8);
        System.out.println("7 :" + card7);
        System.out.println("6 :" + card6);
        System.out.println("5 :" + card5);
        System.out.println("4 :" + card4);
        System.out.println("3 :" + card3);
        System.out.println("2 :" + card2);
        
        int notDouble = 10000 - dubTotal; //print the total number not paired
        System.out.println("total not exactly one pair: " + notDouble);
    }
}
