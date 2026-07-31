// Last updated: 01/08/2026, 05:17:24
1 class Solution {
2    int first = -1;
3    int second = -1;
4
5    public int secondHighest(String s) {
6        int left = 0;
7        int right = s.length() - 1;
8
9        while (left <= right) {
10             
11            updateMax(s.charAt(left));
12 
13            if (left < right) {
14                updateMax(s.charAt(right));
15            }
16            
17            left++;
18            right--;
19        }
20        return second;
21    }
22  private void updateMax(char c) {
23        if (Character.isDigit(c)) {
24            int d = c - '0';
25            if (d > first) {
26                second = first;
27                first = d;
28            } else if (d < first && d > second) {
29                second = d;
30            }
31        }
32    }
33}
34