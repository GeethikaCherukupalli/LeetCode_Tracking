// Last updated: 05/08/2026, 00:03:59
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int n = nums.length;
4        int left = 0;
5        int right = 0;
6
7        for (int i = 0; i < n; i++) {
8            if(nums[i] == 0){
9                right++;    
10            }else{
11                swap(nums,right,left);
12                right++;
13                left++;
14            }
15        }
16    }
17
18    public static void swap(int[] nums,int i,int j){
19        int temp = nums[i];
20        nums[i] = nums[j];
21        nums[j] = temp;
22    }
23}