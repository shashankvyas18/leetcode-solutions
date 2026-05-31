// Last updated: 30/05/2026, 21:51:52
1class Solution {
2    public int maxProfit(int[] prices) {
3
4		int left = prices[0];
5		int max_profit = 0;
6		
7		for(int i=1;i<prices.length;i++){
8			if(left>prices[i]){
9				left = prices[i];
10			}
11			else {
12				int current_price = prices[i]-left;
13				max_profit = Math.max(max_profit,current_price);
14			}
15		}
16		return max_profit;
17    }
18}