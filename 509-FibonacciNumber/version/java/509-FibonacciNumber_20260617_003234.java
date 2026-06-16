// Last updated: 17/06/2026, 00:32:34
1class Solution {
2    public int fib(int n) {
3        if(n < 2){
4            return n;
5        }
6
7        int f[] = new int[n+1];
8
9        f[0] = 1;
10        f[1] = 1;
11
12        for(int i = 2;i<=n;i++){
13            f[i] = f[i-1] + f[i-2];
14        }
15        return f[n-1];
16    }
17}