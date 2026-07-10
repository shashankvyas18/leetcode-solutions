// Last updated: 09/07/2026, 22:48:34
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3
4        if(numbers.length==2) return new int[]{1,2};
5
6        int left = 0;
7        int right = numbers.length-1;
8
9        
10        while(numbers[right]+numbers[left]!=target){
11            if(numbers[right]+numbers[left]>target){
12                right --;        
13            }  
14            else{
15                left ++;           
16            }          
17        }
18        return new int[]{left+1,right+1};
19    }
20}