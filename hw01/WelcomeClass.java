//////////////////////////////////////////////
//Keri McGlothlin
//Welcome Class Java Program

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

        
        public static void main(String[] args) {
            //using methods defined in a & b
            int i = 0;
            int counter = 0;
            for (i = 0; i < 3; i++) {
                counter += X(Y(i));
                System.out.println("counter: " + counter);
            }
        }

        public static int X(int i) {
            return i / 2;
        }
        public static int Y(int z) {
            return z + 1;
        }
        
    }
