// Last updated: 14/08/2026, 19:33:28
1class Solution {
2    public double myPow(double x, int n) {
3        if(n < 0){
4            return 1/positive(x,n);
5        }else{
6            return positive(x,n);
7        }
8    }
9
10    static double positive(double x,int n){
11        if( n == 0 ){
12            return 1;
13        }
14
15        double halfpower = positive(x,n/2);
16        double halfSq = halfpower * halfpower;
17
18        if(n % 2 != 0){
19            halfSq = x * halfSq;
20        }
21        return halfSq;
22    }
23}