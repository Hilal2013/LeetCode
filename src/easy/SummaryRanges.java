package easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,7,8,12};

        System.out.println(summaryRanges(nums));
        System.out.println(summaryRanges1(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        if (nums.length == 0) {
            return list;
        }else if(nums.length==1){
            list.add(String.valueOf(nums[0]));
            return list;
        }

int start=0; int end=0; //start will be index 0
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1] + 1) {//if it is increasing one by one the last i will be end
                   end=i;
            } else {
                if(end==start){list.add(String.valueOf(nums[start]));}
                else  list.add(nums[start]+"->"+nums[end]);
                start=i;
                end=i;

            }

        }
        if(end==start){list.add(String.valueOf(nums[start]));}
      else  list.add(nums[start]+"->"+nums[end]);

        return list;
    }

    public static List<String> summaryRanges1(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        }else if(nums.length==1){
            list.add(String.valueOf(nums[0]));
            return list;
        }
        int start = 0;
        int end = 0;
        int i = 0;
        while(i < nums.length)
        {
            if(i+1  < nums.length && nums[i + 1] - nums[i] == 1)
            {
                end++;
            }
            else {

                if(start == end)
                {
                    list.add(String.valueOf(nums[end]));
                }
                else{
                    list.add(nums[start] + "->" + nums[end]);
                }

                end++;
                start = end;
            }
            i++;
        }
        return list;

    }


}
/*
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b


Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"
 */