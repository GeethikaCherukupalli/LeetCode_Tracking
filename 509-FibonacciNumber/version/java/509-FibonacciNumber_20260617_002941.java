// Last updated: 17/06/2026, 00:29:41
1class Solution {
2    public int fib(int n) {
3        if(n < 2){
4            return n;
5        }
6        return fib(n-1) + fib(n-2);
7    }
8}