class Solution {
    public int[] sortArray(int[] nums) {

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> a-b);

        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }

        int result[] = new int[nums.length];
        int idx = 0;

        while(!pq.isEmpty())
        {
            result[idx++] = pq.poll();
        }
        
        return result;
    }
}