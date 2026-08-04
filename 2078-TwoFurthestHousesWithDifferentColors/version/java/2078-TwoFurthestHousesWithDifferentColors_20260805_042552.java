// Last updated: 05/08/2026, 04:25:52
1class Solution {
2    public int maxDistance(int[] colors) {
3          int n = colors.length;
4        int maxDist = 0;
5        
6        for (int i = n - 1; i >= 0; i--) {
7            if (colors[0] != colors[i]) {
8                maxDist = Math.max(maxDist, i);
9                break; 
10            }
11        }
12        
13        for (int i = 0; i < n; i++) {
14            if (colors[n - 1] != colors[i]) {
15                maxDist = Math.max(maxDist, n - 1 - i);
16                break; 
17            }
18        }
19        
20        return maxDist;
21    }
22}