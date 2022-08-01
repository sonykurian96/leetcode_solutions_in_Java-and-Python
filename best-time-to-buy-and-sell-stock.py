
# test cases passed - 153/211
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = min(prices)
        temp = []
        if prices.index(buy) == len(prices) - 1:
            return 0
        for i in range(prices.index(buy) + 1, len(prices)):
            temp.append(prices[i])
        sell = max(temp)
        return sell - buy
      
# passed solution (source - siteinvokers.com)

def maxProfit( prices )  :
    #variable to store minimum buying price
    buy = prices[0]# variable to store maximum selling price 
    sell = 0
    #used to store maximum profit throughout the array
    profit = 0
    # to store current profit
    profit_so_far = 0
 
    for i in range(1,len(prices)):
        pr = prices[i]# check if current price is less than buy price
        if(pr < buy):
            # if yes then store pr in buy sell 
            buy =sell =pr
		# check sell price is less than pr
        elif(sell < pr):
            # if yes than sell price will be equal to pr
            sell = pr
        # Check current profit
        profit_so_far = sell-buy
        # If current profit is greater than profit
        if(profit_so_far > profit):
            # store profit
            profit = profit_so_far
            
    return profit
