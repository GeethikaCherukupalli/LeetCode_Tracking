// Last updated: 01/08/2026, 06:00:40
1class Solution {
2    public void sortColors(int[] nums) {
3      int[] instances = new int[3];
4
5        for(int i = 0;i < nums.length; i++){
6            instances[nums[i]] += 1;
7        }
8        
9        int index = 0;
10
11        for(int value = 0; value <= 2; value++) {
12            for(int j = 0; j < instances[value]; j++) {
13                nums[index] = value;
14                index++;
15        }
16    }
17        
18        for(int i = 0;i<nums.length;i++){
19            System.out.print(nums[i] + " ");
20        }
21    }
22}