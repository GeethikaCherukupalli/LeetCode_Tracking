// Last updated: 06/08/2026, 00:24:17
1class Solution {
2    public int maxOperations(int[] nums, int k) {
3        Arrays.sort(nums);
4        int left = 0;
5        int right = nums.length -1;
6        int count = 0;
7        
8        while(left < right){
9            if(nums[left] + nums[right] == k){
10                count += 1;
11                left += 1;
12                right -= 1;
13            }else if(nums[left] + nums[right] < k){
14                left++;
15            }else{
16                right--;
17            }
18        }
19        return count;
20    }
21}