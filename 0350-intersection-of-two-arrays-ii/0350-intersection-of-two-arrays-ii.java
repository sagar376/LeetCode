class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int num:nums1)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        List<Integer> result=new ArrayList<>();

        for(int num:nums2)
        {
            if(freq.containsKey(num))
            {
                if(freq.get(num)>0)
                {
                    result.add(num);
                    freq.put(num,freq.get(num)-1);
                }
            }
        }

        int[] finalResult=new int[result.size()];
        for(int i=0;i<result.size();i++)
        {
            finalResult[i]=result.get(i);
        }

        return finalResult;

        
        
    }
}