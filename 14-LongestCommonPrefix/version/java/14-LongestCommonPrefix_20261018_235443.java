// Last updated: 18/10/2026, 23:54:43
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        String prefix = strs[0];
4
5        for (int i = 1; i < strs.length; i++)
6        {
7            while (!strs[i].startsWith(prefix))
8            {
9                prefix = prefix.substring(0,prefix.length() - 1);
10                if (prefix.isEmpty())
11                {
12                    return "";
13                }
14            }
15        }
16        return prefix;
17    }
18}