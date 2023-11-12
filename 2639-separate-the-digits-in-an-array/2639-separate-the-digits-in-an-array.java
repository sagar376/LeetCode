class Solution {
    public int[] separateDigits(int[] nums) {
      List<Integer> temp = new ArrayList<Integer>();

      for(int i=nums.length-1;i>=0;i--)
      {
        int number = nums[i];
        while(number>0)
        {
          temp.add(number%10);
          number=number/10;
        }
      }
      int ans[] = new int[temp.size()];
      for(int i=temp.size()-1;i>=0;i--)
      {
        ans[temp.size()-i-1]=temp.get(i);
      }
      return ans;  
    }
}