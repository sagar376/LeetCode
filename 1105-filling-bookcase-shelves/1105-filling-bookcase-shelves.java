class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {

        int maxHeight = 0;
        int n = books.length;
        int dp[][] = new int[n][shelfWidth+1];

        for(int row[]: dp)
        {
            Arrays.fill(row, -1);
        }

        return solve(0, shelfWidth, maxHeight, books, shelfWidth, dp);
    }

    private int solve(int ind, int remWidth, int maxHeight, int[][] books, int shelfWidth, int[][] dp)
    {
        if(ind >= books.length)
        {
            return maxHeight;
        }

        if(dp[ind][remWidth] != -1)
        {
            return dp[ind][remWidth];
        }
        int bookH = books[ind][1];
        int bookW = books[ind][0];

        //keep in current shelf
        int keep = Integer.MAX_VALUE;
        if(bookW <= remWidth)
        {
            keep = solve(ind + 1, remWidth - bookW, Math.max(maxHeight, bookH), books, shelfWidth, dp);
        }

        // skip
        int skip = maxHeight + solve(ind + 1, shelfWidth - bookW,  bookH, books, shelfWidth, dp);

        return dp[ind][remWidth] = Math.min(keep, skip);
    }
}