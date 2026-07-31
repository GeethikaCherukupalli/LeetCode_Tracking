// Last updated: 01/08/2026, 05:06:21
1class Solution {
2    public int secondHighest(String s) {
3        int second = -1; 
4        int largest = -1;
5        
6        for(int i = 0;i < s.length();i++){
7             if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
8                int digit = s.charAt(i) - '0';
9                
10                 if(digit > largest){
11                    second = largest;
12                    largest = digit;
13                }else if(digit < largest && digit > second){
14                    second = digit;
15                } 
16            }
17        }
18        return second;
19    }
20}