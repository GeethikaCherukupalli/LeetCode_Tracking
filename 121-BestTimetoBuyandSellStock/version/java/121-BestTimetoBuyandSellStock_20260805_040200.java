// Last updated: 05/08/2026, 04:02:00
1class Solution {
2    public int maximumDifference(int[] nums) {
3        int n = nums.length;
4        int max = -1;
5        for(int i = 0; i < n;i++){
6            for(int j = n-1; j >=0; j--){
7                if(0 <= i && i < j && j < n && nums[i] < nums[j]){
8                    int ans = nums[j] - nums[i];
9                    max = Math.max(max,ans);
10                }
11            }
12        }
13        return max;
14    }
15}