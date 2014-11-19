//////////////////////////////////////////////////
// Keri McGlothlin
// CSE 2
// Arrays java Program
// This program will help with arrays.

import java.util.Scanner;

public class Arrays{ //create class

    public static void main(String[] args){ //create main method
    
        Scanner myScanner; //create instance
        myScanner = new Scanner(System.in); //create instance of variable
        
        final int number = 10;
        int[] numArray;
        numArray = new int[number];
        
        int min = numArray[0];
        int max = numArray[0];
        int minNum = min;
        int maxNum = max;
        int sumNum = 0;
        
        System.out.print("Enter 10 ints: ");
        for(int i=0; i<number; i++){
            numArray[i] = myScanner.nextInt();
            minNum = min;
            maxNum = max;
            if (numArray[i]<min){
            min = numArray[i];
            }
            if (numArray[i]>max){
            max = numArray[i];
            sumNum+=numArray[i];
            }
        }
        System.out.println("The lowest entry is - " + min);
        System.out.println("The highest entry is - " + max);
        System.out.println("The sum is - " + sumNum);
        for(int i=0; i<number; i++){
            System.out.print(numArray[i]);
            System.out.print(" ");
            System.out.print(numArray[9-i]);
            System.out.println();
        }
        
    }
}