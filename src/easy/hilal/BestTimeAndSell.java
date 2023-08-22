package easy.hilal;

public class BestTimeAndSell {
    public static void main(String[] args) {
        // int[] prices = {7,6,4,3,1};//0
        // int[] prices = {2,4,1};//2
         int[] prices = {7,1, 5, 3, 6, 4};//5
      //  int[] prices = {3, 2, 6, 5, 0, 3};//not working//3 it should be 4

        System.out.println(maxProfit(prices));

    }

    private static int maxProfit(int[] prices) {
        int min = prices[0];//
        int profit=0;//max-min// in these profit find maxProfit//but max index number > min index number
        //im gonna find min and than all prices -min
        int maxProfit=0;
        for (int i = 0; i < prices.length-1; i++) {
            min=Math.min(min,prices[i]);

            profit=prices[i]-min;

            maxProfit=Math.max(maxProfit,profit);
        }

        return  maxProfit;

    }
}
