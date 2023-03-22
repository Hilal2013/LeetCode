package easy;

public class BesTimeBuyAndSell {

    public static void main(String[] args) {

      // int[] prices = {7,6,4,3,1};//0
       // int[] prices = {2,4,1};//2
        int[] prices = {7,1, 5, 3, 6, 4};//5
        //int[] prices = { 3,2,6,5,0,3};//not working//3 it should be 4

        System.out.println(maxProfit(prices));

    }


    public static int maxProfit(int[] prices) {
  //im gonna find min  and then Im gonna find max after minIndex

        int min=prices[0];
        int minIndex=0;
        int max=-1;

        if (prices[0] < prices[1]) {//for example 2,4,1
            for (int i = 1; i < prices.length; i++) {

                min=prices[0];
                if (prices[i]>max) {
                    max=prices[i];
                }

            }

        }else{
            for (int i = 0; i < prices.length; i++) { //7, 1, 5, 3, 6, 4
                if(prices[i]< min){
                    min=  prices[i];//1
                    minIndex=i;//1

                }
            }
            max=prices[minIndex];
            for (int i = minIndex+1; i <prices.length ; i++) {
                if (prices[i]>max) {
                    max=prices[i];//6
                }
            }


        }
        return max-min;

    }
    public static int maxProfitWithTwoPoints(int[] prices) {

        int first = 0;
        int second = first + 1;
        int maxProfit = Integer.MIN_VALUE;
        while (first < second ) {  //7, 1, 5, 3, 6, 4

            if (prices[first] > prices[second]) {
                second++;

                if (second == prices.length - 1) {
                    first++;
                    second = first + 1;
                }

            } else if (prices[first] < prices[second]) {
                if (prices[second] - prices[first] > maxProfit) {
                    maxProfit = prices[second] - prices[first];
                    second++;
                    if (second == prices.length - 1) {
                        first++;
                        second = first + 1;
                    }

                }else{second++;
                    if (second == prices.length - 1) {
                        first++;
                        second = first + 1;
                    }}

            } else if (second == prices.length - 1) {
                first++;
                second = first + 1;
                break;
            }
        }
        return maxProfit;
    }

}
/*
 Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in
the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Example 1:
Input: prices = [7,1,5,3,6,4] Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:
Input: prices = [7,6,4,3,1] Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
Constraints:
 1 <= prices.length <= 105
 0 <= prices[i] <= 104

 while(left!=prices.length-1){

           if (prices[left] >= prices[right]&&right<=prices.length-1) {
               right++;
           } else if (prices[left] < prices[right] && right<=prices.length-1) {
               if (maxProfit > prices[right] - prices[left]) {
                   maxProfit = prices[right] - prices[left];

                   return maxProfit;
               }
               right++;

           }else if(right<=prices.length-1){
               left++;
           }


       }

 while (left < right) {
            if (prices[left] >= prices[right]) {
                left++;
            } else if (prices[left] < prices[right]) {
                if (maxProfit > prices[right] - prices[left]) {
                    maxProfit = prices[right] - prices[left];


                    return maxProfit;
                }

                right--;
            }


        }

 for (int i = 0; i < prices.length; i++) {
            if (prices[left] >= prices[right]) {
                right++;
            } else if (prices[left] < prices[right]) {
                if (maxProfit > prices[right] - prices[left]) {
                    maxProfit = prices[right] - prices[left];

                    return maxProfit;
                }
                right++;

            }else{
                left++;
            }


        }

       if (prices[0] < prices[1] && prices.length>1) {//for example 2,4,1
            for (int i = 1; i < prices.length; i++) {

                min=prices[0];
                if (prices[i]>max) {
                    max=prices[i];
                }

            }

        }else{
            for (int i = 0; i < prices.length; i++) { //7, 1, 5, 3, 6, 4
                if(prices[i]< min){
                    min=  prices[i];//1
                    minIndex=i;//1

                }
            }
            max=prices[minIndex];
            for (int i = minIndex+1; i <prices.length ; i++) {
                if (prices[i]>max) {
                    max=prices[i];//6
                }
            }


        }
 int min=prices[0];
        int minIndex=0;
        int max=-1;

            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < prices[i+1] ) {
                    min = prices[i];
                    if (prices[i] > max) {
                        max = prices[i];
                    }
                }else{
                    if(prices[i]< min){
                        min=  prices[i];//1
                        minIndex=i;//1
                    }
                }
            }
        max=prices[minIndex];
        for (int i = minIndex+1; i <prices.length ; i++) {
            if (prices[i]>max) {
                max=prices[i];//6
            }
        }
        return max-min;



 */