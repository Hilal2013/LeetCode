package easy.hilal;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};

        System.out.println(kidsWithCandies(candies,3));
    }


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
               int max =-1;

        for (int candy : candies) {
            max=Math.max(max,candy);
        }
        for (int candy : candies) {
            if(candy+extraCandies>=max) result.add(true);
            else result.add(false);
        }
return result;
    }
}
