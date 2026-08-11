// Last updated: 11/08/2026, 21:32:12
1class Solution {
2    public List<Integer> pascal(int n) {
3        int ans=1;
4        List<Integer>ansr=new ArrayList<>();
5        ansr.add(1);
6        
7        for(int col=1;col<n;col++){
8            ans=ans*(n-col);
9            ans/=col;
10            ansr.add(ans);
11        }
12      return ansr;
13    }
14
15    public List<List<Integer>> generate(int numRows){
16        List<List<Integer>>ans =new ArrayList<>();
17        for(int i=1;i<=numRows;i++){
18            ans.add(pascal(i));
19        }
20    return ans;
21    }
22}