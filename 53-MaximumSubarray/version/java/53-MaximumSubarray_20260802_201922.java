// Last updated: 02/08/2026, 20:19:22
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int currentSum = nums[0], count = nums[0];
4
5        for(int i = 1;i < nums.length;i++){
6            if(currentSum + nums[i] > nums[i]){
7                currentSum += nums[i];
8            }else{
9                currentSum = nums[i];
10            }
11            count = Math.max(currentSum,count);
12        }
13        return count;
14    }
15}