// Last updated: 03/08/2026, 00:00:54
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int totalSum = 0;
4        
5        int maxLinearSum = nums[0];
6        int currentMax = 0;
7    
8        int minLinearSum = nums[0];
9        int currentMin = 0;
10        
11        for (int num : nums) {
12            totalSum += num;
13            
14            currentMax = Math.max(num, currentMax + num);
15            maxLinearSum = Math.max(maxLinearSum, currentMax);
16            
17            currentMin = Math.min(num, currentMin + num);
18            minLinearSum = Math.min(minLinearSum, currentMin);
19        }
20        
21        if (maxLinearSum < 0) {
22            return maxLinearSum;
23        }
24        
25        return Math.max(maxLinearSum, totalSum - minLinearSum);
26    }
27}