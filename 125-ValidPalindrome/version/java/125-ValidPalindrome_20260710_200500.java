// Last updated: 10/07/2026, 20:05:00
1class Solution {
2    public boolean isPalindrome(String s) {
3
4        if(s.length()==1) return true;
5        
6        int left = 0;
7        int right = s.length()-1;
8        
9        while(left<right){
10            if(!Character.isLetterOrDigit(s.charAt(left))){
11                left++;
12                continue;
13            }
14
15            if(!Character.isLetterOrDigit(s.charAt(right))){
16                right--;
17                continue;
18            }
19
20            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
21                return false;
22            }
23
24            left++;
25            right--;
26        }
27
28        return true; 
29
30      // Awesome solution TC: O(N) SC: O(1)
31    }
32}