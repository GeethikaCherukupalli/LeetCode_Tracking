// Last updated: 31/07/2026, 07:38:43
1class Solution {
2    public int lengthOfLastWord(String s) {
3        String[] tokens = s.split(" ");
4        String lastToken = tokens[tokens.length - 1];
5
6        return lastToken.length();
7    }
8}