class Solution {
    public int subarraysDivByK(int[] nums, int k) {

    //     HashMap<Integer,List<Integer>> modSeen=new HashMap<>();

    //     modSeen.put(0,new ArrayList<>(Arrays.asList(-1)));

    //     int modPrefix=0;

    //     for(int i=0;i<nums.length;i++)
    //     {
    //         modPrefix= (modPrefix+nums[i])%k;

    //         if(modSeen.containsKey(modPrefix))
    //         {
    //             List temp=modSeen.get(modPrefix);
    //             temp.add(i);
    //         }
    //         else
    //         {
    //             modSeen.put(modPrefix,new ArrayList<>(Arrays.asList(i)));
    //         }
    //     }

    //     int total=0;
    //     for(List<Integer> temp:modSeen.values())
    //     {
    //         int size=temp.size();
    //         if(size > 1)
    //         {
    //             total += fact(size);
    //         }
    //     }


    //     return total;
        
    // }

    // private int fact(int n)
    // {
    //     if(n==1)
    //     return 1;

    //     return fact(n) + fact(n-1);

        int result=0;

        for(int i=0;i<nums.length;i++)
        {   
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum%k==0)
                result++;
            }
        }

        return result;


    }

}