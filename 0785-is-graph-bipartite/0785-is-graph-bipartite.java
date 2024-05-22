class Solution {
    public boolean isBipartite(int[][] graph) {

        int n = graph.length;

        int[] colour = new int[n];

        for (int start = 0; start < n; start++) {

            if (colour[start] == 0) {
                Queue<Integer> q = new LinkedList<>();
                colour[start] = 1;
                q.add(start);
                while (!q.isEmpty()) {
                    int node = q.poll();
                    for (int i = 0; i < graph[node].length; i++) {
                        if (colour[graph[node][i]] == 0) {
                            colour[graph[node][i]] = colour[node] == 1 ? 2 : 1;
                            q.add(graph[node][i]);
                        } else if (colour[graph[node][i]] == colour[node]) {
                            return false;
                        }
                    }
                }

            }

        }

        return true;
    }
}