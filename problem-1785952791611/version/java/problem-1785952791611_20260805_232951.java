// Last updated: 05/08/2026, 23:29:51
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        if(nums.length == 0) return 0;
4        Arrays.sort(nums);
5        int last = Integer.MIN_VALUE;
6        int count = 0;
7        int large = 1;
8
9        for(int i = 0;i < nums.length;i++){
10            if(nums[i] - 1 == last){
11                count += 1;
12                last = nums[i];
13            }else if(nums[i] != last){
14                count = 1;
15                last = nums[i];
16            }
17            large = Math.max(large,count);
18        }
19       return large;
20    }
21}