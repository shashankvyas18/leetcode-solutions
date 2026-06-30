// Last updated: 30/06/2026, 08:33:40
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String,List<String>> map = new HashMap<>();
4
5        for(String s : strs){
6            char[] ch = s.toCharArray();
7            Arrays.sort(ch);
8            String temp = new String(ch);
9
10            if(!map.containsKey(temp)){
11                map.put(temp,new ArrayList<>());
12            }
13            map.get(temp).add(s);
14        }
15
16        return new ArrayList<>(map.values());
17    }
18}