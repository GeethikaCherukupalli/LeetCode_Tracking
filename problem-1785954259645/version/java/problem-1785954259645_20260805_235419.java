// Last updated: 05/08/2026, 23:54:19
1class Solution {
2    public void setZeroes(int[][] matrix) {
3       int m = matrix.length;
4        int n = matrix[0].length;
5    
6        boolean[] zeroRows = new boolean[m];
7        boolean[] zeroCols = new boolean[n];
8        
9        for (int i = 0; i < m; i++) {
10            for (int j = 0; j < n; j++) {
11                if (matrix[i][j] == 0) {
12                    zeroRows[i] = true;
13                    zeroCols[j] = true;
14                }
15            }
16        }
17        
18        for (int i = 0; i < m; i++) {
19            for (int j = 0; j < n; j++) {
20                if (zeroRows[i] || zeroCols[j]) {
21                    matrix[i][j] = 0;
22                }
23            }
24        }   
25  
26    }
27}