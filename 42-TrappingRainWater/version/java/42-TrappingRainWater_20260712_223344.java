// Last updated: 12/07/2026, 22:33:44
1class Solution {
2    public int trap(int[] height) {
3        
4        if(height.length <3) return 0;
5        int left[] = new int[height.length];
6        int right[] = new int[height.length];
7
8        left[0] = height[0];
9        right[height.length-1] = height[height.length-1];
10
11        for(int i =1;i<height.length;i++)
12            left[i]=Math.max(left[i-1],height[i]);
13
14        for(int i=height.length-2;i>=0;i--)
15            right[i]=Math.max(right[i+1],height[i]);
16
17        int ans=0;
18        for(int i=0;i<height.length;i++){
19            int hmin = Math.min(left[i],right[i]);
20            int h=hmin-height[i];
21            ans+=h;
22        }
23
24        return ans;
25
26    }
27}