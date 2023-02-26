package easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x=-101;

        System.out.println(isPalindrome(x));
    }


    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;}
        String number=String.valueOf(x);
        return new StringBuilder(number).reverse().toString().equals(number);

    }


    public static boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;}

        String number=String.valueOf(x);
        String result="";
        for (int i = number.length()-1; i >=0 ; i--) {
            result+=number.charAt(i)+"";
        }

        return result.equals(number);

    }



}
/*
Given an integer x, return true if x is a
palindrome
, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */