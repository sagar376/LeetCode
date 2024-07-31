class Solution {
    public int hammingWeight(int n) {

        int setBitCount = 0;
        while(n>0)
        {
            if(n % 2 == 1)
            setBitCount++;
            n = n >> 1;
        }

        return setBitCount;
        
    }
}