// Last updated: 04/08/2026, 23:55:05
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int n = nums.length;
4        int[] temp = new int[n];
5        int tempIndex = 0;
6
7        for (int i = 0; i < n; i++) {
8            if (nums[i] != 0) {
9                temp[tempIndex] = nums[i];
10                tempIndex++;
11            }
12        }
13
14        for (int i = 0; i < n; i++) {
15            nums[i] = temp[i];
16        }
17    }
18}