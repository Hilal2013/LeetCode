package easy;

import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {

        int[] nums= {0,1,0,3,12};
        moveZeroes(nums);//[1, 3, 12, 0, 0]
        moveZeroesWithSort(nums);//[12, 3, 1, 0, 0]
        moveZeroesWithQueue(nums);

    }
    public static void moveZeroes(int[] nums){
      List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                list.add(nums[i]);
            }
        }
        int addZero=nums.length- list.size();
        for (int i = 0; i <addZero ; i++) {
            list.add(0);
        }
        System.out.println(list);
    }
    public static void moveZeroesWithSort(int[] nums){
       Arrays.sort(nums);
        int [] zeroEnd= new int[nums.length];
        for (int i = nums.length - 1,j=0; i >= 0; i--,j++) {//Brute force //O(n^2)
            zeroEnd[j]=nums[i];
        }
        System.out.println(Arrays.toString(zeroEnd));

    }
    public static void moveZeroesWithQueue(int[] nums){
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums [i] != 0) {
                // Add only non-zero numbers to the queue
                queue.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (queue.size() != 0) {
                // Replace nums[i] with the first number from the queue using "poll" method.
                nums[i] = queue.poll();
            } else  {
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