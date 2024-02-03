class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        
         int n = arr.length;
        int[] dp = new int[n + 1]; // dp[i] stores the maximum sum after partitioning first i elements
        
        for (int i = 1; i <= n; i++) {
            int maxInWindow = 0;
            for (int j = 1; j <= k && i - j >= 0; j++) {
                maxInWindow = Math.max(maxInWindow, arr[i - j]); // Update maxInWindow within the current window
                dp[i] = Math.max(dp[i], dp[i - j] + maxInWindow * j); // Update dp[i] with the maximum sum
            }
        }
        
        return dp[n];
    }
//         int answer=0;
//         int max=0;
        
//         max=maxnum(arr,k,0);
//         answer+=max;
        
//         for(int i=1;i<arr.length;i++)
//         {
//             System.out.println(answer);
//            if((i+k-1) < arr.length-1)
//            {
//                if(arr[i-1] < max)
//                {
//                    if(max>arr[i+k-1])
//                    {
//                        answer+=max;
//                    }
//                    else
//                    {
//                        max=arr[i+k-1];
//                        answer+=max;
//                    }
//                }
//            }
//             else
//             {
//                 max=maxnum(arr,k,i);
//                 answer+=max;
//             }
//         }
//         return answer;
           
//         }
        
//         public int maxnum(int arr[],int k,int start)
//         {
//             int max=0;
//             for(int i=start;(i<k) || (i < arr.length) ;i++)
//             {
//                 max=Math.max(arr[i],max);
//             }
//             return max;
//         }
        
    }
