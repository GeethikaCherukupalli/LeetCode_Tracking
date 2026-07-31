// Last updated: 31/07/2026, 07:44:11
1class Solution {
2    public String removeTrailingZeros(String num) {
3        if(num.charAt(num.length()-1) != '0'){
4            return num;
5        }
6        return helper(num);
7    }
8    static String helper(String num){
9        if(num.charAt(num.length()-1) == '0'){
10            return helper(num.substring(0,num.length()-1));
11        }
12        return num;
13    }
14}