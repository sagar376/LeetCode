class Solution {
    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {

        int hPieces=1;
        int vPieces=1;

        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        for (int i = 0; i < horizontalCut.length / 2; i++) {
            int temp = horizontalCut[i];
            horizontalCut[i] = horizontalCut[horizontalCut.length - 1 - i];
            horizontalCut[horizontalCut.length - 1 - i] = temp;
        }
        for (int i = 0; i < verticalCut.length / 2; i++) {
            int temp = verticalCut[i];
            verticalCut[i] = verticalCut[verticalCut.length - 1 - i];
            verticalCut[verticalCut.length - 1 - i] = temp;
        }

        int i=0;
        int j=0;
        int minCost=0;

        while(i < horizontalCut.length && j < verticalCut.length)
        {   
            if(horizontalCut[i] > verticalCut[j] )
            {
                minCost+=horizontalCut[i] * vPieces;
                i++;
                hPieces+=1;
              

            }
            else
            {
                minCost+=verticalCut[j] * hPieces;
                j++;
                vPieces+=1; 
            }
        }
        while(i < horizontalCut.length)
        {
             minCost+=horizontalCut[i] * vPieces;
             i++;
             hPieces+=1;
        }
        while(j < verticalCut.length)
        {
            minCost+=verticalCut[j] * hPieces;
            j++;
            vPieces+=1;
        }

        return minCost;
        
    }
}