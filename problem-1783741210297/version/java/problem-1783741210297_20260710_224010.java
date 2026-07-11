// Last updated: 10/07/2026, 22:40:10
1class Solution {
2    public int maxArea(int[] height) {
3        
4        int left = 0;
5        int right=height.length-1;
6
7        int max_water = 0;
8
9        while(left<right){
10
11            int curr_height = Math.min(height[left],height[right]);
12            int curr_width = right-left;
13
14            max_water = Math.max(curr_width*curr_height,max_water);
15
16            if(height[left]<height[right]){
17                left++;
18            }
19            else{
20                right--;
21            }
22        }
23
24        return max_water;
25    }
26}