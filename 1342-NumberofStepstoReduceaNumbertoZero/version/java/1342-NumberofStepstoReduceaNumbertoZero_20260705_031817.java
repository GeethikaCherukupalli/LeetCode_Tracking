// Last updated: 05/07/2026, 03:18:17
1class Solution {
2    public int countOperations(int num1, int num2) {
3        int count = 0;
4        while (num1 > 0 && num2 > 0) {
5            count += num1 / num2;
6            num1 %= num2;
7            //swap
8            int temp = num1;
9            num1 = num2;
10            num2 = temp;
11        }
12        return count;
13    }
14}