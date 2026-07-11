// Last updated: 10/07/2026, 19:57:54
1class Solution {
2    public boolean isPalindrome(String s) {
3
4        /*if(s.length()==1) return true;
5
6        s.toLowerCase().trim();
7        
8        int left = 0;
9        int right = s.length()-1;
10        
11        while(left<right){
12            if(!Character.isLetterOrDigit(s.charAt(left))){
13                left++;
14                continue;
15            }
16
17            if(!Character.isLetterOrDigit(s.charAt(right))){
18                right--;
19                continue;
20            }
21
22            if(s.charAt(left)!=s.charAt(right)){
23                return false;
24            }
25
26            left++;
27            right--;
28        }
29
30        return true; */
31
32        //if(s.length()==1) return true;
33
34        StringBuilder strBldr = new StringBuilder();
35
36        for(char ch: s.toCharArray()){
37            if(Character.isLetterOrDigit(ch)){
38                strBldr.append(Character.toLowerCase(ch));
39            }
40        }  
41
42        int left = 0;
43        int right = strBldr.length()-1;
44
45        while(left<right){
46            if(strBldr.charAt(left)!=strBldr.charAt(right)){
47                return false;
48            }
49            else {
50                left++;
51                right--;
52            }
53        }
54
55        return true;
56    }
57}