// Last updated: 01/08/2026, 05:11:38
1class Solution {
2    public int secondHighest(String s) {
3        int count = 1;
4        for (char c = '9'; c >= '0'; c--) {
5            if (s.indexOf(c) != -1) {
6                if (count-- <= 0) {
7                    return c - '0';
8                }
9            }
10        }
11        return -1;
12    }
13}