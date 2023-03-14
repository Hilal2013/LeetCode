package easy;

import java.util.*;

public class TheAnimalsWentTwoByTwo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList( "goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan"));
        System.out.println(showPairAnimals(list));//{horse=2, rabbit=2, goat=2}
        System.out.println(showPairAnimalsWithTwoPointers(list));//{horse=2, duck=2, rabbit=2, goat=2}

    }

    public static Map<String, Integer> showPairAnimals(ArrayList<String> list) {
        Map<String, Integer> map = new HashMap<>();
        if (list.size() == 1 || list.size() == 0) {
            return map;
        }
        for (String each : list) {
            if (map.containsKey(each)) {
                map.put(each, 2);
            } else {
                map.put(each, 1);
            }
        }

      map.entrySet().removeIf(entry->entry.getValue()==1);
        return map;

    }
    public static Map<String, Integer> showPairAnimalsWithTwoPointers(ArrayList<String> list) {
        Map<String, Integer> map = new HashMap<>();
        int left = 0;
        int right = list.size() - 1;

        if (list.size() == 1 || list.size() == 0) {
            return map;
        }
        while (left < right) {
            if (!(list.get(left).equals(list.get(right)))) {
                right--;

            }
            if (list.get(left).equals(list.get(right))) {
                map.put(list.get(left), 2);
                left++;
                right = list.size() - 1;
            }

        }

        return map;
    }


}
/*
A great flood has hit the land, and just as in Biblical times we need to get the animals to the ark in pairs. We
are only interested in getting one pair of each animal, and not interested in any animals where there are
less than 2. They need to mate to repopulate the planet after all!
Write a function that takes a list of animals as a parameter, which you need to check to see which animals
there are at least two of, and then return a Map<String, Integer> that contains the name of the animal
along with the fact that there are 2 of them to bring onto the ark.
Examples:
Input: []
Output: {}
Input: ['goat']
Output: {}
Input : ["dog", "goat", "dog"]
Output: {dog=2}
Input : ["dog", "cat", "dog", "cat", "beaver", "cat"]
Output: {cat=2, dog=2}
Input: ["goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan"]
Output: {horse=2, rabbit=2, goat=2}
 */