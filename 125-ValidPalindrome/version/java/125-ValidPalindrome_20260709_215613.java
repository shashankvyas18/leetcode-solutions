// Last updated: 09/07/2026, 21:56:13
1class Solution {
2    public boolean isPalindrome(String s) {
3        StringBuilder strBldr = new StringBuilder();
4
5        for(char ch: s.toCharArray())
6        {
7            if(Character.isLetterOrDigit(ch))
8                strBldr.append(Character.toLowerCase(ch));
9        }
10
11        char [] charArray = strBldr.toString().toCharArray();
12
13        int i =0;
14        int j=charArray.length-1;
15
16        while(i<=j){
17            if(charArray[i]==charArray[j]){
18                i++;
19                j--;
20            }
21            else{
22                return false;
23            }
24        }
25
26        return true;
27    }
28}