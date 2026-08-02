// Last updated: 02/08/2026, 17:30:59
1class Solution {
2    public int majorityElement(int[] nums) {
3        if(nums.length == 0) return 0;
4
5        int temp = getVal(nums);
6        int count = 0;
7
8        for(int i = 0;i < nums.length ;i++){
9            if(nums[i] == temp){
10                count++;
11            }
12        }
13
14        if(count >= nums.length/2){
15            return temp;
16        }
17        return -1;
18    }
19
20    public int getVal(int[] nums){
21        int val = nums[0], count = 1;
22
23        for(int i = 0; i < nums.length ;i++){
24            if(nums[i] == val){
25                count++;
26            }else{
27                count--;
28            }
29
30            if(count == 0){
31                count = 1;
32                val = nums[i];
33            }
34        }
35        return val;
36    }
37}