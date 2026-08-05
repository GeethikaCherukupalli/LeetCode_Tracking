// Last updated: 05/08/2026, 23:04:00
1class Solution {
2    public int maxProfit(int[] prices) {
3        int buyPrice = Integer.MAX_VALUE;
4        int maxProfit = 0;
5
6        for(int i = 0;i<prices.length;i++){
7            if(buyPrice < prices[i]){
8                int profit = prices[i] - buyPrice;
9                maxProfit = Math.max(maxProfit,profit);
10            }else{
11                buyPrice = prices[i];
12            }
13        }
14        return maxProfit;
15    }
16}