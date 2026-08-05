// Last updated: 05/08/2026, 23:00:36
1class Solution {
2    public int maxProfit(int[] prices) {
3        int i  = 0;
4        int minVal = prices[0];
5        int maxProfit = 0;
6
7        while(i < prices.length){
8            maxProfit = Math.max(maxProfit,prices[i] - minVal);
9            i++;
10            minVal = Math.min(minVal,prices[i - 1]);
11        }
12        return maxProfit;
13    }
14}