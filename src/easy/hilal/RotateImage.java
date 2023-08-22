package easy.hilal;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
     //  int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
      int[][] matrix = {{1,2},{3,4}};

       rotate(matrix);

    }

    public static void rotate(int[][] matrix) {
//n == matrix.length == matrix[i].length
        //1 <= n <= 20 //-1000 <= matrix[i][j] <= 1000
//first of all =>change rows to column and column to rows
        for (int i = 0; i < matrix.length; i++) { //{1,2},{3,4}
            for (int j =i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;////{1,3},{2,4}
            }
        }
        System.out.println(Arrays.deepToString(matrix));   //{1,3},{2,4} we want {3,1},{4,2}

        //2. Reverse in row
        int p1 = 0, p2 = matrix[0].length-1;

        while(p1<p2){

            for(int i=0; i<matrix.length; i++){
                int t = matrix[i][p1];
                matrix[i][p1] = matrix[i][p2];
                matrix[i][p2] = t;
            }

            p1++;
            p2--;

        }
        System.out.println(Arrays.deepToString(matrix));//[[3, 1], [4, 2]]

    }
//    public static void swap(int[][] matrix){
////first of all =>change rows to column and column to rows
//        for (int i = 0; i < matrix.length; i++) { //{1,2},{3,4}
//            for (int j =i; j < matrix.length; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }

//    }


}
