// Last updated: 17/06/2026, 00:41:22
1class Solution {
2    public int search(int[] nums, int target) {
3        int start = 0;
4        int end = nums.length - 1;
5
6        while(start <= end){
7            int mid = start + (end - start)/2;
8
9            if(nums[mid] == target){
10                return mid;
11            }
12
13            if(nums[mid] < target){
14                start = mid + 1;
15            }else{
16                end = mid - 1;
17            }
18        }
19        return -1;
20    }
21}