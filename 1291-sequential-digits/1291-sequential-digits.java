class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> ans=new ArrayList<>();
        
        for(int i=1;i<=9;i++)
        {
            int num=i;
            int next=i+1;
            while(num <=high && next<=9)
            {
                num=num*10+next;
                if(low<=num && num <= high)
                {
                    ans.add(num);
                }
                next++;
            }
            ans.sort(null);
        }
        return ans;
        
        
        //Method-2
//         String possible="123456789";
//         List<Integer> ans=new ArrayList<>();
        
//         for(int i=0;i<possible.length()-1;i++)
//         for(int j=i+1;j<possible.length();j++)
//         {
//             int num=Integer.parseInt(possible.substring(i,j+1));
//             if(num >=low && num <= high)ans.add(num);
//         }
//         ans.sort(null); // important method
//         return ans;
    }
}