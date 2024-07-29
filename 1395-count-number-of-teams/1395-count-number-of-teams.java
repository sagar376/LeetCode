class Solution {

    public int numTeams(int[] rating) {
        
        int totalTeams = 0;

        for (int j = 1; j < rating.length - 1; j++) {
            int smallerLeft = 0;
            int largerLeft = 0;
            int smallerRight = 0;
            int LargerRight = 0;
        
            for(int i = 0; i < j; i++)
            {
                if(rating[j] > rating[i])
                {
                    smallerLeft++;
                }
                else if(rating[j] < rating[i])
                {
                    largerLeft++;
                }
            }

            for(int i = j+1; i < rating.length; i++)
            {
                if(rating[j] > rating[i])
                {
                    smallerRight++;
                }
                else if(rating[j] < rating[i])
                {
                    LargerRight++;
                }

            }

            totalTeams += ( smallerLeft * LargerRight ) + ( largerLeft * smallerRight );
        }

        return totalTeams;

    }
}
