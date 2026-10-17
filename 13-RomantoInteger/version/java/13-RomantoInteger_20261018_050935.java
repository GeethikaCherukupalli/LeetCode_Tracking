// Last updated: 18/10/2026, 05:09:35
1class Solution {
2    public int romanToInt(String s) {
3        return roman(s,s.length());
4    }
5
6    public static int roman(String s,int length)
7    {
8        int i = 1;
9        int value = 0;
10        while (i < length)
11        {
12            char prev = s.charAt(i - 1);
13            char next = s.charAt(i);
14            switch (prev)
15            {
16                case 'I': if (next == 'V')
17                          {
18                            value += 5 - 1;
19                            i++;
20                          }
21                          else if (next == 'X')
22                          {
23                            value += 10 - 1; 
24                            i++;
25                          }
26                          else
27                          {
28                            value += 1;
29                          }
30                break;
31                case 'V': value += 5; 
32                break;
33                case 'X': if (next == 'L')
34                          {
35                            value += 50 - 10;
36                            i++;
37                          }
38                          else if (next == 'C')
39                          {
40                            value += 100 - 10; 
41                            i++;
42                          }
43                          else
44                          {
45                            value += 10;
46                          } 
47                break;
48                case 'L': value += 50; 
49                break;
50                case 'C': if (next == 'D')
51                          {
52                            value += 500 - 100;
53                            i++;
54                          }
55                          else if (next == 'M')
56                          {
57                            value += 1000 - 100; 
58                            i++;
59                          }
60                          else
61                          {
62                            value += 100;
63                          } 
64                break;
65                case 'D': value += 500; 
66                break;
67                case 'M': value += 1000; 
68                break;
69            }
70            i++;
71        }
72        
73        if (i == length) {
74            switch (s.charAt(length - 1)) {
75                case 'I' -> value += 1;
76                case 'V' -> value += 5;
77                case 'X' -> value += 10;
78                case 'L' -> value += 50;
79                case 'C' -> value += 100;
80                case 'D' -> value += 500;
81                case 'M' -> value += 1000;
82            }
83        }
84
85        return value;
86    }
87}