// Last updated: 16/08/2026, 20:24:43
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        ArrayList<Integer> currentPath = new ArrayList<>();
4        return sub(nums, 0, currentPath);
5    }
6
7    public static List<List<Integer>> sub(int[] nums, int idx, ArrayList<Integer> list) {
8        if (idx == nums.length) {
9            List<List<Integer>> baseResult = new ArrayList<>();
10            baseResult.add(new ArrayList<>(list)); 
11            return baseResult;
12        }
13
14        list.add(nums[idx]);
15        List<List<Integer>> left = sub(nums, idx + 1, list);
16        list.remove(list.size() - 1);
17        List<List<Integer>> right = sub(nums, idx + 1, list);
18        left.addAll(right);
19        return left;
20    }
21}
22