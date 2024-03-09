class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        HashSet<Integer> commonSet=new HashSet<>();

        for(int num:nums1)
        {
            commonSet.add(num);
        }

        for(int num:nums2)
        {
            if(commonSet.contains(num))
            return num;
        }
        return -1;
        
    }
}