class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Using HashSet
        
//         HashSet<Integer> set = new HashSet<>();
        
//         for(int i=0;i<nums.length;i++)
//         {
//             if(set.contains(nums[i]))
//             {
//                 return true;
//             }
//             set.add(nums[i]);
//         }
//         return false;
//     }
        
        //Using HashMap
        
        HashMap<Integer,Integer> hp = new HashMap();
        
        for(int i=0;i<nums.length;i++)
        {
            if(hp.containsKey(nums[i]))
            {
                return true;
            }
            hp.put(nums[i],1);
        }
        return false;
    }
    
}