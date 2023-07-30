package easy.hilal;

import java.util.HashMap;
import java.util.Map;

public class HighestAverageScore {
    public static void main(String[] args) {
        String[][] scores = {{"Bob", "87"}, {"Mike", "35"}, {"Bob", "52"}, {"Jason", "35"}, {"Mike", "55"}, {"Jessica", "99"}};
        Map<String, Integer> mapF = new HashMap<>();//name and its frequency
        Map<String, Integer> map = new HashMap<>();//name, sum of scores


        for (int i = 0; i < scores.length; i++) {

            mapF.put(scores[i][0], mapF.getOrDefault(scores[i][0], 0) + 1);
            if (map.containsKey(scores[i][0])) {
                map.put(scores[i][0], Integer.parseInt(scores[i][1]) + map.get(scores[i][0]));
            } else {
                map.put(scores[i][0], Integer.parseInt(scores[i][1]));
            }

        }
        System.out.println(map);
        System.out.println(mapF);
        int maxAve = 0;
        for (String student : map.keySet()) {
            maxAve = Math.max(maxAve, map.get(student) / mapF.get(student));
        }

        System.out.println(maxAve);

    }
}
