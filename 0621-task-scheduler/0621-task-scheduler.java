class Solution {
    public int leastInterval(char[] tasks, int n) {
        //if(n==0)return tasks.length;
        int[] freq=new int[26];
        
        for(int i=0;i<tasks.length;i++)
        {
             freq[tasks[i]-'A']++;
        }
        Arrays.sort(freq);
        
        int chunk=freq[25]-1;
        int idle=chunk*n;
        
        
        for(int i=24;i>=0;i--)
        {
            idle=idle-Math.min(chunk,freq[i]);
        }
        return idle<0?tasks.length:idle+tasks.length;
    }
}