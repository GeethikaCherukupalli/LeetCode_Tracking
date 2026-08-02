// Last updated: 02/08/2026, 20:57:12
1class Solution{
2    public int maxSubArray(int[] nums) {
3        int[] dp = new int[nums.length];
4        dp[0] = nums[0];
5        int max = dp[0];
6        
7        for(int i = 1; i < nums.length; i++){
8            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
9            max = Math.max(max, dp[i]);
10        }
11        
12        return max;
13    }
14}