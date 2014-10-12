////////////////////////////////////
//Keri McGlothlin
//CSE 002-110
//September 24th
//Random Games
//This program will play roulette 1000 times betting on one number

public class Roulette{ //class

    public static void main(String[] args) { //main method
    
        int thousand = 0; //initilize running the program a thousand times
        int hundred = 0; //initilize the hundred while
        int wonOneGame = 0; //how many overall games won
        int loseEverything = 0; //times you didnt win at least once
        int profit = 0; //if profit is earned in one game
        int wonNoGames = 0;
        
        while (thousand <= 1000){
            int bettingOn = (int)(Math.random()*38); //number bet on
            hundred = 0; //initilize the hundred while
            wonNoGames = 0; //has to go back to zero each 100
        
            while (hundred <= 100){
                int gameChosen = (int)(Math.random()*38); //number game produces  
                
                if (gameChosen == bettingOn){
                    wonOneGame++; //add one for every one game won
                    wonNoGames++; //track games one per only each 100
                }//if same number end
                if (hundred == 100){
                    if (wonNoGames == 0){ //never won a single game
                    loseEverything++; //times you didnt win a single roll
                    } //if wonOneGame
                } //else if hundred
                if (wonNoGames == 3){
                    profit++; //a profit was earned in one game
                } //else if wonOneGame = 3
                
                hundred++; //add to the counter
            } //end of 100 while
            
            thousand++; //add to the counter
        } //end of 1000 while
        
        System.out.println("The number of times you did not win anything is: "+
        loseEverything);
        
        int winnings = wonOneGame*36; //amount of money won
        System.out.println("The amount of total money won is: $" + winnings);
        
        System.out.println("The times you walked away with a profit was: " + profit);
        
            
    } // main method
}//class