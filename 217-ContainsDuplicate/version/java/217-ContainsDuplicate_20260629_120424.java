// Last updated: 29/06/2026, 12:04:24
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        return nums.length != Arrays.stream(nums).boxed().collect(Collectors.toSet()).size();
4    }
5}