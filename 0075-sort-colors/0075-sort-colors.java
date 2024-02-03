class Solution {
    public void sortColors(int[] nums) {
        
        int[] a=nums;
        int low=0;
        int high=nums.length-1;
        
        int i=0;
        
        while(i<=high)
        {
            if(a[i]==0)
            {
                int temp=a[low];
                a[low]=a[i];
                a[i]=temp;
                i++;low++;
            }
            else if(a[i]==2)
            {
                int temp=a[i];
                a[i]=a[high];
                a[high]=temp;
                high--;
            }
            else
            {
                i++;
            }
        }
        System.arraycopy(a,0,nums,0,nums.length);
        
    }
}