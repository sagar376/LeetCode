class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int answer = 0;
        int len = arr.length;

        for(int i = 0; i < len - 2; i++)
        {
            for(int j = i+1; j < len - 1; j++)
            {
                for(int k = j+1; k < len ; k++)
                {
                    if( (Math.abs(arr[i] - arr[j]) <= a) &&  (Math.abs(arr[j] - arr[k]) <= b) && (Math.abs(arr[i] - arr[k]) <=c ) )
                    {
                        answer++;
                    }
                }
            }
        }
        return answer;

        
    }
}