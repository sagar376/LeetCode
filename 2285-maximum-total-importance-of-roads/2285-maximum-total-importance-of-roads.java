//My Soln
class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long res = 0;

        int [] a = new int[n];

        for(int [] r: roads) {
            a[r[0]]++;
            a[r[1]]++;
        }

        int [] arr = new int[n + 1];

        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>((a1, b) -> b.getValue() - a1.getValue());

        for(int i = 0; i < n; i++) {
            pq.add(new Pair<>(i, a[i]));
        }

        while(!pq.isEmpty()) {
            arr[pq.peek().getKey()] = n--;
            pq.remove();
        }

        for(int [] r : roads) {
            res += arr[r[0]] + arr[r[1]];
        }

        return res;
    }
}
// class Solution {
//     public long maximumImportance(int n, int[][] roads) {
//         int row=roads.length;
//         int col=roads[0].length;
//         int[] degree=new int[n];

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 degree[roads[i][j]]++;
//             }
//         }

//         Arrays.sort(degree);

//         long totalImportance=0;
//         int value=1;

//         for(int num:degree)
//         {
//             totalImportance+=(long)num*value;
//             value++;
//         }

//         return totalImportance ;


        
//     }
// }