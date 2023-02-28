package easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str="Do geese see God?";
        System.out.println(checkPalindrome(str));
        System.out.println(twoPointerStrBuilder(str));
        System.out.println(twoPointerRegex(str));
    }

    public static boolean checkPalindrome(String str) {
        if (str == null || str.isBlank()) {
            return true;
        }

        str = str.toLowerCase(); // O(n)
        StringBuilder sb = new StringBuilder();//for memory
        for (int i = 0; i < str.length(); i++) { // O(n)
            if (Character.isLetterOrDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        String filtered = sb.toString();
        String reversed = sb.reverse().toString();
        return filtered.equals(reversed);

    }
    //O(n) Time
    //O(n) Space
    public static boolean twoPointerStrBuilder(String str){
        if (str == null || str.isBlank()) {
            return true;
        }

        str = str.toLowerCase(); // O(n)
        StringBuilder sb = new StringBuilder();//for memory
        for (int i = 0; i < str.length(); i++) { // O(n)
            if (Character.isLetterOrDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
//until middle comparing is enough//faster//saving time and space
        int left=0; int right=sb.length()-1;
        while(left<right){  //O(n/2)
            if(sb.charAt(left)==sb.charAt(right)){
                left++;
                right--;
            }else return false;
        }
       return true;
    }
    //O(n) Time
    //O(n) Space
   public  static boolean twoPointerRegex(String str) {
       if (str == null  || str.isBlank()) {
           return true;
       }
       str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
       int left = 0, right = str.length() - 1;//
       while (left < right) {
           if (str.charAt(left) == str.charAt(right)) {
               left ++;
               right--;
           } else
               return false;
       }
       return true;
   }
    //O(n) Time
    //O(n) Space

}
/*
Write a function that accepts a string and determines whether it is a palindrome, ignoring nonalphanumeric characters and case and returns true if it is palindrome.
(A string is said to be palindrome if it reads the same backward as forward, after converting all
uppercase letters into lowercase letters and removing all non-alphanumeric characters).
Examples:
Input: Do geese see God? Output: True
Input: Was it a car or a cat I saw? Output: True
Input: A brown fox jumping over Output: False
Constraints:
• 1 <= s.length <= 2 * 105
• s consists only of printable ASCII characters
 */
 /*
            String reversed = "";
        for (int i = result.length()-1; i >=0; i--) {
            reversed += result.charAt(i);
            if (result.equalsIgnoreCase(reversed)) {
                return true;
            }
        }
            return false;


         */