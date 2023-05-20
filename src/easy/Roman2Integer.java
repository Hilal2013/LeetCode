package easy;

import java.util.TreeMap;

public class Roman2Integer {
    public static void main(String[] args) {
    //String s = "LVIII";
     String s=  "MCMXCIV";//1994
       // String s=  "VV";
        System.out.println(romanToInt(s));



    }
    public static int romanToInt(String s) {
        TreeMap<Character, Integer> map=new TreeMap<>();
        map.put('I',1);
        //    map.put("IV",4);
        map.put('V',5);
        //   map.put("IX",9);
        map.put('X',10);
        //     map.put("XL",40);
        map.put('L',50);
        //   map.put("XC",90);
        map.put('C',100);
        //   map.put("CD",400);
        map.put('D',500);
        // map.put("CM",900);
        map.put('M',1000);

        int sum=0;
        char[] array=s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                sum=sum+map.get(array[i]);
            }else if(map.get(array[i])>map.get(array[i+1])){// M>C
                sum=sum+map.get(array[i]);
            }  else if(map.get(array[i])==map.get(array[i+1])){
                sum=sum+map.get(array[i]);
            }else if(map.get(array[i])<map.get(array[i+1])){//C<M M-C 1000-100=900=>CM(900) or X<C//C-X 100-10=90=> CX
                                                          //I<V  V-I=5-1=4=>IV
                sum=sum+map.get(array[i+1])-map.get(array[i]);
                i++;//we should increase not to compare same characters
            }
        }

        return sum;
    }
}
/*


 */