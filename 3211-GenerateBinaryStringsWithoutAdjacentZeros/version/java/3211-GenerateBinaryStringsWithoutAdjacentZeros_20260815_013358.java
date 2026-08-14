// Last updated: 15/08/2026, 01:33:58
1class Solution {
2    public List<String> validStrings(int n) {
3        List<String> list = new ArrayList<>();
4        helper(n,"",1,list);
5        return list;
6    
7    }
8
9    public static void helper(int n,String str,int lastPlace,List<String> list){
10        if(n == 0){
11            list.add(str);
12            return;
13        }
14
15        helper(n-1,str+"1",1,list);
16        if(lastPlace == 1){
17            helper(n-1,str+"0",0,list);
18        }
19    }
20}