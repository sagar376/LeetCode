class Solution {
    class Ability{
        int difficulty;
        int profit;
        Ability(int difficulty,int profit)
        {
            this.difficulty=difficulty;
            this.profit=profit;
        }
    }
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int size=difficulty.length;
        List<Ability> quality=new ArrayList<>();

        for(int i=0;i<size;i++)
        {
            quality.add(new Ability(difficulty[i],profit[i]));
        }

        Collections.sort(quality,(a,b)->a.difficulty-b.difficulty);

        Arrays.sort(worker);

        //PriorityQueue<Integer> maxProfit=new PriorityQueue<>((p,q)->q-p);

        int result=0;
        int maxProfit=0;
        int j=0;
        
        for(int i=0;i<worker.length;i++) 
        {
            while(j< size && (worker[i]>=quality.get(j).difficulty))
            {
                maxProfit=Math.max(maxProfit,quality.get(j).profit);
                j++;
            }
            
            result+=maxProfit;
        }

        return result;
    }
}