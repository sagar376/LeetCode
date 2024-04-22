class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        //Set<String> deadendSet = new HashSet<>(Arrays.asList(deadends));
        // if(deadendSet.contains("0000"))
        // return -1;

        Set<String> bankSet = new HashSet<>(Arrays.asList(bank));

         // If the endGene isn't in the bank, transformation is impossible.
        if (!bankSet.contains(endGene)) {
            return -1;
        }

        Queue<Pair<String,Integer>> queue=new LinkedList<>();
        queue.offer(new Pair<>(startGene,0));

        Set<String> visited=new HashSet<>();
        visited.add(startGene);

        while(!queue.isEmpty())
        {
            Pair<String,Integer> current=queue.poll();
            String currentCombination = current.getKey();
            int moves=current.getValue();

            if(currentCombination.equals(endGene))
            {
                return moves;
            }

            
            for(int i=0;i<8;i++)
            {
                for(char delta:new char[]{'A','C','G','T'})
                {
                    if(currentCombination.charAt(i)== delta)continue;
                    
                        String newCombination=currentCombination.substring(0,i)+delta+currentCombination.substring(i+1);
        



                    // int newDigit=(currentCombination.charAt(i)-'0'+delta+10)%10;
                    // String newCombination= currentCombination.substring(0,i)+newDigit+currentCombination.substring(i+1);

                    if(!visited.contains(newCombination) && bankSet.contains(newCombination))
                    {
                        visited.add(newCombination);
                        queue.offer(new Pair<>(newCombination,moves+1));
                    }
                }
            }
        }
        return -1;
    }
}