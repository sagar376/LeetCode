class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        int size=nums.length;
        // int[] prefixSum=new int[size];

        // prefixSum[0]=nums[0];
        // for(int i=1;i<size;i++)
        // {
        //     prefixSum[i]=nums[i]+prefixSum[i-1];
        // }

        HashMap<Integer,Integer> modSeen=new HashMap<>();
        modSeen.put(0,-1);  /// IMP to start step to check for multiple value 0.

        int preFixMod=0;

        for(int i=0;i<size;i++)
        {
            preFixMod = (preFixMod + nums[i]) % k ;

            

            if(modSeen.containsKey(preFixMod))
            {
                if((i-modSeen.get(preFixMod)) > 1 )
                return true;
                // modSeen.put(preFixMod,i);

            }
            else
            {
                modSeen.put(preFixMod,i);
            }
        }
        return false;




        
    }
}