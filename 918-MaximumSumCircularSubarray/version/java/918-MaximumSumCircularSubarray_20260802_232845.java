// Last updated: 02/08/2026, 23:28:45
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        if(nums.length == 0) return 0;
4        int linearSum = linear_subarray(nums);
5
6        int totalSum = 0;
7        for(int i = 0;i < nums.length; i++){
8            totalSum += nums[i];
9            nums[i] *= -1;
10        }
11        int invertedSum = linear_subarray(nums); 
12        if(totalSum + invertedSum == 0) return linearSum;
13
14        return Math.max(linearSum,totalSum+invertedSum);
15    }
16
17    public int linear_subarray(int[] nums){
18         int currentSum = nums[0], count = nums[0];
19
20        for(int i = 1;i < nums.length;i++){
21            if(currentSum + nums[i] > nums[i]){
22                currentSum += nums[i];
23            }else{
24                currentSum = nums[i];
25            }
26            count = Math.max(currentSum,count);
27        }
28        return count;
29    }
30}