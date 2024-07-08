class Solution {
    public int findTheWinner(int n, int k) {
        
        List<Integer> friendGroup=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            friendGroup.add(i);
        }
        int startIndex=0;
        while(friendGroup.size()>1)
        {
            int removeIndex=(startIndex+k-1)%friendGroup.size();
            friendGroup.remove(removeIndex);

            startIndex=removeIndex;
        }

        return friendGroup.get(0);
    }
}