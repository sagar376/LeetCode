class Solution {
    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);
        // int minForce=position[0];// check this went wrong here
        int minForce=1;
        int maxForce=position[position.length-1];

        int maxDistance=0;
        while(minForce<=maxForce){
            int midForce=minForce + (maxForce - minForce)/2;
            
            if(possibleToPlace(midForce, position,m))
            {
                maxDistance = midForce;
                minForce = midForce +1;
            }
            else
            {
                maxForce = midForce -1;
            }
        }

        return maxDistance;  
    }
    private boolean possibleToPlace(int midForce,int[] position,int balls)
    {
        int countBalls=1;  // initialise to 1 as we keep one ball here.
        int prev = position[0];

        for(int i=1;i<position.length;i++)
        {
            int curr=position[i];
            if(curr-prev>=midForce)
            {
                countBalls++;
                prev=curr;
            }

            if(countBalls == balls)
            {
                return true;
            }
        }

        return false;
    }
}