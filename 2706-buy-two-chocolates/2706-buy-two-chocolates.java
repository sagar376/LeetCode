class Solution {
    public int buyChoco(int[] prices, int money) {
        
        int smallest=Math.min(prices[0],prices[1]);
        int secondSmallest=Math.max(prices[0],prices[1]);
        int size=prices.length;
        
        for(int i=2;i<size;i++){
            if(prices[i] < smallest){
                secondSmallest=smallest;
                smallest=prices[i];
            }
            else if(prices[i]< secondSmallest)
            {
                secondSmallest=prices[i];
            }
        }
        
        if(smallest+secondSmallest > money)return money;
        return money-smallest-secondSmallest; 
        
    }
}