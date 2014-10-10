////////////////////////////////////
//Keri McGlothlin
//CSE 002-110
//September 24th
//Enigma2
//This program will be debugged

import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * There was a java.lang.ArithmeticException by zero error on line 16 where
 * one can see 40 was divided by 0 which you cannot do in Arithmetic.
 * To fix this I took out the /0 and left it as just 40.
 * I am not sure what the expected output is so this is what I think it should
 * be running as.
 */
