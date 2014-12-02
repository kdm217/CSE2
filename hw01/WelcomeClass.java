//////////////////////////////////////////////
//Keri McGlothlin
//Welcome Class Java Program
import java.util.Scanner;
//define a class
public class WelcomeClass{
    
    //add main method
    // public static void main(String[] args) {
        
    //     //print this statement
    //     System.out.println("  -----------");
    //     System.out.println("  | WELCOME |");
    //     System.out.println("  -----------");
    //     System.out.println("  ^  ^  ^  ^  ^  ^");
    //     System.out.println(" / \\/ \\/ \\/ \\/ \\/ \\");
    //     System.out.println("|-K--D--M--2--1--7-|");
    //     System.out.println(" \\ /\\ /\\ /\\ /\\ /\\ /");
    //     System.out.println("  v  v  v  v  v  v");
    //     System.out.println("My name is Keri McGlothlin and I am a ballet dancer and will be helping choreograph the musical this year.");

    
   // public static void main( String[] args ){ 
        // for(int z=2; z<6.; z++){
        //     for(int x=1; x<=z; x++){
        //         for(int y =1; y<= x; y++){
        //             System.out.print("b");
        //             }
        //         System.out.println("");
        //         }
        // }
        // }
    

// int num = 1;
// for (int z = 1; z < 5; z++) {
//     for (int y = 1; y <= z; y++) {
//         for (int x = 1; x <= y; x++) {
//             System.out.print(num);
//         }
//         System.out.println("");
//     }
//     num = num*2;
// }

// int num = 8;
// int end = 5;
// for(int z= 1; z < 5; z++){
//     for (int y = end; y >= 1; y--) {
//         for (int x = y; x >= 1; x--) {
//             System.out.print(num);
//         }
//         System.out.println("");
//     }
//     end = end -1;
// num= num/2;

// }

// for(int b=4; b>=1; b--){
//     for(int a = b; a>= 1; a--){
//         System.out.print("t");
//     }
//     System.out.println("");
// }

// for(int c=1; c<5; c++){
// for(int b=1; b<=c; b++){
//     for(int a=1; a<=b; a++){
//         System.out.print("t");
//     }
//     System.out.println();
// }
// }
//public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     System.out.print("Please enter a number from 1 to 7, 0 to quit: ");
//     int day =0;
//     if (scan.hasNextInt()) {
//         day = scan.nextInt();
//     }
//     while (true) {
//         String week = convertToDay(day);
//         System.out.println("The day you entered is: " + week);

//         if (!(week.equals("Not a day"))) {
//             System.out.print("Please enter a number from 1 to 7, 0 to quit: ");
//             day=scan.nextInt();    
//             }
//         else{
//             break;
//         }
//         }
//     }


//     public static String convertToDay(int x) {
//         String y = "Not a day";
//         if (x == 1) {
//             return "Monday";
//         }
//         else if (x == 2) {
//             return "Tuesday";
//         }
//         else if (x == 3) {
//             return "Wenesday";
//         }
//         else if (x == 4) {
//             return "Thursday";
//         }
//         else if (x == 5) {
//             return "Friday";
//         }
//         else if (x == 6) {
//             return "Saturday";
//         }
//         else if (x == 7) {
//             return "Sunday";
//         }
//         else if (x == 0) {
//             return y;
//         }
//     return y;
//     }
// }

// int num=1;
// for(int a=1; a<5; a++){
//     for(int b=1; b<=a; b++){
//         for(int c=1; c<=b; c++){
//             System.out.print(num);
//         }
//     System.out.println();    
//     }
//     num=num*2;
// }
//public static void main( String args[] ){
// 	int i = 0;
// String word = "A";
// 	for(i = 0; i<4; i++){
// 		word = A( A(word) );
// System.out.println("v: " + word );
// }

// i=0;
// String word1 = "A";

// 	for(i = 0; i<4; i++){
// 		word1 = A(word1);
// System.out.println("v: " + word1 );
// }

// }

// public static String A(  Aaa){
//     return " " +  Aa + "a";
//      Aa
//       Aaa
// }


// int num=0;
// for(int a=1; a<6; a++){ //number of rows with different values
//         for(int c=1; c<=a; c++){ //number of numbers in each row
//             System.out.print(num);
//     }
// System.out.println();
// num=num+1;
// }

// for(int d=1; d<6; d++){
//         for(int f=5; f>=d; f--){
//             System.out.print(num);
//         }
//     System.out.println();
//     num=num+1;
// }

// }
// }

//public static void main(String[] args) {
//      System.out.println( sumPow(4) );
//  }
// public static int sumPow(int x){
//     int c=1;
//     int ans=0;
//     for(int a=2; a<=x+1; a++){
//         for(int b=1; b<2; b++){
//             ans*=c;
//         }
//         c+=1;
//         ans+=c;
//     }
//     return ans;

// }
// }

// int num=0;
// for(int a=1; a<6; a++){
//     for(int b=1; b<=a; b++){
//         System.out.print(num);
//     }
//     System.out.println();
//     num=num+1;
// }
// for(int c=1; c<6; c++){
//     for(int d=5; d>=c; d--){
//         System.out.print(num);
//     }
//     System.out.println();
//     num=num+1;
// }
// }

// int num=9;
// for(int a=1; a<=9; a++){
//     for(int b=9; b>=a; b--){
//         System.out.print(" ");
//     }
//     System.out.print(num);
//     System.out.println();
//     num=num-1;
// }

// Scanner scan = new Scanner(System.in);
// System.out.print("Enter the first int: ");
// int a = scan.nextInt();
// System.out.print("Enter the second int: ");
// int b= scan.nextInt();
// while (b<=a){
//     System.out.print("Enter the second int: ");
//     b= scan.nextInt();
// }
// int factorialb=0;
// for(int i=a; i<=b; i++){
//     factorialb += i;
// }
// // int factoriala=1;
// // for(int i=1; i<=a; i++){
// //     factoriala = factoriala+i;
// // }
// int answer = factorialb;
// System.out.println(answer);

// }
// }

public static void main(String[] args){
//     Scanner scan = new Scanner(System.in);
//     System.out.print("Enter an int:");
//     int a = scan.nextInt();
//     System.out.print("Eneter an int greater than"+a+":");
//     int b = scan.nextInt();
//     while(b<=a){
//         System.out.println("Sorry, you eneres"+b+"<="+a+":");
//         b = scan.nextInt();
//     }
//     int answer = sum(a,b);
//     System.out.println(a+"+...+"+b+"="+answer);
// }

// public static int sum(int x, int y){
//     int num=0;
//     for(int i=x; i<=y; i++){
//         num+=i;
//     }
//     return num;
// }

//int[] y = {4, 2, 3, 4, 5, 0, 0, 0};
//int[] x = new int[y.length];
//computeAvgs(y);

//print(y);
// int j=1;
// for (int i=0; i<y.length; i++){
//     x[y.length-j] = y[i];
//     System.out.print(x[i]);
//     j++;
// }

	int[] A = {2, 3, 4, 5, 6, 7, 9};
	int[] C = new int[A.length];
	
	for (int i = 0; i < A.length; i++) {
	    C[A.length - (i+1)] = A[i];
	    System.out.print(C[i]);

}
}

public static int[] makeZero(int x){
    int[] B = new int[x];
    for(int i=0; i<x; i++){
        B[i] = 0;
        System.out.print(B[i]);
    }
    return B;
}

public static void computeAvgs(int[] x){
    int avg1 =0;
    int avg2 =0;
    int y = 0;
    int z = 0;
    for(int i=0; i<x.length; i++){
        //System.out.print(x[i]);
    }
    for(int i = 0; i<x.length; i++){
        if(x[i] % 2 == 0){ //even
            avg1+=x[i];
            y+=1;
        }
        else{
            avg2+=x[i];
            z+=1;
        }
    }
    avg1 = avg1 / y;
    avg2 = avg2 / z;
    System.out.println(avg1);
    System.out.println(avg2);
}

public static void print(int[] x){
    for( int i=1; x[i] != 0; i++){
        System.out.print(x[i]);
    }
}



}