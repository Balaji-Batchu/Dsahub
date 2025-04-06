class Solution {
    public boolean isBipartite(int[][] edges) {
        int V = edges.length;
        int[] colored = new int[V];
        Arrays.fill(colored, -1);
        
        for(int x = 0; x < V; x ++){
            if(colored[x] == -1){
                Queue<Integer> que = new LinkedList<>();
                que.add(x);
                colored[x] = 0;

                while(!que.isEmpty()){
                    int curr = que.remove();
                    for(int neighbor: edges[curr]){
                        if(colored[neighbor] == -1){
                            colored[neighbor] = 1 - colored[curr];
                            que.add(neighbor);
                        }
                        
                        else if(colored[neighbor] == colored[curr]) return false;
                    }
                }
            }

        }

        return true;

    }
}