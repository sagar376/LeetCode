class Solution {
    public int[][] divideArray(int[] nums, int k) {

        //Alternate Solution check this
//         public int[][] divideArray(int[] nums, int k) {
//             Arrays.sort(nums);
//             int [][] ans = new int[nums.length/3][3];
//             for(int i = 2; i < nums.length; i += 3){
//                if(nums[i] - nums[i-2] > k) return new int[0][];  /// Just compare first and last value of set
//                  ans[i/3] = new int[]{nums[i-2], nums[i-1],nums[i]};
//     }
//     return ans;
// }

      int size=nums.length;
      int[][] res=new int[size/3][3];

      if(size%3!=0)
        return res;

      Arrays.sort(nums);

      for(int i=0;i<size;i=i+3)
      {
        if(Math.abs(nums[i]-nums[i+1])<=k && Math.abs(nums[i+1]-nums[i+2])<=k && Math.abs(nums[i]-nums[i+2])<=k)
        {
          res[i/3][0]=nums[i];
          res[i/3][1]=nums[i+1];
          res[i/3][2]=nums[i+2];
        }
        else
        {
          return new int[0][0];
        }
      }
      return res;
        
    }
}