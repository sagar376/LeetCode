class Solution {
    public int maxFrequencyElements(int[] nums) {

        int maxSoFar=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int count=0;
        for(int freq:map.values())
        {
            maxSoFar=Math.max(maxSoFar,freq);
        }

        for(int freq:map.values())
        {
            if(freq==maxSoFar)
            {
                count+=maxSoFar;
            }
        }

        return count;



        
    }
}