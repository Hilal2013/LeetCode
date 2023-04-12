package easy.stack;

import java.util.Stack;

public class BackSpaceString {
    public static void main(String[] args) {
        String s = "ab##";
        String t = "a#b#";
        System.out.println(backspaceCompareWithStringBuilder(s, t));
        System.out.println(backspaceCompareWithStack(s,t));

    }
    public static boolean backspaceCompareWithStack(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (s1.isEmpty()) {
                    continue;
                } else {
                    s1.pop();
                }

            } else {
                s1.push(s.charAt(i));
            }
        }
            for (int i = 0; i < t.length(); i++) {
                if (t.charAt(i) == '#') {
                    if (t1.isEmpty()) {
                        continue;
                    } else {
                        t1.pop();
                    }

                } else {
                    t1.push(s.charAt(i));
                }


            }


            return s1.equals(t1);


    }
    public static boolean backspaceCompareWithStringBuilder(String s, String t) {

        StringBuilder s1 = new StringBuilder();
        StringBuilder t1 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (s1.length() == 0) {
                    continue;
                } else {
                    s1.deleteCharAt(s1.length() - 1);
                }

            } else {
                s1.append(s.charAt(i));
            }

        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (t1.length() == 0) {
                    continue;
                } else {
                    t1.deleteCharAt(t1.length() - 1);
                }

            } else {
                t1.append(s.charAt(i));
            }
        }
        return s1.toString().equals(t1.toString());

    }
}
/*
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.



Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
 */