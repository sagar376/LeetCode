class Solution {
    public int[] twoSum(int[] nums, int target) {
//         int[] res=new int[2];
//         for(int i=0;i<nums.length-1;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if((nums[i]+nums[j])==target){
//                     res[0]=i;res[1]=j;}
//             }
//         }
        
//         return res;
        //Using hashMap
        HashMap<Integer,Integer> numMap=new HashMap<>();
        
        //add elements
        for(int i=0;i<nums.length;i++)
        {
            numMap.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int complement = target-nums[i];
            if(numMap.containsKey(complement) && numMap.get(complement)!=i)
            {
                return new int[]{i,numMap.get(complement)};
            }
        }
        return new int[]{};
    }
}