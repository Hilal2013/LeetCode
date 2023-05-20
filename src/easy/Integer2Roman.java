package easy;

import java.util.LinkedHashMap;

public class Integer2Roman {
    public static void main(String[] args) {

        int num = 1994;//MCMXCIV

        System.out.println(intToRoman(num));

    }

    public static String intToRoman(int num) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        //for insertion order
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
        StringBuilder str=new StringBuilder();
        for (int key : map.keySet()) {
            while(num >= key) {
                num-=key;
                // num = num - key;
                str.append(map.get(key));
                //  str = str + map.get(key);
            }
        }
        return str.toString();
    }
}
