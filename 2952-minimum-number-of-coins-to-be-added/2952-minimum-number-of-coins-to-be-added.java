class Solution {
    public int minimumAddedCoins(int[] coins, int target) {

        Arrays.sort(coins);
        int size=coins.length;
        int i=0;
        long maxReach=0;
        int minCoins=0;

        while(maxReach<target)
        {
            if(i<size && coins[i] <= maxReach+1)
            {
                maxReach+=coins[i];
                i++;
            }
            else
            {
                maxReach+=(maxReach+1);
                minCoins++;
            }
        }
        return minCoins;
        
    }
}