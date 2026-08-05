// Last updated: 05/08/2026, 22:43:45
1class Solution {
2    public int maximumDifference(int[] nums) {
3        Stack<int[]> stack = new Stack<>(); 
4        int diff = -1;
5
6        for (int i = 0; i < nums.length; i++) {
7            if (stack.isEmpty() || nums[i] < stack.peek()[0]) {
8                stack.push(new int[]{nums[i], i});
9            }
10
11            if (!stack.isEmpty() && stack.peek()[1] < i && nums[i] > stack.peek()[0]) {
12                diff = Math.max(diff, nums[i] - stack.peek()[0]);
13            }
14        }
15
16        return diff;
17    }
18}
19