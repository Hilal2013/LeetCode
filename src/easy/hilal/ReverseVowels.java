package easy.hilal;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {

        int first = 0;
        int second = s.length() - 1;
        StringBuilder sb=new StringBuilder(s);
        while (first < second) {
            if (isVowel(s.charAt(first)) && isVowel(s.charAt(second))) {
                char temp=s.charAt(first);
                sb.setCharAt(first, sb.charAt(second));
                sb.setCharAt(second,temp);
                first++;
                second--;}
 else if(!isVowel(s.charAt(first))) first++;
 else second--;
        }

return sb.toString();
    }
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';

    }

}
//Given a string s, reverse only all the vowels in the string and return it.
//
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//
//
//
//Example 1:
//
//Input: s = "hello"
//Output: "holle"
//Example 2:
//
//Input: s = "leetcode"
//Output: "leotcede"