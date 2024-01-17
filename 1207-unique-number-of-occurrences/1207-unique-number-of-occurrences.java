class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer> freq=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        
        List<Integer> occurences=new ArrayList<>(freq.values());
        Collections.sort(occurences);
        
        for(int i=1;i<occurences.size();i++)
        {
            if(occurences.get(i-1)==occurences.get(i))
            {
                return false;
            }
        }
        return true;
    }
}