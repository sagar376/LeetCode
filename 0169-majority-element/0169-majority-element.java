class Solution {
    public int majorityElement(int[] nums) {

      int count =0 ;
      int candidate=0;

      for(int num:nums)
      {
        if(count==0)
        {
          candidate = num;
          count++;
        }
        else if(num == candidate)
        {
          count++;
        }
        else
        {
          count--;
        }
        
      }
      return candidate;
    }
}

// https://leetcode.com/problems/majority-element/discuss/3676530/3-Method's-oror-Beats-100-oror-C++-oror-JAVA-oror-PYTHON-oror-Beginner-Friendly
//READ above comment for detailed explaination