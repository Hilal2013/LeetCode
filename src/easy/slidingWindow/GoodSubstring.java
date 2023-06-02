package easy.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;

public class GoodSubstring {
    public static void main(String[] args) {
        String s = "aababcabc";
        System.out.println(countGoodSubstrings(s));
        System.out.println(countGoodSubstringsSlidingWindow(s));
    }

    public static int countGoodSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;
        ArrayList<Character> list = new ArrayList<>();
        int count = 0;
        int windowSize = 3;
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
            if(list.size()>windowSize){
                list.remove(0);
            }
           if(list.size()==windowSize) {

               if(list.get(0) != list.get(1) && list.get(0) != list.get(2) && list.get(1) != list.get(2))
                   count++;
           }


        }
        return count;
    }

    public static int countGoodSubstringsSlidingWindow(String s) {
        int i=0,j=0,count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(i<s.length()) {

            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if(i-j+1<3){
                i++;
            }else if(i-j+1==3){
                if(map.size()==3) {
                    count++;
                    System.out.println(map);
                }


            }
            i++;
            j++;

        }


       return count;
    }

}
/*
A string is good if there are no repeated characters.

Given a string s, return the number of good substrings of length three in s.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A substring is a contiguous sequence of characters in a string.



Example 1:

Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
The only good substring of length 3 is "xyz" so there is 1 good substring.
Example 2:

Input: s = "aababcabc"
Output: 4
Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".


Constraints:

1 <= s.length <= 100
 s consists of lowercase English letters.
 */