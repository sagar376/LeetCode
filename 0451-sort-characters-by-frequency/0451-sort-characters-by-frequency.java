class Solution {
    public String frequencySort(String s) {
        HashMap<Character,StringBuilder> freq=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            freq.put(c,freq.getOrDefault(c,new StringBuilder()).append(c));
        }
        
        PriorityQueue<StringBuilder> queue=new PriorityQueue<>((a,b)->b.length()-a.length());
        queue.addAll(freq.values());
        
        StringBuilder sb=new StringBuilder();
        
        while(!queue.isEmpty())
        {
            sb.append(queue.poll());
        }
        return sb.toString();
        
    }
}