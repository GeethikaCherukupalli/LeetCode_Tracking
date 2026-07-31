// Last updated: 01/08/2026, 03:23:13
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
25        for (int i = 0; i < arr.length; i++) {
26
27            int complement = target - arr[i].value;
28
29            int index = binarySearch(arr, complement, i + 1);
30
31            if (index != -1) {
32                return new int[]{
33                        arr[i].index,
34                        arr[index].index
35                };
36            }
37        }
38
39        return new int[]{};
40    }
41
42    private int binarySearch(Pair[] arr, int target, int start) {
43
44        int left = start;
45        int right = arr.length - 1;
46
47        while (left <= right) {
48
49            int mid = left + (right - left) / 2;
50
51            if (arr[mid].value == target)
52                return mid;
53
54            if (arr[mid].value < target)
55                left = mid + 1;
56            else
57                right = mid - 1;
58        }
59
60        return -1;
61    }
62}