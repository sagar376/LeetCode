class Solution {
    public double averageWaitingTime(int[][] customers) {
        int size=customers.length;

        double avgWaitTime=0;
        int currentTime=customers[0][0];

        for(int i=0;i<size;i++)
        {
            int arrival=customers[i][0];
            int time=customers[i][1];

            if(arrival >= currentTime)
            {
                avgWaitTime+=(arrival+time)-arrival;
                currentTime=arrival+time;
            }
            else
            {
                avgWaitTime+=(currentTime+time)-arrival;
                currentTime+=time;
            }
        }

        return avgWaitTime/size;
    }
}