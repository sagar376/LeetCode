class Solution {
    public int minFallingPathSum(int[][] grid) {
        // watch this video for intuition of neetcode and all editorial solutions

        //https://www.youtube.com/watch?v=_b8sptrsFEM
        // This is bottom up approach Time O(n2) & space O(1)
        // First and second min indexes
        int minIdx1=-1;
        int minIdx2=-1;

        // First and second min values
        int minVal1 = Integer.MAX_VALUE;
        int minVal2 = Integer.MAX_VALUE;

        int size = grid.length;
        // Find first & second min in last column

        int idx=0;
        for(int i:grid[size-1])
        {
            if(i<=minVal1)
            {
                minVal2=minVal1;
                minVal1=i;
                minIdx2=minIdx1;
                minIdx1=idx;
            }
            else if(i < minVal2)
            {
                minVal2 = i;
                minIdx2 = idx;
            }
            idx++;
        }

        //System.out.println(minVal1+" "+minVal2+" idx1: "+minIdx1+" idx2: "+minIdx2);
        System.out.println(minVal1);

        //Fill the recursive cases
        for(int row=size-2;row>=0;row--)
        {
             // Minimum and Second Minimum Column Index of the current row
            int minC1= -1;
            int minC2= -1;

            // Minimum and Second Minimum Value of current row
            int minV1 = Integer.MAX_VALUE;
            int minV2 = Integer.MAX_VALUE; 

            for(int col =0; col < grid.length;col++)
            {
                // Select minimum from valid cells of the next row
                int value;
                if(col != minIdx1)
                {
                    value = grid[row][col] + minVal1;
                }
                else
                {
                    value = grid[row][col] + minVal2;
                }

                // Save minimum and second minimum
                if( value <= minV1)
                {
                    minV2=minV1;
                    minV1=value;
                    minC2=minC1;
                    minC1=col;
                }
                else if( value < minV2)
                {
                    minV2=value;
                    minC2=col;
                }
                System.out.println(value);
            }
            
            

            // Change of row. Update nextMin1C, nextMin2C, nextMin1, nextMin2
                minIdx1=minC1;
                minIdx2=minC2;

                // First and second min values
                minVal1 = minV1;
                minVal2 = minV2;

                
                //System.out.println(minVal1+" "+minVal2+" idx1: "+minIdx1+" idx2: "+minIdx2);


        }

        return minVal1;


    }
}