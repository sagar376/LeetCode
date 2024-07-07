class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int maxWaterBottles=numBottles;

        int water=numBottles;
        int quo=0;
        int rem=0;

        while(water >= numExchange)
        {
            quo = water/numExchange;
            rem = water % numExchange;

            maxWaterBottles+=quo;
            water = quo + rem ;
        }

        return maxWaterBottles;
        
    }
}