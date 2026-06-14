// Last updated: 14/06/2026, 23:50:15
1class Solution {
2    public int search(int[] nums, int target) {
3        return rec_search(nums,target,0,nums.length-1);
4    }
5    //Using recursions
6    static int rec_search(int[] arr,int target,int start,int end){
7        if(start > end){
8            return -1;
9        }
10
11        int mid = start + (end - start)/2;
12        if(arr[mid] == target){
13            return mid;
14        }
15
16        if(arr[mid] >= arr[start]){
17            if(target >= arr[start] && target <= arr[mid]){
18                return rec_search(arr,target,start,mid - 1);
19            }else{
20                return rec_search(arr,target,mid+1,end);
21            }
22        }
23
24        if(target >= arr[mid] && target <= arr[end]){
25            return rec_search(arr,target,mid+1,end);
26        }
27
28        return rec_search(arr,target,start,end-1);
29    }
30}