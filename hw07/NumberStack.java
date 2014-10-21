//////////////////////////////////////////////////
// Keri McGlothlin
// CSE 2
// NumberStack java Program
// This program will print the amount you desire in incrementing lines

import java.util.Scanner;

public class NumberStack { //create class

    public static void main(String[] args) { //create main method

            Scanner myScanner; //create instance
            myScanner = new Scanner(System.in); //create instance of variable

            System.out.print("Enter an int between 1 and 9: ");

            if (myScanner.hasNextInt()) { //if int
                int userInput = myScanner.nextInt(); //set user input to nStars
                if (userInput >= 1 && userInput <= 9) {

                    System.out.println("Using for Loops:");
                    for (int i = 1; i <= userInput; i++) { //get the rows of different numbers
                        int rows = i;
                        int columns = 2 * i - 1;
                        String chars = "";
                        for (int j = 0; j < columns; j++) { //get the number of numbers
                            chars += i;
                        }
                        for (int k = 0; k < rows; k++) { //print the numbers
                            System.out.println(chars);
                        }
                        for (int h = 0; h < columns; h++) { //get dashes
                            System.out.print("-");
                        }
                        System.out.println(""); //get the dashes on the line below numbers
                    }

                    System.out.println("Using while Loops:");
                    int i = 1;
                    while (i <= userInput) { //get the rows of different numbers
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

                    System.out.println("Using do-while Loops:");
                    //while (i <= userInput) {
                    i = 1;
                    String chars = "";
                    int j = 0;
                    int columns = 2 * i - 1;
                    int rows = i;
                    do { //get the rows of different numbers
                        rows = i;
                        columns = 2 * i - 1;
                        chars = "";
                        j = 0;
                        do { //get the number of numbers
                            chars += i;
                            j++;
                        }
                        while (j < columns);
                        int k = 0;
                        do { //print the numbers
                            System.out.println(chars);
                            k++;
                        }
                        while (k < rows);
                        int h = 0;
                        do { //get dashes
                            System.out.print("-");
                            h++;
                        }
                        while (h < columns);
                        System.out.println(""); //get the dashes on the line below numbers
                        i++;
                    }
                    while (i <= userInput);

                } //inner if
                else {
                    System.out.println("Your int was not in the range [1.9]");
                }

            } //outer if

            else { //anything not 1-9 user inputted
                System.out.println("Your int was not in the range [1.9]");
            } //else

        } // main method

} //class