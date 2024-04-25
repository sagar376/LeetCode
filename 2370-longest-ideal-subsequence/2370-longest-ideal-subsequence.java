class Solution {
    public int longestIdealString(String s, int k) {

        //refer this youtube video : https://www.youtube.com/watch?v=3AlOK4t-Q3I

        int[]dp = new int[26];
        int n=s.length();

        for(int i=n-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            int idx= ch -'a';
            int max=0;

            int left=Math.max((idx-k),0);
            int right=Math.min((idx+k),25);

            for(int j=left;j<=right;j++)
            {
                max=Math.max(max,dp[j]);
            }

            dp[idx]=max+1;
        }

        int ans=0;
        for(int ele:dp)
        {
            ans=Math.max(ele,ans);
        }

        return ans;
        
    }
}