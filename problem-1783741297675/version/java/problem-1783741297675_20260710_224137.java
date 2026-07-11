// Last updated: 10/07/2026, 22:41:37
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
14            int area = curr_width*curr_height;
15            max_water = Math.max(area,max_water);
16
17            if(height[left]<height[right]){
18                left++;
19            }
20            else{
21                right--;
22            }
23        }
24
25        return max_water;
26    }
27}