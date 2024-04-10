class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {

        Arrays.sort(deck);
        int[] ans=new int[deck.length];
        Queue<Integer> queue=new LinkedList<>();


        for(int i=0;i<deck.length;i++)
        {
            queue.offer(i);
        }

        int i=0;
        while(!queue.isEmpty())
        {
            int index=queue.poll();
            ans[index]=deck[i++];
            if(!queue.isEmpty())
            queue.add(queue.poll());
        }

        return ans;
        
    }
}