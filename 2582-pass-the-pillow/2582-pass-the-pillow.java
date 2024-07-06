class Solution {
    public int passThePillow(int n, int time) {

        int direction=1;
        int index=1;

        while(time!=0)
        {
            if(index==1)
            direction=1;
            else if(index==n)
            direction=-1;

            index+=direction;
            time--;
        }
        return index;
        
    }
}