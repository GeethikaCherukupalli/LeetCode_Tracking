// Last updated: 18/10/2026, 22:28:33
1class Solution {
2    public int addDigits(int num) {
3        int sum = 0;
4        // If number is a single digit
5        sum = doubleSum(num);
6        return sum;
7   }
8
9   public static int doubleSum(int num)
10   {
11    int sum = 0;
12
13    if (num < 10)
14    {
15        return num;
16    }
17    // Addition
18        while (num != 0)
19        {
20            int last = num % 10;
21            num /= 10;
22            sum += last;
23
24            if (num == 0 && sum > 9)
25            {
26                sum = doubleSum(sum);
27            }
28        }
29    return sum;
30   }
31}