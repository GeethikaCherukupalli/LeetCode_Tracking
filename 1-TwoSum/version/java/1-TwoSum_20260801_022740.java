// Last updated: 01/08/2026, 02:27:40
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int n = nums.length;
4        int[] ans = new int[2];
5        for(int i = 0;i < n;i++){
6            for(int j = 1;j < n;j++){
7                if(i != j && nums[i] + nums[j] == target){
8                    ans[0] = i;
9                    ans[1] = j;
10                }
11            }
12        }
13        return ans;
14    }
15}