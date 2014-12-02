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
    
    public static int[][][] buildMat3d(int[][][] x){
        for(int i=0; i< 7; i=(i*2+3)){
            for( int j=0; j<(j+s+1); j++){
                int[][][] threeDimArr = new int[i][j][6];
        }
        }
    }
    
    public static void show(int[][][] x){ //prints the array
        String r = "";
        int slabs = 3;
        for(int j=0; j<=slabs; j++){
            for (int row=0; row < x[j].length ; ++row) {
              r += Arrays.toString(x[j][row]) + "\n";
            }
            System.out.println(r);
        }
    
    public static int[][] sort(int[][] x){
        
    }
}

