package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array={1,3,7,5,6};
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSumWithTwoPointers(arr, 6)));
        System.out.println(Arrays.toString(twoSumOptimalSolution(arr,6)));

    }

    public static int[] twoSumWithTwoPointers(int[] nums, int target) {

        int[] arr = new int[2];

        int first = 0;
        int second = first + 1;

        while (first < second) {
            if (nums[first] + nums[second] == target) {
                arr[0] = first;
                arr[1] = second;
                break;
            } else if (second == nums.length - 1) {
                first++;
              //  second = first + 1;
            } else {
                second++;
            }
        }
        return arr;
    }
    public static int[] twoSumOptimalSolution(int[] array, int targetValue) {
        // Complexity of the solution is O(n) but I have space complexity of O(n)
        // create hashmap
        //im gonna create map key will be each element
        // value will be index //to get index through using get()method
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < array.length; i++) {

            int potentialMatch=targetValue-array[i];//9-2=7 if seven is exist//map contains 7
            if(map.containsKey(potentialMatch)){
                return new int[]{i,map.get(potentialMatch)};
            }else{
                map.put(array[i],i);
            }
        }

        return new int[]{};
    }

}
/*
Given an array of integers nums and an integer target, return the two numbers such that they add
up to target.
Assume that each input would have exactly one solution, and you should not use the same
element twice.
You can return the answer in any order.
No solution will return empty array.
Please, use two pointer strategy to solve this problem
(Hint : you should sort the input first).
Example:
Input: nums = [16, 3, 11, 5, 15], target = 8
Output: [3, 5]
Explanation: Because nums[1] + nums[3] => 3 + 5 = 8, we return [3, 5].
Optional additional task: Try to return original indices of the pair numbers
 */
