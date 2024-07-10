class Solution {
    public int minOperations(String[] logs) {

        Stack<Integer> logStash=new Stack<>();
        int dir=0;

        for(String log:logs)
        {
            if(log.equals("./"))
            {
                
            }
            else if(log.equals("../"))
            {
                if(!logStash.isEmpty())
                {
                    logStash.pop();
                }
            }
            else
            {
                logStash.push(dir++);
            }
        }

        int minOperations=0;
        while(!logStash.isEmpty())
        {
            logStash.pop();
            minOperations++;
        }
        return minOperations;
        
    }
}