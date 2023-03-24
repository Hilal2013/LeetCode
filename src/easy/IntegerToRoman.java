package easy;

import java.util.TreeMap;

public class IntegerToRoman {
    public static void main(String[] args) {

        int num = 95;
        System.out.println(intToRoman(num));

    }

    public static String intToRoman(int num) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        String numStr = String.valueOf(num);
        String result = "";

        int p = numStr.length() - 1;//for example 1994  length=4 p=3 10^3
        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            if (i == 0) {
                result += map.get(ch * Math.pow(10, p));//1000
            }  else {
                result += map.get(ch * Math.pow(10, p--));

            }

        }

        return result;
    }
}
/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.



Example 1:

Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
Example 2:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 3:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:

1 <= num <= 3999

else if (i == numStr.length() - 1) {
                result += map.get(num % Math.pow(10, p));
            }

 */