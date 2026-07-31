// Last updated: 31/07/2026, 08:01:50
1class Solution {
2    public int climbStairs(int n) {
3        if(n <= 2){
4            return n;
5        }
6
7        int[] dp = new int[n];
8        dp[0] = 1;
9        dp[1] = 2;
10
11        for(int i = 2;i < n;i++){
12            dp[i] = dp[i-1] + dp[i-2];
13        }
14        return dp[n - 1];
15    }
16}