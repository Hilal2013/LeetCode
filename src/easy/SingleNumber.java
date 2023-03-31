package easy;


import java.util.Map;

import java.util.TreeMap;

public class SingleNumber {
    public static void main(String[] args) {

        int[] arr = {2,2,1};
        System.out.println(singleNumberWithBitWiseXOR(arr));
        System.out.println(singleNumberTwoPointers(arr));
        System.out.println(singleNumberWithMap(arr));

    }
    public static int singleNumberWithBitWiseXOR(int[] nums){
        int value=0;
        for (int num : nums) {
            value=value^num;

        }
        return value;
    }
    public static int singleNumberTwoPointers(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        if (nums.length == 1) {
            return nums[0];
        }
        while (left < nums.length && right >= 0) {
            if (nums[left] == nums[right] && left != right) { // values equal and they arent same index
                left++;
                right=nums.length-1; //it will return to end again
            } else if (nums[left] != nums[right] || left==right) {//values not equal or they are same
                right--;
            }

        }
        return nums[left];
    }

    public static int singleNumberWithMap(int[] nums) {

        Map<Integer, Integer> map = new TreeMap<>();
        int frequency = 0;
        for (int each : nums) {
            if (map.containsKey(each)) {
                frequency = map.get(each);
                map.put(each, 1 + frequency);

            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);//{1=2, 2=2, 4=1}

        return map.entrySet().stream().filter(e -> e.getValue() == 1).findAny().get().getKey();//more fast but memory more
        //or
  /*
        for(int each: nums){////memory less// but speed low
            if(map.get(each)==1){return each;}
        }
return 0;

   */
    }
}
  /*
  Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
Example 1: Example 2:
Input: nums = [2,2,1] Output: 1 Input: nums = [4,1,2,1,2] Output: 4
Example 3:
Input: nums = [1] Output: 1
Constraints:
 1 <= nums.length <= 3 * 104
 -3 * 104 <= nums[i] <= 3 * 104
 Each element in the array appears twice except for one element which appears only once.
 Follow-up question: Can you implement a solution with a linear runtime complexity and use only constant
extra space?
Please, try to test your solution via JUnit and also test your solution here:
   */