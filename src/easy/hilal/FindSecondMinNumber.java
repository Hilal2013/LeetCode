package easy.hilal;

import java.util.Arrays;

public class FindSecondMinNumber {
    public static void main(String[] args) {
        int arr[] = {111, 13, 25, 9, 34, 1};

        System.out.println(findSecondMin(arr));
        System.out.println(findSecondMinStream(arr));
    }

    public static int findSecondMin(int[] arr) {
        int min = arr[0];
        int secondMin = arr[0];
        for (int i : arr) {
            min = Math.min(min, i);
        }

        for (int i : arr) {
//            if ( secondMin<i && i > min) {
//                secondMin = i;
//            }
            if(i>min){
                secondMin=Math.min(secondMin,i);
            }

        }

        return secondMin;
        
//        int first =Integer.MAX_VALUE;
//int second=Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < first) {
//                second = first;
//                first = arr[i];
//            }
//            else if (arr[i] < second && arr[i] != first)
//                second = arr[i];
//        }
//
//      return second;
//

    }

    public static int findSecondMinStream(int[] arr) {

        int[] sortedArr = Arrays.stream(arr).sorted().limit(2).toArray();
        System.out.println(Arrays.toString(sortedArr));
        return sortedArr[1];
    }

}
