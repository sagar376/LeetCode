class Solution {
    public int[] sortArray(int[] nums) {

        // PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> a-b);

        // for(int i=0;i<nums.length;i++)
        // {
        //     pq.add(nums[i]);
        // }

        // int result[] = new int[nums.length];
        // int idx = 0;

        // while(!pq.isEmpty())
        // {
        //     result[idx++] = pq.poll();
        // }
        
        // return result;

        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;

        for(int num: nums)
        {
            min = Math.min(num,min);
            max = Math.max(num,max);
        }

        int n = max - min ;
        int count[] = new int[n+1];

        for(int num: nums)
        {
            count[num - min]++;
        }

        int index =0 ;
        for(int i=0;i<=n; i++)
        {
            while(count[i]>0)
            {
                nums[index] = min;
                index++;
                count[i]--;
            }
            min++;
        }

        return nums;
    }
}