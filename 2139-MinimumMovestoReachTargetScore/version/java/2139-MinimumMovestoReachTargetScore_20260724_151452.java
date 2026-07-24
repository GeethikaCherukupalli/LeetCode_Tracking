// Last updated: 24/07/2026, 15:14:52
1class Solution {
2    public int minMoves(int target, int maxDoubles) {
3
4        if(maxDoubles == 0){
5            return target - 1;
6        }
7
8        return helper(1,target,maxDoubles,0);
9    }
10    public static int helper(int x ,int target,int maxDoubles,int count){
11
12        if(maxDoubles == 0){
13            return count+target - 1;
14        }
15
16        if(target == 0){
17            return count - 1;
18        }
19
20        if(isEven(target) && maxDoubles != 0){
21            return helper(x,target/2,maxDoubles - 1,count + 1);
22        }else{
23            return helper(x,target - 1,maxDoubles,count + 1);
24        }
25    }
26
27    public static boolean isEven(int x){
28        return (x & 1) == 0;
29    }
30}