// Last updated: 03/08/2026, 00:04:50
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int n = nums.length;
4        int[] P = new int[2 * n + 1];
5        
6        for (int i = 0; i < 2 * n; i++) {
7            P[i + 1] = P[i] + nums[i % n];
8        }
9        
10        int maxSum = nums[0];
11        Deque<Integer> deque = new ArrayDeque<>();
12        deque.offerLast(0);
13        
14        for (int i = 1; i <= 2 * n; i++) {
15            if (!deque.isEmpty() && i - deque.peekFirst() > n) {
16                deque.pollFirst();
17            }
18            
19            maxSum = Math.max(maxSum, P[i] - P[deque.peekFirst()]);
20            
21            while (!deque.isEmpty() && P[deque.peekLast()] >= P[i]) {
22                deque.pollLast();
23            }
24            
25            deque.offerLast(i);
26        }
27        
28        return maxSum;
29    }
30}