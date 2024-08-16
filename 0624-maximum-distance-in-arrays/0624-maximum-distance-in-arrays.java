class Solution {
    public int maxDistance(List<List<Integer>> arrays) {

        int maxDistance = Integer.MIN_VALUE;


        // int first = arrays.get(0).get(0);
        // int last = arrays.get(0).get(arrays.get(0).size()-1);
        //System.out.println(first+" "+last);

        // for(int i = 1; i < arrays.size(); i++)
        // {
        //     int dist = Math.max( Math.abs(first - arrays.get(i).get(arrays.get(i).size()-1)), Math.abs(last - arrays.get(i).get(0)) );

        //     maxDistance = Math.max(maxDistance, dist);
        // }

        for(int i = 0; i < arrays.size(); i++)
        {
            for(int j = i + 1; j < arrays.size(); j++)
            {
                int dist = Math.max( Math.abs(arrays.get(i).get(0) - arrays.get(j).get(arrays.get(j).size()-1)), Math.abs(arrays.get(i).get(arrays.get(i).size()-1) - arrays.get(j).get(0)) );

            maxDistance = Math.max(maxDistance, dist);
            }
        }


        return maxDistance;
        
    }
}