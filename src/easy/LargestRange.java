package easy;

import java.util.*;

public class LargestRange {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};//[0, 7]
        int[] array = {2,10,6,12,3,4,11,13};
        System.out.println(Arrays.toString(largestRange(array)));
        System.out.println(largestRangeSorting(array));
        System.out.println(longestConsecutive(myArray));
    }


    public static int[] largestRange(int[] array) {
        int[] bestRange = new int[2];
        int largestRange = 0;
        Set<Integer> set = new HashSet<>();
      //  List<int[]> list=new ArrayList<>();
        for (int num : array) set.add(num);
        for (int num : set) {
            if (!set.contains(num - 1)) {//if set doesnt contain previous number //it will be start number
                int currNum = num;//0  //15  //10
               int start=currNum;
                int currRange = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;//1 2 3...7   //10 11 12
                    currRange++;//...8  //
                }
    //list.add(new int[]{start,currNum});
                if (currRange > largestRange) {
                    largestRange = currRange;
                    bestRange = new int[]{start,currNum};
                }
            }
        }
//        for (int[] each : list) {
//            System.out.println(Arrays.toString(each));
//        }
        return bestRange;
    }
    public static int largestRangeSorting(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 0, maxCount = 0;
        for (int i = 0; i < nums.length-1; i++) {    //[1,2,3,5]
            if (nums[i + 1] == nums[i]) continue;
            else if(nums[i + 1] != nums[i] + 1) count=0;//when i=2 nums[2]=3 after 5 doesnt go else statement and count and max count will be 2
            else{
                count++;
                maxCount=Math.max(maxCount,count);
            }
        }
        return maxCount + 1;

    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int longestRange= 0;
        System.out.println(set);
        //1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6
        for (int num : set) {

            if (!set.contains(num - 1)) {//if set doesnt contain previous number //it will be start number
                int currNum = num;//0  //15  //10
                int currLong = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;//1 2 3...7   //10 11 12
                    currLong++;//...8  //
                }

                longestRange = Math.max(longestRange, currLong);
            }
        }

        return longestRange;
    }
    public static int[] largestRangeSorting1(int[] nums) {
        int[] bestRange = new int[2];
        Arrays.sort(nums);
        int count = 0, maxCount = 0;
        for (int i = 0; i < nums.length-1; i++) {    //[1,2,3,5]
            if (nums[i + 1] == nums[i]) continue;
            else if(nums[i + 1] - nums[i] != 1) count=0;//when i=2 nums[2]=3 after 5 doesnt go else statement and count and max count will be 2
            else{
                count++;
                maxCount=Math.max(maxCount,count);
            }
        }
        return bestRange;

    }
}
