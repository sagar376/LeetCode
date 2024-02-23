class Tuple {
    int stops,node,distance;
    Tuple(int stops,int node,int distance)
    {
        this.stops=stops;
        this.node=node;
        this.distance=distance;
    }
}
class Pair
{
    int first,second;
    Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        ArrayList<ArrayList<Pair>> adj =new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<flights.length;i++)
        {
            adj.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
        }

        Queue<Tuple> q=new LinkedList<>();
        //{stops, { node, dist}}
        q.add(new Tuple(0,src,0));
        int [] dist=new int[n];
        for(int i=0;i<n;i++)
        {
            dist[i]=(int)(1e9);
        }
        dist[src]=0;

        while(!q.isEmpty())
        {
            Tuple it=q.poll();

            int stops=it.stops;
            int node=it.node;
            int cost=it.distance;

            if(stops>k)continue;
            for(Pair iter:adj.get(node))
            {
                int adjNode=iter.first;
                int edW=iter.second;

                if(cost+edW < dist[adjNode] && stops <=k)
                {
                    dist[adjNode]=cost+edW;
                    q.add(new Tuple(stops+1,adjNode,cost+edW));
                }
            }
        }
        if(dist[dst]== (int)1e9)
        return -1;
        return dist[dst];

        
    }
}