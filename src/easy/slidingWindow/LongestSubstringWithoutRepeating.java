package easy.slidingWindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {
        String s = "aabcbcbb";
        //String s = "bbb";

        System.out.println(lengthOfLongestSubstringSlidingWindow(s));
        ;


    }

    public static int lengthOfLongestSubstringBruteForceSet(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            int len = 0;
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (set.contains(c)) {
                    break;
                }
                set.add(c);
                len++;
            }
            max = Math.max(max, len);
        }
        return max;
    }

    public static int lengthOfLongestSubstringSlidingWindow(String s) {
//The main idea behind the sliding window technique is to convert two nested
//loops into a single loop (time complexity from O(n^2) to O(n)).
        if (s == null || s.length() == 0) return 0;
        Set<Character> set = new HashSet<>();
        int max = 0;
        int i = 0, j = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            while (set.contains(ch)) {
                set.remove(s.charAt(j));
                ++j;
            }
            set.add(ch);
            System.out.println(set);
            max = Math.max(max, i - j + 1);
            i++;


        }
        return max;
    }

    public static int lengthOfLongestSubstring(String s) {
//i didnt want to use set because abbc it will be abc but it is not substring//

        List<Character> list = new ArrayList<>();
        int longestLength = 0;
        int first = 0;
        int second = first;//they will start from same point index 0
        while (first < s.length() && second < s.length()) {
            if (!list.contains(s.charAt(second))) {//a b
                list.add(s.charAt(second));//ab
                second++;//1 2
                longestLength = Math.max(longestLength, list.size());//1 2 3
            } else {
                list.clear();//if doesnt contain im gonna remove that i added before
                first++;//b
                second = first;
            }
        }
        return longestLength;
    }

}
/*
Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


first<s.length()&&second<s.length()
 */