package easy.hilal;

import java.util.*;

public class FindFirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "loveleetcode";
        //int[] arr={1,2,2,1,1,3};
        int[] arr = {1, 2};
        // int[] arr = {-3,0,1,-3,1,1,1,-3,10,0}
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(findFirstUniqueChar(str));
        System.out.println(firstUniqChar(str));
        System.out.println(uniqueNumberOfOccurrences(arr));
        System.out.println(largestAltitude(gain));
    }

    public static Character findFirstUniqueChar(String str) {

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }

        }
        return null;
    }

    public static int firstUniqChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i)) && map.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static boolean uniqueNumberOfOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        //put the frequencies in a set
        Set<Integer> set = new HashSet<>();
        for (int value : map.values()) {
            if (!set.add(value)) return false; //if doesnt ad it means duplicated
        }

        return true;
    }

    public static int largestAltitude(int[] gain) {
        //        int[] gain = {-4,-3,-2,-1,4,3,2};
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude[i+1]=altitude[i]+gain[i];
        }
        System.out.println(Arrays.toString(altitude));//[0, -4, -7, -9, -10, -6, -3, -1]
        int max=altitude[0];
        for(int i:altitude){
            max=Math.max(max,i);
        }

        return max;

    }
}
//There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
//
//You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
//
//
//
//Example 1:
//
//Input: gain = [-5,1,5,0,-7]
//Output: 1
//Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
//Example 2:
//
//Input: gain = [-4,-3,-2,-1,4,3,2]
//Output: 0
//Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.