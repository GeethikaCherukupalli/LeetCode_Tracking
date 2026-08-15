// Last updated: 15/08/2026, 21:23:11
1import java.util.AbstractList; 
2class Solution {
3    private List<String> list;
4    public List<String> validStrings(int n) {
5        return new AbstractList<String>(){
6            @Override
7            public int size(){
8                init();
9                return list.size();
10            }
11            @Override
12            public String get(int i){
13                init();
14                return list.get(i);
15            }
16            private void init(){
17                if (list != null) return;
18                list = new ArrayList<>();
19                generator(n, "");
20            }
21        };
22    
23    }
24    private void generator(int n, String s){
25        if (s.length() == n){
26            list.add(s);
27            return;
28        }
29        generator(n, s+"1");
30        if (s.length() != 0 && s.charAt(s.length()-1) != '0') generator(n, s + "0");
31        if (s.length() == 0) generator(n, s+"0");
32    }
33}