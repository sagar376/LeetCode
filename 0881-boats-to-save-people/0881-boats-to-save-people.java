class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);
        int start=0,end=people.length-1;
        int numRescueBoats=0;

        while(start!=end && start<end)
        {
            if(people[start]+people[end]>limit)
            {
                numRescueBoats++;
                end--;
            }
            else
            {
               numRescueBoats++;
               start++;
               end--; 
            }

        }
        if(start==end)
        {
            numRescueBoats++;
        }
        return numRescueBoats;
        
        
    }
}