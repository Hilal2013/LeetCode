package easy.hilal;

public class IsSubsequence {
    public static void main(String[] args) {
     String s = "acd", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
       int first =0, second=0;
       if(s.length()==0)return true;


        while(first<s.length() && second<t.length()){
            if(s.charAt(first)==t.charAt(second)){
                first++;

            }else{
                second++;
            }
            if(first == s.length()) return true;
        }


        return false;
    }
}
//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//
//A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
//
//
//
//Example 1:
//
//Input: s = "abc", t = "ahbgdc"
//Output: true
//Example 2:
//
//Input: s = "axc", t = "ahbgdc"
//Output: false