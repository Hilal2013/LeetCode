package easy;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
       // int[] nums={9,6,4,2,3,5,7,0,1};
       int[] nums = {0, 1};
        System.out.println(missingNumberXOR(nums));
        System.out.println(missingNumber(nums));
        System.out.println(missingNumberWithArr(nums));
        System.out.println(missingNumberWithMath(nums));
    }
    public static int missingNumberXOR(int[] nums) {
        int missingNumber=0;
        for (int i = 0; i < nums.length; i++) {
        missingNumber = missingNumber^(nums[i]^(i+1));
        }
        return  missingNumber;
    }
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums); //time complexity O(nlog n)

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;

    }

    public static int missingNumberWithArr(int[] nums) {
        int[] numsArr = new int[nums.length + 1];//Space complexity O (n)
        for (int eachNum : nums) {
            numsArr[eachNum]++;//
        }

        for (int i = 0; i < numsArr.length; i++) {
            if (numsArr[i] != 1) return i;
        }
        return -1;
    }
    public static int missingNumberWithMath(int[] nums) {
      int sum=nums.length*(nums.length+1)/2;

        for (int i = 0; i < nums.length; i++) {
           sum=sum-nums[i];
        }
        return sum;

    }
}
/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 public static int missingNumber(int[] nums) {
        Arrays.sort(nums);


        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i){
             return i;
            }
        }
        return nums.length;
    }
    //time complexity O(nlog n)


}

 */
