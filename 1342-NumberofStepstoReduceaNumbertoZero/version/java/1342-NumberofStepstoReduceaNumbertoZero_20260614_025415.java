// Last updated: 14/06/2026, 02:54:15
1class Solution {
2    static int c = 0;
3    public int numberOfSteps(int num) {
4        return helper(num,c);
5    }
6    static int helper(int num,int c){
7        //Base Condition
8        if(num == 0){
9            return c;
10        }
11        
12        if(num % 2 == 0){
13            return helper(num/2,c+1);
14        }else{
15            return helper(num-1,c+1);
16        }
17    }
18}