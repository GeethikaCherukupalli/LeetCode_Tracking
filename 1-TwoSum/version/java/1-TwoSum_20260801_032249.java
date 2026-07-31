// Last updated: 01/08/2026, 03:22:49
1import java.util.Arrays;
2
3class Solution {
4
5    static class Pair {
6        int value;
7        int index;
8
9        Pair(int value, int index) {
10            this.value = value;
11            this.index = index;
12        }
13    }
14
15    public int[] twoSum(int[] nums, int target) {
16
17        Pair[] arr = new Pair[nums.length];
18
19        for (int i = 0; i < nums.length; i++) {
20            arr[i] = new Pair(nums[i], i);
21        }
22
23        Arrays.sort(arr, (a, b) -> a.value - b.value);
24
25        int left = 0;
26        int right = arr.length - 1;
27
28        while (left < right) {
29
30            int sum = arr[left].value + arr[right].value;
31
32            if (sum == target) {
33                return new int[]{
34                        arr[left].index,
35                        arr[right].index
36                };
37            }
38
39            if (sum < target)
40                left++;
41            else
42                right--;
43        }
44
45        return new int[]{};
46    }
47}