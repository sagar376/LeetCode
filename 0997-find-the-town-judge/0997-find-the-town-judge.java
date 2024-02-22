class Solution {
    public int findJudge(int n, int[][] trust) {
        //if(trust.length==0)return -1;
        if(n==1)return n;
        
        int[] indegree=new int[n+1];
        int[] outdegree=new int[n+1];

        for(int[] i:trust)
        {
            indegree[i[1]]++;
            outdegree[i[0]]++;
        }

        for(int i=1;i<=n;i++)
        {
            if(indegree[i]==n-1 && outdegree[i]==0)
            return i;
        }

    return -1;
    }
}