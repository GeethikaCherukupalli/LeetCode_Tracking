// Last updated: 02/08/2026, 23:56:49
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int globMax = nums[0];
4        int globMin = nums[0];
5        
6        int curMax = 0;
7        int curMin = 0;
8        int total = 0;
9        
10        for (int n : nums) {
11            curMax = Math.max(curMax + n, n);
12            curMin = Math.min(curMin + n, n);
13            total += n;
14            globMax = Math.max(globMax, curMax);
15            globMin = Math.min(globMin, curMin);
16        }
17    
18        return globMax > 0 ? Math.max(globMax, total - globMin) : globMax;
19    }
20}