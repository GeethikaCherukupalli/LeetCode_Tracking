// Last updated: 18/10/2026, 22:41:53
1class Solution {
2    public int addDigits(int num) {
3        while (num >= 10)
4        {
5            int sum = 0;
6            while (num != 0)
7            {
8                sum = sum + num%10;
9                num /= 10;
10            }
11            num = sum;
12        }
13        return num;
14   }
15}