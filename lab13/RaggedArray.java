////////////////////////////////////
//Keri McGlothlin
//CSE 002-110
//September 24th
//Random Games
//This program helps with arrays.

public class RaggedArray{ //main method

    public static void main(String[] args) {
        
        int[][] A = new int[5][];
        
        A[0] = new int[5];
        A[1] = new int[8];
        A[2] = new int[11];
        A[3] = new int[14];
        A[4] = new int[17];
        
        // int j=0;
        // for(int i=5; i< 17; i=(i*3+5)){
        //     A[j] = new int[i];
        //     j++;
        // }
        
        // for (int x = 0; x < 5; x++) {
        //     for(int i=0; i<= (i*3+5); i++) {
        //         int rand = (int)(Math.random() * 39);
        //         A[x][i]= rand;
        //     }
        // }
        
        for (int i = 0; i < A.length; i++){
            for (int b = 0; b < A[i].length; b++){
                A[i][b] = (int)(Math.random() * 39);
            }
        }

        
        for (int i = 0; i < 5; i++) {
            for (int a = 0; a <= (i*3+5); a++)
                System.out.print(A[i][a] + " ");
                System.out.println();
            }
    }
}