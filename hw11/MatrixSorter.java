////////////////////////////////////
//Keri McGlothlin
//CSE 002-110
//September 24th
//Matrix Sorter program.
//This program helps with arrays.

public class MatrixSorter {
    public static void main(String arg[]) {
        int mat3d[][][];
        mat3d = buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is " +
            findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }
    
    public static int[][][] buildMat3d(int[][][] threeDimArr){
        int threeDimArr[][][] = new int[3][][];
        for(int i=0; i< threeDimArr.length; i++){
            threeDimArr[i] = new int[i*2+3]; 
            for( int j=0; j<threeDimArr[i].length; j++){
                threeDimArr[i][j] = new int[i+j+1];
            }
        }
        return threeDimArr;
    }
    
    public static void show(int[][][] threeDimArr){ //prints the array
        for (int i = 0; i < threeDimArr.length; i++){ //slabs
        System.out.println("---------------------------Slab "+ (i+1));
            for (int b = 0; b < threeDimArr[i].length; b++){ //branches
                for (int j = 0; j<threeDimArr[i][b]; j++){ ///fruit
                System.out.print(A[i][b][j]);
                System.out.print(" ");
                }
            System.out.println("");
            }
        }
    
    public static int[][][] sort(int[][][] threeDimArr){
        for(int i=0; i<threeDimArr.length; i++){
            boolean condition = true;    
            while(condition){
                condition = false;
                for(int a = 0; a<threeDimArr[i]; a++){
                    for(int j=0; j< threeDimArr[i][a].length-1; j++){
                        if(threeDimArr[i][a][j] > threeDimArr[i][a][j+1]){
                            int temp = threeDimArr[i][a][j];
                            threeDimArr[i][a][j] = threeDimArr[i][a][j+1];
                            threeDimArr[i][a][j+1] = temp;
                            condition = true;
                        }
                    }

                }
                
            }
        }
        return threeDimArr;
    }
    
    public static int findMin(int[][][] threeDimArr){
        int min = 0;
        for(int i=0; i<threeDimArr.length; i++){
            boolean condition = true;    
            while(condition){
                condition = false;
                for(int a = 0; a<threeDimArr[i]; a++){
                    for(int j=0; j< threeDimArr[i][a].length-1; j++){
                        if(threeDimArr[i][a][j] < threeDimArr[i][a][j+1]){
                            min = threeDimArr[i][a][j]
                            condition = true;
                        }
                    }

                }
                
            }
        }
        return min;
    }
}

