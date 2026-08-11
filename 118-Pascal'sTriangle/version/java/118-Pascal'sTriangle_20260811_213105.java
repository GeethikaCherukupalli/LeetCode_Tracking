// Last updated: 11/08/2026, 21:31:05
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> result = new ArrayList<>();
4        if (numRows == 0) {
5            return result;
6        }
7
8        List<Integer> firstRow = new ArrayList<>();
9        firstRow.add(1);
10        result.add(firstRow);
11
12        for (int i = 1; i < numRows; i++) {
13            List<Integer> prevRow = result.get(i - 1);
14            List<Integer> currentRow = new ArrayList<>();
15            currentRow.add(1);
16
17            for (int j = 1; j < i; j++) {
18                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
19            }
20
21            currentRow.add(1);
22            result.add(currentRow);
23        }
24
25        return result;
26    }
27}