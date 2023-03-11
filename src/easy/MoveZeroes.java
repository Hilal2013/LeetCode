package easy;

import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        moveZeroesWithTwoPointers1(nums);
//moveZeroesWithTwoPointers(nums);//[12, 1, 3, 0, 0]
     //   moveZeroesWithPointers(nums);
    //   moveZeroes(nums);//[1, 3, 12, 0, 0]
     //   moveZeroesOptimal(nums);
   //     moveZeroesWithList(nums);

    }
    public static void moveZeroesWithTwoPointers1(int[] nums) {

        int right =1;
        int left = 0;
        while ( right<nums.length) {

            if (nums[right] != 0 && nums[left] != 0) {
                left++;
                right++;
            } else if  (nums[right] == 0 && nums[left] == 0){
                right++;
            } else if (nums[right] > 0 && nums[left] == 0) {
                nums[left] = nums[right];
                nums[right] = 0;

                right++;
                left++;
            }

        }

        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroesWithTwoPointers(int[] nums) {

        int right = nums.length - 1;
        int left = 0;
        while (left < right) {
            if (nums[right] != 0 && nums[left] != 0) {
                 left++;
            } else if (nums[right] == 0 && nums[left] > 0) {

                right--;
                left++;

            } else if (nums[right] > 0 && nums[left] == 0) {
                nums[left] = nums[right];
                nums[right] = 0;

                right--;
                left++;
            } else if  (nums[right] == 0 && nums[left] == 0){
              right--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroesWithPointers(int[] nums) {

        int pointerZero = nums.length - 1;
        int pointerNonZero = 0;
        while (pointerZero < nums.length&& pointerNonZero< nums.length) {
            if (nums[pointerZero] != 0 && nums[pointerNonZero] != 0) {
                pointerZero++;
                pointerNonZero++;
            } else if  (nums[pointerZero] == 0 && nums[pointerNonZero] == 0){
                pointerNonZero++;
            } else if (pointerNonZero>pointerZero &&nums[pointerZero] == 0 && nums[pointerNonZero] != 0) {
                nums[pointerZero] = nums[pointerNonZero];
                nums[pointerNonZero] = 0;

            } else {
                pointerZero++;

            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroesOptimal(int[] nums) {
        int j = 0;//find zeros (slow) //i=trying find numbers (fast)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];//assigning
                j++;
            }
        }

        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;//all of them assign zero
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroesList(int[] nums) {//my solution didnt pass on leetcode
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
            }
        }
        int addZero = nums.length - list.size();
        for (int i = 0; i < addZero; i++) {
            list.add(0);
        }
        System.out.println(list);
    }

    public static void moveZeroesWithSort(int[] nums) {//Brute force //O(n^2)
        Arrays.sort(nums);
        int[] zeroEnd = new int[nums.length];
        for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) {
            zeroEnd[j] = nums[i];
        }
        System.out.println(Arrays.toString(zeroEnd));

    }

    public static void moveZeroesWithQueue(int[] nums) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Add only non-zero numbers to the queue
                queue.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (queue.size() != 0) {
                // Replace nums[i] with the first number from the queue using "poll" method.
                nums[i] = queue.poll();
            } else {
                // Replace the remaining array elements with zeros.
                nums[i] = 0;
            }
        }
        System.out.println(queue);
    }

}
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */