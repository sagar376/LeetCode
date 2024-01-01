class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        
        //the below logic won't work if order of cookies are not proper, as highest will be assigned
        // int answer=0;
        // for(int i=0;i<g.length;i++)
        // {
        //     for(int j=0;j<s.length;j++)
        //     {
        //         if(g[i]<=s[j])
        //         {
        //             answer++;
        //             s[j]=0;
        //             break;
        //         }
        //     }
        // }
        // return answer;
        
        Arrays.sort(s);
        Arrays.sort(g);
        
        int child=0;
        
        for(int cookie=0;child<g.length && cookie<s.length;cookie++)
        {
            if(s[cookie]>=g[child])
            {
                child++;
            }
        }
            
            
        //      int child = 0;
        // for (int cookie = 0; child < children.length && cookie < cookies.length; cookie ++) {
        //     if (cookies[cookie] >= children[child]) {
        //         child ++;
        //     }
        // }
        
        return child;
        
    }
}