// Last updated: 17/08/2026, 02:27:35
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>(); 
4        boolean[] used = new boolean[nums.length]; 
5        
6        perm(nums, new ArrayList<>(), used, result); 
7        return result; 
8    }
9
10    public static void perm(int[] nums, List<Integer> list, boolean[] used, List<List<Integer>> result){
11        if(list.size() == nums.length){
12            result.add(new ArrayList<>(list)); 
13            return;
14        }
15
16        for(int i = 0; i< nums.length;i++){
17            if(used[i]) continue;
18
19            used[i] = true;
20            list.add(nums[i]);
21
22            perm(nums,list,used,result);
23
24            list.remove(list.size() - 1); 
25            used[i] = false; 
26        }
27    }
28}