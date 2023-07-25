package easy.hilal;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

       // int[] arr = {1, 3, 7, 5, 6};
       // int[] arr = {3,2,4};
        int[] arr = {2,7,11,15};

        System.out.println(Arrays.toString(twoSumWithTwoPointers(arr, 9)));

    }

    public static int[] twoSumWithTwoPointers(int[] arr, int target) {
        int first = 0;
        int second = arr.length - 1;
        while (first < second) {
            if (arr[first] + arr[second] == target) {
                return new int[]{arr[first], arr[second]};
            } else if(first==second-1) {
                first++;
                second =arr.length-1;

            }else{
               second --;
            }

        }
        return null;

    }


}
