class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

      HashMap<Integer,Integer> prefixMap=new HashMap<>();

      prefixMap.put(nums[0]%k,0);
      prefixMap.put(0,-1); // IMP to handle where prefix[i]%k==0 cases
      int prev=nums[0];

      for(int i=1;i<nums.length;i++)
      { 
         prev=nums[i]+prev;
         int key=prev%k;
        if(prefixMap.containsKey(key))
        {
          if(i-prefixMap.get(key)>=2)
          {
            return true;
          }
        }
        else
        {
          prefixMap.put(key,i);
        }
      }
      System.out.println(prefixMap);
      return false;    
    }
}