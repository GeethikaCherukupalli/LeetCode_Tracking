// Last updated: 31/07/2026, 08:06:36
1class Solution {
2    public int tribonacci(int n) {
3        int[] F = new int[38];
4        F[0] = 0;
5        F[1] = F[2] = 1;
6
7        for(int i = 3;i <= n;i++){
8            F[i] = F[i - 3] + F[i - 2] + F[i - 1];
9        }
10        return F[n];
11    }
12}