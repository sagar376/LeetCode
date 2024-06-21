class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int slidingWindow = minutes;
        int maxSatisfied=0;
        for(int i=0;i<customers.length;i++)
        {
            maxSatisfied+=grumpy[i]==0?customers[i]:0;
        }
        
        // int secretTechnique=0;

        int secretTechnique=maxSatisfied;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1)
            {
                secretTechnique+=customers[i];
            }
        }

        int currentMax=secretTechnique;
        for(int i=minutes;i<customers.length;i++)
        {
            // if(grumpy[i]==1 && grumpy[i-minutes] ==1)
            // {
            //     secretTechnique-=customers[i-minutes];
            //     secretTechnique+=customers[i];
            // }
            // else if(grumpy[i]==0 && grumpy[i-minutes] ==1)
            // {
            //     secretTechnique-=customers[i-minutes];
            // }
            // else if(grumpy[i]==1 && grumpy[i-minutes] ==0)
            // {
            //     secretTechnique+=customers[i];
            // }

            //OR  make use of Binary Array
            secretTechnique-=customers[i-minutes]*grumpy[i-minutes];
            secretTechnique+=customers[i]*grumpy[i];

            currentMax=Math.max(currentMax,secretTechnique);
        }
        // return currentMax+maxSatisfied;
        return currentMax;
        
    }
}