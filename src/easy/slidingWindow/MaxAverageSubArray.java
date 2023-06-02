package easy.slidingWindow;

public class MaxAverageSubArray {
    public static void main(String[] args) {
        int[] nums={1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }
    public static double findMaxAverage(int[] nums, int k) {

        double maxAvg=Double.MIN_VALUE;
        double currentAvg=0;
        double currentSum=0;

        for (int i = 0; i < nums.length; i++) {
            currentSum+=nums[i];
            if(i>=k-1){//to ensure that we stored enough elements to calculate an average of size
// k=4 i>=3
                currentAvg=currentSum/k;
                maxAvg=Math.max(maxAvg,currentAvg);

                currentSum=currentSum-nums[i-k+1];// to remove the first element  of the current window.

            }
        }

return maxAvg;
    }

}
/*
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.



Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000


Constraints:

n == nums.length
1 <= k <= n <= 105
-104 <= nums[i] <= 104
 */