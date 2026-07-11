// Last updated: 10/07/2026, 20:31:54
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        
4        if(numbers.length<=2) return new int[]{1,2};
5
6        int left = 0;
7        int right = numbers.length - 1;
8
9        while(numbers[left]+numbers[right]!=target){
10
11            if(numbers[right]+numbers[left] > target){
12                right--;
13            }
14            else if(numbers[right]+numbers[left] < target)
15            {
16                left++;
17            }                         
18            
19        }
20        return new int[]{left+1,right+1}; 
21    }
22}