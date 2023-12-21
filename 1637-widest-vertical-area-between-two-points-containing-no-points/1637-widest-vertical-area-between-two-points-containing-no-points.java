class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int max=0;
        int size=points.length;
        int[] xAxis=new int[size];
        
        for(int i=0;i<size;i++)
        {
            xAxis[i]=points[i][0];
        }
        Arrays.sort(xAxis);
        //System.out.print(Arrays.toString(xAxis));
        
        for(int i=0;i<size-1;i++)
        {
            max=Math.max(max,Math.abs(xAxis[i]-xAxis[i+1]));
        }
        return max;
    }
}