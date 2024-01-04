class Solution {
    public int numberOfBeams(String[] bank) {
        int size=bank.length;
        int res=0;
        List<Integer> floorList=new ArrayList<>();
        
        for(String floor:bank)
        {   
            int count=0;
            for(int i=0;i<floor.length();i++)
            {
                if(floor.charAt(i)=='1')
                    count++;
            }
            if(count>0)
            floorList.add(count); 
        }
        
        for(int i=0;i<floorList.size()-1;i++)
        {
            res+=floorList.get(i)*floorList.get(i+1);
        }
        return res;
    }
}