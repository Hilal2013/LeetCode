package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(checkAnagram(s, t));
        System.out.println(checkAnagramWithMap(s, t));
        System.out.println(withArrayCoversAllUnicode(s,t));
    }

    //solution one
    public static boolean checkAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();//space complexity
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

        //
//time complexity O(n(log n))
        //space complexity 0(n)
    }

    //solution two
    public static boolean checkAnagramWithMap(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (char each : s.toCharArray()) {
            if (!map.containsKey(each)) {
                map.put(each, 1);
            } else {
                map.put(each, map.get(each) + 1);
            }
        }
        System.out.println(map);//{a=3, r=1, g=1, m=1, n=1}

        for (char each : s.toCharArray()) {
            if (map.containsKey(each)) {
                if (map.get(each) == 1) {
                    map.remove(each);
                } else {
                    map.put(each, map.get(each) - 1);
                }
            } else {
                return false;
            }
        }
        System.out.println(map);//{}
return true;

//time complexity O(n) space complexity O(n)
    }
    public static boolean withArrayCoversAllUnicode(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] chars = new int[149186];

        for (int i = 0; i < s.length(); i++) {   // Time Complexity: O(n)
            chars[s.charAt(i)]++;         // increasing count of that char found in s
            chars[t.charAt(i)]--;         // decreasing count of that char found in t
        }

        for (int i = 0; i < 149186; i++) {
            if (chars[i] != 0)                 // every character count must be zero
                return false;
        }
        return true;
    }
//O(n) Time  O(1) Space
}
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
Constraints:
 1 <= s.length, t.length <= 5 * 104
 s and t consist of lowercase English letters.
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to
such a case?
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
 */