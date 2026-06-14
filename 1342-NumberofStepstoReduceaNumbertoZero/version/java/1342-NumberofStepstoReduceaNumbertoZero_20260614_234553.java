// Last updated: 14/06/2026, 23:45:53
1class Solution {
2    public int search(int[] nums, int target) {
3     int start = 0;
4     int end = nums.length - 1;
5
6     while(start <= end ){
7        int mid = start + (end - start)/2;
8
9        if(nums[mid] == target){
10            return  mid;
11        }
12
13        if(nums[mid] >= nums[start]){
14            if(target >= nums[start] && target < nums[mid]){
15                end = mid - 1;
16            }else{
17                start = mid + 1;
18            }
19        }else{
20            if(target > nums[mid] && target <= nums[end]){
21                start = mid + 1;
22            }else{
23                end = mid - 1;
24            }
25        }        
26     }  
27     return -1;
28    }
29}