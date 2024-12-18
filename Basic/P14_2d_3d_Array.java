public class P14_2d_3d_Array {
    public static void main(String[] args) {
        
        // 2D array
        int[][] arr2D_A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
            };
        int[][] arr2D_B ={
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18}
        };
        // 2D multiplication 
        if (arr2D_A[0].length != arr2D_B[0].length){
            System.out.println("Not possible");
            return;
        }
        int rows = arr2D_A.length;
        int cols = arr2D_A[0].length;
        int[][] arr2D_C = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < cols; k++) {
                    arr2D_C[i][j] += arr2D_A[i][k] * arr2D_B[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix !!");
        for(int [] row : arr2D_C){
            System.out.println();
            for(int val : row){
                System.out.print(val + " ");
            }
        }
        System.out.println();
        // 3d array
        int[][][] arr3D_A = {
            { {1, 2, 3}, {4, 5, 6},{7, 8, 9} },
            { {10, 11, 12}, {13, 14, 15},{16, 17, 18} }
        };
        
        int[][][] arr3D_B = {
            { {20, 21, 22}, {23, 24, 25},{26, 27, 28} },
            { {30, 31, 32}, {33, 34, 35},{36, 37, 38} }
        };
        // 3D multiplication
        if(arr3D_A.length != arr3D_B.length || arr3D_A[0].length != arr3D_B[0].length || arr3D_A[0][0].length !=arr3D_B[0][0].length) {
            System.out.println("Not possible");
            return;
        }
        int[][][] result = new int[arr3D_A.length][arr3D_A[0].length][arr3D_A[0][0].length];
        for (int i = 0; i < arr3D_A.length; i++) {
            for (int j = 0; j < arr3D_A[i].length; j++) {
                for (int k = 0; k < arr3D_A[i][j].length; k++) {
                    result[i][j][k]=arr3D_A[i][j][k]*arr3D_B[i][j][k];
                }
            }
        }
        // Print the result
        System.out.println("Resultant 3D Matrix:");
        for (int[][] matrix2D : result) {
            for (int[] row : matrix2D) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println();
        }       
    }
    
}
