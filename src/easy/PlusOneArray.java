package easy;

import java.util.Arrays;

public class PlusOneArray {
    public static void main(String[] args) {

        // int[] digits = {1, 2, 3};
       // int[] digits = {9, 9, 9};
        int[] digits = {1, 9, 9};

          System.out.println(Arrays.toString(plusOne(digits)));
       System.out.println(Arrays.toString(plusOneWithArray(digits)));
         System.out.println(Arrays.toString(plusOneWithTwoPointer(digits)));
    }

    public static int[] plusOneWithTwoPointer(int[] digits) {
        int left = 0;
        int right = digits.length - 1;
        while (left <= right) {// just im gonna decrease right in while loop
            if (digits[right] <= 8) {
                digits[right] = digits[right] + 1;
                return digits;
            }else if(digits[right] == 9){
                digits[right]=0;
                right--;
            }

        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static int[] plusOneWithArray(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] <= 8) {
                digits[i] = digits[i] + 1;
                return digits;
            } else if (digits[i] == 9) {
                digits[i] = 0;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static int[] plusOne(int[] digits) {
        String str = "";
        for (int i = 0; i < digits.length; i++) {//convert array to string
            str += digits[i];

        }
        int num = Integer.parseInt(str) + 1;//convert string to int and add 1
      //  char[] arr=String.valueOf(num).toCharArray();

        int[] arr = Integer.toString(num)  //convert to String value
                .chars() //get a stream
                .map(c -> c - '0')// get the actual int value of a chracter
                .toArray();//to terminate canvert the stream int array

        return arr;


    }
}
/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].


Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.

 if (digits[i - 1] < 9) {
                    digits[i -1] = digits[i] + 1;
                 return digits;
                }

 */