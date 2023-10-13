class Solution {
    public int[] productExceptSelf(int[] nums) {
//         int[] res=new int[nums.length];
        
//         for(int loop=0;loop<nums.length;loop++)
//         {
//             int product=1;
//             for(int i=0;i<nums.length;i++)
//             {
//                 if(i!=loop)
//                 {
//                     product=product*nums[i];
//                 }
//             }
//             res[loop]=product;
//         }
//   return res;    
        
    //    int[]  arr =new int[nums.length];
    //     int left =1; int right=1;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         arr[i]=left;
    //         left=left*nums[i];
    //     }
    //     System.out.print(Arrays.toString(arr));
    //     for(int i=nums.length-1;i>=0;i--)
    //     {
    //         arr[i]=arr[i]*right;
    //         right=right*nums[i];
    //     }
    //     return arr;
    // }
        int[] prefix = new int[nums.length];
        //int[] postfix=new int[nums.length];
        int left =1 ; int product=1;
        prefix[0]=left;
        for(int i=1;i<nums.length;i++)
        {    
            left=nums[i-1];  
             prefix[i]=left*prefix[i-1];
        }
        //System.out.println(Arrays.toString(prefix));
        
        for(int i=nums.length-2;i>=0;i--)
        {
            
             product*=nums[i+1];
            prefix[i]=prefix[i]*product;
           
        }
        //System.out.println(Arrays.toString(postfix));

        
        return prefix;
    }
    
        
}
// Alternate approach is to multiply values in array and store the product, 
// on each index divide the whole product with index value.
// BUT we are given that we should not be using division operation.