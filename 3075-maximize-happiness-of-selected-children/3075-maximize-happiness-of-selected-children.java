class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {


        long ans=0;

        Arrays.sort(happiness);

        int it=0;
        for(int i=happiness.length-1;i>=happiness.length-k;i--)
        {
            happiness[i]=Math.max(happiness[i]-it,0);
            ans=ans+happiness[i];
            it++;

        }

        return ans;
        
        
    }
}