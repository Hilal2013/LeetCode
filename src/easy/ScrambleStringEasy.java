package easy;

import java.util.HashMap;

public class ScrambleStringEasy {
    public static void main(String[] args) {

        String str1 = "rkqodlw";
        String str2 = "world";
        System.out.println(isStringScrambled(str1, str2)); // Output: true

        str1 = "cdore";
        str2 = "coder";
        System.out.println(isStringScrambled(str1, str2)); // Output: true

       str1 = "h3llko";
       str2 = "hello";
        System.out.println(isStringScrambled(str1, str2)); // Output: false
    }

    public static boolean isStringScrambled(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
//        for (char c : str1.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }

        for (char c : str1.toCharArray()) {//"h3llko"
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (char c : str2.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                if (count == 1) {
                    map.remove(c);
                } else {
                    map.put(c, count - 1);
                }
            } else {
                return false;
            }
        }

     return true;
    }
}