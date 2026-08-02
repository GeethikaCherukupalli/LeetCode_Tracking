// Last updated: 03/08/2026, 01:05:25
1class Solution {
2    public boolean isPalindrome(int x) {
3        if( x < 0) return false;
4
5        int original = x;
6        int lastDigit = x % 10;
7        int newNum = 0;
8
9        while( x > 0){
10            newNum = newNum * 10 + lastDigit;
11            x /= 10;
12            lastDigit = x % 10;
13        }
14        return newNum == original;
15    }
16}