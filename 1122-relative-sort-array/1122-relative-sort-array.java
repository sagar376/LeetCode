class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

       Map<Integer,Integer> freq=new TreeMap<>();

       for(int i=0;i<arr1.length;i++)
       {
            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
       }

       int[] temp=new int[arr1.length];

        int index=0;

        for(int i=0;i<arr2.length;i++)
        {
            int count=freq.get(arr2[i]);

            while(count!=0)
            {
                temp[index]=arr2[i];
                index++;
                count--;
            }

            freq.remove(arr2[i]);
        }

         // Place remaining elements into result
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();
            while (count > 0) {
                temp[index++] = key;
                count--;
            }
        }

        return temp;
        
    }
}