class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        // HashSet<Integer> commonSet=new HashSet<>();

        // for(int num:nums1)
        // {
        //     commonSet.add(num);
        // }

        // for(int num:nums2)
        // {
        //     if(commonSet.contains(num))
        //     return num;
        // }
        // return -1;

        //Method -2 

        int first=0;
        int second=0;

        while(first<nums1.length && second<nums2.length )
        {
            if(nums1[first]==nums2[second])
            {
                return nums1[first];
            }
            else if(nums1[first]<nums2[second])
            first++;
            else
            second++;
        }
        return -1;
    }
}