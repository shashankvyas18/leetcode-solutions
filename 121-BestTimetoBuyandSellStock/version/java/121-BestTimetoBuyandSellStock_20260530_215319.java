// Last updated: 30/05/2026, 21:53:19
1class Solution {
2    public int maxProfit(int[] prices) {
3
4		int left = prices[0];
5		int max_profit = 0;
6		
7		for(int i=1;i<prices.length;i++){
8			if(prices[i]<left){
9				left = prices[i];
10			}
11			
12            max_profit = Math.max(max_profit,prices[i]-left);
13			
14		}
15		return max_profit;
16    }
17}