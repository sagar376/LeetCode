class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
//         int max=0;
//         int size=points.length;
//         int[] xAxis=new int[size];
        
//         for(int i=0;i<size;i++)
//         {
//             xAxis[i]=points[i][0];
//         }
//         Arrays.sort(xAxis);
//         //System.out.print(Arrays.toString(xAxis));
        
//         for(int i=size-1;i>0;i--)
//         {
//             max=Math.max(max,(xAxis[i]-xAxis[i-1]));
//         }
//         return max;
        
         Set<Integer> xCoordinates= new TreeSet<>();
        int size=points.length;
        
        for(int i=0;i<size;i++)
        {
            xCoordinates.add(points[i][0]);
        }
        int maxWidth=0;
        Integer prevX=null;
        for(int x:xCoordinates)
        {
            if(prevX!=null)
            {
                maxWidth=Math.max(maxWidth,x-prevX);
            }
            prevX=x;
            
        }
        return maxWidth;
    }
}