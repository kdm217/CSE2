////////////////////////////////////
//Keri McGlothlin
//CSE 002-110
//September 24th
//Ragged Array
//This program helps with arrays.

public class RaggedArray{ //main method

    public static void main(String[] args) {
        
        int[][] A = new int[5][];
        
        A[0] = new int[5];
        A[1] = new int[8];
        A[2] = new int[11];
        A[3] = new int[14];
        A[4] = new int[17];
        
        for (int i = 0; i < A.length; i++){
            for (int b = 0; b < A[i].length; b++){
                A[i][b] = (int)(Math.random() * 39);
                System.out.print(A[i][b]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        for(int i=0; i<A.length; i++){
            boolean condition = true;    
            while(condition){
                condition = false;
                for(int j=0; j< A[i].length-1; j++){
                    if(A[i][j] > A[i][j+1]){
                        int temp = A[i][j];
                        A[i][j] = A[i][j+1];
                        A[i][j+1] = temp;
                        condition = true;
                    }

                }
                
            }
        }
        
        for (int i = 0; i < A.length; i++){
            for (int b = 0; b < A[i].length; b++){
                System.out.print(A[i][b]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        

    }
}