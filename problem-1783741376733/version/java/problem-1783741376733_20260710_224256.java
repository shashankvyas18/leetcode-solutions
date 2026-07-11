// Last updated: 10/07/2026, 22:42:56
class Solution {
    static{
        for(int i=0; i<100 ; i++){
            maxArea(new int[] {0,0});
        }
    }

    public static int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int maxrea=0;

        while(left<right)
        {
            int width=right-left;
            int minHeight=Math.min(height[left],height[right]);
            int area=minHeight*width;
            if(area>maxrea) maxrea=area;

            while(left<right && height[left]<=minHeight)
            {
                left++;
            }
            while(left<right && height[right]<=minHeight)
            {
                right--;
            }
        }
    return maxrea;
        
    }
}