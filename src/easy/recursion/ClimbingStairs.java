package easy.recursion;

import java.util.HashMap;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n=7;
        System.out.println(climbStairs(n));
        System.out.println(iteration(n));
        System.out.println(climbStairsArray(7));
        System.out.println(climbStairsMap(7));
    }
    public static  long  iteration(int n){

        if(n<=2){
            return n;
        }
        int n1=1,n2=2,result=0;
        for (int i = 3; i <=n ; i++) {
            result=n1+n2;//3//2+3=5
            n1=n2; //n1>2//3
            n2=result; //n2>3

        }

        return result;

    }
    public static int climbStairsArray(int n) {
        //   if(n==1||n==2) return n;
        int[] arr=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        arr[2]=2;
        for (int i = 3; i <= n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
            //arr[7]=arr[7-1]+arr[7-2]=13+8=21
        }
        return  arr[n];
    }

    public static int climbStairs(int n) {//n=45 time limit exceeded
        // 1-2-3-5-8-13-21....=> it is fibonacci numbers:))
//fib(n)=fib(n-1)+fib(n-2);
        if(n==0)
            return 1;
        if(n==1)
            return 1;
        return climbStairs(n-1) +climbStairs( n-2);
    }
    public static int climbStairsMap(int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        //key=n value= how many ways to climb
        map.put(1,1);
        map.put(2,2);
        return climb(map,n);

    }
    public static int climb(HashMap<Integer,Integer> map,int n){
        if(map.containsKey(n)) //checking if n is already present
            return map.get(n);
        else // add it to the HashMap
            map.put(n,(climb(map,n-1)+climb(map,n-2)));
        return map.get(n);

    }

}
/*
Simba has a number of staircases in his house, and he likes to climb each staircase 1 or 2 steps at a time.
It takes n steps to reach the top. In how many distinct ways can he climb to the top?
Example 1:
Input: n = 2 Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:
Input: n = 3 Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
Constraints:
• 1 <= n <= 45
Follow-up: What if he climbs each staircase 1, 2 or 3 steps at a time?

 */