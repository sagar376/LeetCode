class Solution {
    public int findMinDifference(List<String> timePoints) {

        int[] min = new int[timePoints.size()];
        for(int i = 0; i < timePoints.size(); i++)
        {
            min[i] = convertIntoMin(timePoints.get(i));
        }

        Arrays.sort(min);

        int minDiff = Integer.MAX_VALUE;
        // minDiff = Math.min(minDiff, min[0] - 0);
        // minDiff = Math.min(minDiff, (24 * 60) - min[min.length - 1]);
        for(int i = 1; i < min.length; i++)
        {
            minDiff = Math.min(minDiff, min[i] - min[i-1] );
        }
        

        return Math.min(minDiff, 24 * 60 - min[min.length - 1] + min[0] );
    }

    private int convertIntoMin(String time)
    {
        int hour = Integer.valueOf(time.substring(0,2)) - 0;
        int min = Integer.valueOf(time.substring(3,5)) - 0;

        return hour*60 + min;
    }
}