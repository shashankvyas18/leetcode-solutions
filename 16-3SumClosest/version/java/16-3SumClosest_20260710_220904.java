// Last updated: 10/07/2026, 22:09:04
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3
4
5        if(nums.length==0 || null == nums) return new ArrayList<>();
6
7        Set<List<Integer>> temp = new HashSet<>();
8
9        Arrays.sort(nums);
10
11        for(int i=0;i<nums.length-2;i++){
12
13            int left = i+1;
14            int right = nums.length-1;
15
16            while(left<right){
17                int sum = nums[left]+nums[right]+nums[i];
18                if(sum>0){
19                    right--;
20                }
21                else if(sum<0){
22                   left ++;
23                }
24                else{
25                    temp.add(Arrays.asList(nums[i],nums[left],nums[right]));
26                    left++;
27                    right--;
28                }     
29            }
30
31            
32        }
33
34        return new ArrayList<>(temp);
35        }
36
37    
38}