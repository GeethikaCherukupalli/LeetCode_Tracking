// Last updated: 03/08/2026, 01:52:46
1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        StringBuilder sb = new StringBuilder();
4        int length = Math.min(word1.length(),word2.length());
5        
6
7        for(int i = 0; i < length;i++){
8            sb.append(word1.charAt(i));
9            sb.append(word2.charAt(i));
10        }
11        
12        if(word1.length() < word2.length()){
13            sb.append(word2.substring(word1.length(),word2.length()));
14        }else{
15            sb.append(word1.substring(word2.length(),word1.length()));
16        }
17        return sb.toString();
18    }
19}