package easy.searchAlgorithm;

public class Search2DMatrix {
    public static void main(String[] args) {
         int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        //int[][] matrix = {{1,2},{3,4}};
        System.out.println(searchMatrix(matrix,8));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
      //find matrix length and single dimension array(row) length
        // => find how many elements matrix have to find the last element index
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0, right=m*n-1, middle=0;
        while(left<=right){
            middle=(left+right)/2;  //middle will be 3*3-1=8/2= index 4 it means matrix[1][1]=>row=>4/3 column=>4%3
            int middleValue=matrix[middle/n][middle%n];
            if(target==middleValue){
                return true;
            }else if(target<middleValue){

                right=middle-1;

            }else{
                left=middle+1;
            }
        }
        return false;
    }


}
