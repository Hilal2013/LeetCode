package easy;

public class ClimbingStairs {
    public static void main(String[] args) {
      int n=3;


        System.out.println(climbStairs(n));
    }


    public static int climbStairs(int n) {
//
// 1-2-3-5-8-13-21....=> it is fibonacci numbers:))
//fib(n)=fib(n-1)+fib(n-2);
        if (n <= 1) return 1;//terminate
        else
        return climbStairs(n-1)+climbStairs(n-2);
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