// Last updated: 05/08/2026, 22:26:00
1class Solution {
2    public int maximumDifference(int[] nums) {
3        int n = nums.length;
4        int max = -1;
5        int current = nums[0];
6        for(int i = 1;i < n;i++){
7            if(current < nums[i]){
8                int ans = nums[i] - current;
9                max = Math.max(max,ans);
10            }else{
11                current = nums[i];
12            }
13        }
14        return max;
15    }
16}