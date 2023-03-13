package easy;

import java.util.Arrays;

public class LengthOfLastWord {

    public static void main(String[] args) {
       // String s = "   fly me   to   the moon  ";
        String s = "a ";
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWordWithArray(s));
    }
    public static int lengthOfLastWord(String s) {
if(s.length()==1 ){
    return 1;
}

        String result=s.trim();
        result=result.substring(result.lastIndexOf(" ")+1,result.length());
        return result.length();

    }
    public static int lengthOfLastWordWithArray(String s) {


        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }
  //  public static int lengthOfLastWordWithTwoPointers(String s) {
  //      int left;
  //      int right = s.length() - 1;


  //  }

}
/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
Example 1:
Input: s = "Hello World" Output: 5
Explanation: The last word is "World" with length 5.
Example 2:
Input: s = " fly me to the moon " Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:
Input: s = "luffy is still joyboy" Output: 6
Explanation: The last word is "joyboy" with length 6.
Constraints:
 1 <= s.length <= 104
 s consists of only English letters and spaces ' '.
 There will be at least one word in s.

 */