// Last updated: 02/08/2026, 20:37:58
1class Solution {
2    public int maxSubArray(int[] nums) {
3       int maxSub = nums[0];
4        int curSum = 0;
5
6        for (int n : nums) {
7            if (curSum < 0) {
8                curSum = 0;
9            }
10            curSum += n;
11            maxSub = Math.max(maxSub, curSum);
12        }
13        return maxSub;
14    }
15}