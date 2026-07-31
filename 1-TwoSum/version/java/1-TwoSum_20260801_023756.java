// Last updated: 01/08/2026, 02:37:56
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int[] twoSum(int[] nums, int target) {
6        Map<Integer, Integer> numMap = new HashMap<>();
7        int n = nums.length;
8
9        for (int i = 0; i < n; i++) {
10            int complement = target - nums[i];
11            if (numMap.containsKey(complement)) {
12                return new int[]{numMap.get(complement), i};
13            }
14            numMap.put(nums[i], i);
15        }
16
17        return new int[]{}; // Not reachable
18    }
19}