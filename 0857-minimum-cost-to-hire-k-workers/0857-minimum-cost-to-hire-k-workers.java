class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {

        /* https://www.youtube.com/watch?v=kxR52OB_I8k 
        Refer above video for complete understanding */ 

        int n=quality.length;

        double[][] workerRatio=new double[n][2];

        for(int i=0;i<n;i++)
        {
            workerRatio[i][0]=(double)wage[i]/quality[i];
            workerRatio[i][1]=quality[i];
        }

        Arrays.sort(workerRatio,(a,b) -> Double.compare(a[0],b[0]));

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        double qualitySum=0;


        for(int i=0;i<k;i++)
        {
            qualitySum+=workerRatio[i][1];
            pq.offer((int)workerRatio[i][1]);
        }

        double managerRatio=workerRatio[k-1][0];
        double result = managerRatio * qualitySum;

        for(int i=k;i<n;i++)
        {
            managerRatio = workerRatio[i][0];

            pq.offer((int)workerRatio[i][1]);
            qualitySum+=workerRatio[i][1];

            if(pq.size() > k)
            {
                qualitySum-=pq.poll();
            }

            result = Math.min( result, managerRatio * qualitySum);


        }

        return result;

        


        
    }
}