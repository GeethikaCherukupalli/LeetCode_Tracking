// Last updated: 01/08/2026, 05:45:43
1class Solution {
2    public void sortColors(int[] nums) {
3        int i = 0, j = 0, k = nums.length - 1;
4
5        while( i <= k){
6            if(nums[i] == 0){
7                swap(nums , i , j);
8                i++;
9                j++;
10            }else if(nums[i] == 2){
11                swap(nums , i , k);
12                k--;
13            }else{
14                i++;
15            }
16        }
17    }
18
19    public static void swap(int[] arr,int i,int j){
20        int temp = arr[i];
21        arr[i] = arr[j];
22        arr[j] = temp;
23    }
24}