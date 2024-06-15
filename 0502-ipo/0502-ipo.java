class Project{
    int profit;
    int capital;
    Project(int profit,int capital)
    {
        this.profit=profit;
        this.capital=capital;
    }
}
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        List<Project> project=new ArrayList<>();
        int size=profits.length;

        for(int i=0;i<size;i++)
        {
            project.add(new Project(profits[i],capital[i]));
        }

        Collections.sort(project,(a,b)->a.capital-b.capital);

        PriorityQueue<Integer> maxProfits=new PriorityQueue<>((a,b)->b-a);
        int i=0;

        for(int j=0;j<k;j++)
        {
            while(i<size && project.get(i).capital <=w)
            {
                maxProfits.add(project.get(i).profit);
                i++;
            }

            if(maxProfits.isEmpty())
            {
                break;
            }

            w+=maxProfits.poll();

        }

        return w;



        
    }
}