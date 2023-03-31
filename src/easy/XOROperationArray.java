package easy;

import java.util.Arrays;

public class XOROperationArray {
    public static void main(String[] args) {

        System.out.println(xorOperation(4,3));

    }

    public static int xorOperation(int n, int start) {
int[] nums=new int[n]; //space comp O(n)
int value=0;
        for (int i = 0; i < n; i++) { //time comp O(n)
            nums[i]=start+(2*i);
        //   value=value^nums[i];
           value^=nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return value;
    }

}
/*
ou are given an integer n and an integer start.

Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.

Return the bitwise XOR of all elements of nums.



Example 1:

Input: n = 5, start = 0
Output: 8
Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
Where "^" corresponds to bitwise XOR operator.
Example 2:

Input: n = 4, start = 3
Output: 8
Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.

 */