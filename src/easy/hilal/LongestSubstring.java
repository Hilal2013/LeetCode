package easy.hilal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {

        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstringSlidingWindow1(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int longestLength = 0;
        int first = 0;
        int second = first;//they will start from same point index 0
        while (first < s.length() && second < s.length()) {
            if (!list.contains(s.charAt(second))) {
                list.add(s.charAt(second));
                second++;
                longestLength = Math.max(longestLength, list.size());
            } else {
                list.clear();
                first++;
                second = first;
            }
        }

        System.out.println(list);
        return longestLength;

    }

    public static int lengthOfLongestSubstringSlidingWindow(String s) {
        if (s == null || s.length() == 0) return 0;
        Set<Character> set = new HashSet<>();
        int max = 0, i = 0, j = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);
            while (set.contains(ch)) {
                set.remove(s.charAt(j));
                j++;
            }
         set.add(ch);
            max=Math.max(max,i-j+1);
            i++;
        }

return max;
    }
    public static int lengthOfLongestSubstringSlidingWindow1(String s){
        int i=0, j=0, max=0;
        Set<Character> set=new HashSet<>();

        while(i<s.length()&&j<s.length()){

            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }else{
                set.add(s.charAt(i));
                max=Math.max(max,i-j+1);
                i++;

            }

        }

        return max;
    }


}
