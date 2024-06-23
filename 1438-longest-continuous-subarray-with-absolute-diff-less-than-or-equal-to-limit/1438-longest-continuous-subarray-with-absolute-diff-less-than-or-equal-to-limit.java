import java.util.TreeMap;

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int left = 0, right = 0;
        int maxWindow = 0;

        TreeMap<Integer, Integer> window = new TreeMap<>();

        while (right < nums.length) {
            window.put(nums[right], window.getOrDefault(nums[right], 0) + 1);

            while (window.lastKey() - window.firstKey() > limit) {
                window.put(nums[left], window.get(nums[left]) - 1);
                if (window.get(nums[left]) == 0) {
                    window.remove(nums[left]);
                }
                left++;
            }

            maxWindow = Math.max(maxWindow, right - left + 1);
            right++;
        }

        return maxWindow;
    }
}
