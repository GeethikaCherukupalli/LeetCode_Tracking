// Last updated: 05/07/2026, 03:15:55
1class Solution {
2    static int count = 0;
3    public int countOperations(int num1, int num2) {
4        if(num1 == 0 || num2 == 0){
5            return 0;
6        }
7
8        if(num1 == num2){
9            return 1;
10        }
11
12       return helper(num1,num2,count);
13    }
14
15    public static int helper(int n1,int n2,int count){
16
17        if(n1 == 0 || n2 == 0){
18            return count;
19        }
20        
21        if(n1 >= n2){
22            return helper(n1-n2,n2,count + 1);
23        }else{
24            return helper(n1,n2-n1,count + 1);
25        }
26    }
27}