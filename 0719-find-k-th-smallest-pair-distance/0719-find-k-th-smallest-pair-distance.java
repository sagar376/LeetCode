class Solution {
    public int smallestDistancePair(int[] nums, int k) {

        //PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int maxElement = Integer.MIN_VALUE;

        for(int num : nums)
        {
            maxElement = Math.max(maxElement, num);
        }

        int[] distanceBucket = new int[maxElement + 1];

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                distanceBucket[Math.abs(nums[i] - nums[j])]++;
            }
        }

        for(int i = 0; i < distanceBucket.length; i++)
        {
            k -= distanceBucket[i];

            if(k <= 0)
            return i;
        }

        return -1;
        // while(pq.size()>k)
        // {
        //     pq.poll();
        // }

        // return pq.peek();
        
        
    }
}