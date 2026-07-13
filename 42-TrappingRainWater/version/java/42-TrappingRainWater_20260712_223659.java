// Last updated: 12/07/2026, 22:36:59
1class Solution {
2    public int trap(int[] height) {
3        
4        if(height.length <3) return 0;
5        int leftMax=0;
6        int rightMax=0;
7
8        int left=0;
9        int right=height.length-1;
10
11        int ans=0;
12
13        while(left<right){
14            rightMax = Math.max(rightMax,height[right]);
15
16            leftMax = Math.max(leftMax,height[left]);
17
18            ans+=rightMax<leftMax?rightMax-height[right--]:leftMax-height[left++];
19        }
20
21        return ans;
22
23    }
24}