class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        String possible="123456789";
        List<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<possible.length()-1;i++)
        for(int j=i+1;j<possible.length();j++)
        {
            int num=Integer.parseInt(possible.substring(i,j+1));
            if(num >=low && num <= high)ans.add(num);
        }
        ans.sort(null);
        return ans;
    }
}