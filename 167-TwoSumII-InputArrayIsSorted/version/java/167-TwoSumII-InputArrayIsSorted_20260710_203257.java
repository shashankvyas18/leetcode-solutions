// Last updated: 10/07/2026, 20:32:57
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        
4        if(numbers.length<=2) return new int[]{1,2};
5
6        int left = 0;
7        int right = numbers.length - 1;
8
9        while(left<right){
10
11            if(numbers[right]+numbers[left] > target){
12                right--;
13            }
14            else if(numbers[right]+numbers[left] < target)
15            {
16                left++;
17            }
18            else {
19                return new int[]{left+1,right+1}; 
20            }                    
21            
22        }
23        return new int[]{left+1,right+1}; 
24    }
25}