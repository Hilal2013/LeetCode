package easy.hilal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MostFrequentIp {

    public static void main(String[] args) {
        String[] logs=new String[]{"10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20",
                "10.0.0.3 - GET 2020-08-24","10.0.0.3 - GET 2020-08-24","10.0.0.3 - GET 2020-08-24","10.0.0.4 - GET 2020-08-24"};

   getMostFrequentIp(logs);

    }
    public static void getMostFrequentIp(String[] logs)
    {
        HashMap<String, Integer> map = new HashMap<>();

        for(String log :logs){
            String[] arr=log.split(" ");
            map.put(arr[0],map.getOrDefault(arr[0],0)+1);
        }

        List<String> mostFrequent = new ArrayList<>();
        int maxFreq = 0;

        for(String ip : map.keySet()){
            maxFreq = Math.max(maxFreq, map.get(ip));
            if(map.get(ip) == maxFreq) mostFrequent.add(ip);
        }
        System.out.println(maxFreq);

        System.out.println(mostFrequent);



    }


}
