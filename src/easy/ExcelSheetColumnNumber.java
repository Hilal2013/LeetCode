package easy;

import java.util.HashMap;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String columnTitle= "ZY";//701

        System.out.println(titleToNumber(columnTitle));

    }

    public static int titleToNumber(String columnTitle) {
        HashMap<Character,Integer> map  = new HashMap<>();
        for (int i = 1; i <= 26; i++) {//ASCII 65='A' 90='Z'//key A begins 1 so I m gonna start 1
            char chr= (char) (i+64);//from int to char cast

           map.put(chr,i);
        }

        System.out.println(map);
        //{A=1, B=2, C=3, D=4, E=5, F=6, G=7, H=8, I=9, J=10, K=11, L=12, M=13, N=14, O=15, P=16, Q=17, R=18, S=19, T=20, U=21, V=22, W=23, X=24, Y=25, Z=26}

      int result=0;

      while(columnTitle.length()>0){
          char firstCharacter=columnTitle.charAt(0);
          result=(26*result)+ map.get(firstCharacter); //unboxing=>Integer->int? it didnt want anything// 26*26+ 25
          columnTitle=columnTitle.substring(1);// second character will be first character

      }


        return result;
    }


}
/*
2 Excel Sheet Column Number
 Given a string columnTitle that represents the column title as appears in an Excel sheet, return its
corresponding column number.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
Example 1:
Input: columnTitle = "A" Output: 1
Example 2:
Input: columnTitle = "AB" Output: 28
Example 3:
Input: columnTitle = "ZY" Output: 701
Constraints:
 1 <= columnTitle.length <= 7
 columnTitle consists only of uppercase English letters.
 columnTitle is in the range ["A", "FXSHRXW"].
 */