// Last updated: 28/09/2026, 21:38:49
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3
4        if (s.length()==0) return 0;
5
6        int left = 0;
7        int right = 0;
8
9        StringBuilder resultStr = new StringBuilder();
10        int maxL = 1;
11        resultStr.append(s.charAt(0));
12        right++;
13
14        while( right< s.length()){
15
16            if(resultStr.indexOf(String.valueOf(s.charAt(right)))==-1){
17               // System.out.println("Right = "+right+ " " +resultStr.toString());
18                resultStr.append(s.charAt(right));
19                
20                right++;
21                if(resultStr.length()> maxL){
22                    maxL=resultStr.length();
23                }
24            }
25            else {
26               // System.out.println("Left = "+left+" "+resultStr.toString());
27                resultStr.deleteCharAt(0);
28                left++;
29            }
30
31        }
32
33        return maxL;
34        
35    }
36}