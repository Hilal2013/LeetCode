package easy.hilal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapReview {
    public static void main(String[] args) {
        String st = "JJaJavDDevellopperr";

        System.out.println(findFirstNonRepeating(st));
    }

    public static Character findFirstNonRepeating(String str) {
        Map<Character, Integer> map = new TreeMap<>();
        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);//{D=2, J=3, a=2, e=3, l=2, o=1, p=2, r=2, v=2}
        List<Integer> list  =  map.values().stream().sorted((o1, o2) ->o2-o1 ).collect(Collectors.toList());
        System.out.println(list);//[3, 3, 2, 2, 2, 2, 2, 2, 1]
        for (char ch : str.toCharArray()) {
            if(map.get(ch)==2){
                return ch;//a
            }
        }
        return null;
    }
}