// Last updated: 18/10/2026, 05:13:55
1class Solution {
2    public int romanToInt(String s) {
3        return roman(s);
4    }
5
6    public static int roman(String s)
7    {
8        int value = 0;
9        int prevValue = 0;
10
11        for (int i = s.length() - 1; i >= 0; i--)
12        {
13            int currentValue = switch(s.charAt(i))
14            {
15                case 'I' -> 1;
16                case 'V' -> 5;
17                case 'X' -> 10;
18                case 'L' -> 50;
19                case 'C' -> 100;
20                case 'D' -> 500;
21                case 'M' -> 1000;
22                default  -> 0;
23            };
24
25            if (currentValue < prevValue)
26            {
27                value -= currentValue;
28            }
29            else
30            {
31                value += currentValue;
32            }
33            prevValue = currentValue;
34        }
35        return value;
36    }
37}