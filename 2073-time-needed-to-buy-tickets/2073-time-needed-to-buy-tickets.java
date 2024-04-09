class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        //single-pass soln

        int time=0;
        for(int i=0;i<tickets.length;i++)
        {
            if(i<=k)
            {
                time+=Math.min(tickets[i],tickets[k]);
            }
            else
            {
                time+=Math.min(tickets[k]-1,tickets[i]);
            }

        }
        return time;

        // Queue<Integer>  queue=new ArrayList<>();

        // for(int i=0;i<tickets.length;i++)
        // {
        //     queue.offer(i);
        // }

        // int time=0;
        // while(tickets[k]!=0)
        // {
        //     for(int i=0;i)
        // }
    }
}