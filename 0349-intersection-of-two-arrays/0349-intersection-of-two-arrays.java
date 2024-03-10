class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] freq=new int[1001];


        for(int i=0;i<nums1.length;i++)
        {
            freq[nums1[i]]++;
        }

        List<Integer> result=new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
        {
            if(freq[nums2[i]]>0)
            {
                result.add(nums2[i]);
                freq[nums2[i]]=0;
            }
        }
        
        int[] res=new int[result.size()];
        for(int i=0;i<result.size();i++)
        {
            res[i]=result.get(i);
        }
        return res;
    }
}