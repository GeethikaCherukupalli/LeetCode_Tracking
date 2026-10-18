// Last updated: 18/10/2026, 23:49:22
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        StringBuilder sb = new StringBuilder();
4        Arrays.sort(strs);
5        String first = strs[0];
6        String last = strs[strs.length - 1];
7
8        for (int i = 0; i < Math.min(first.length(), last.length()); i++)
9        {
10            if ( first.charAt(i) != last.charAt(i))
11            {
12                return sb.toString();
13            }
14            sb.append(first.charAt(i));
15        }
16        return sb.toString();
17    }
18}