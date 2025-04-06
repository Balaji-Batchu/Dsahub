class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int x = 0; x < numCourses; x ++) adj.add(new ArrayList<Integer>());

        for(int[] par: prerequisites){
            adj.get(par[0]).add(par[1]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] pathVisited = new boolean[numCourses];

        for(int x = 0; x < numCourses; x ++){
            if(!visited[x]){
                if(dfs(x, adj, visited, pathVisited)) return false;
            }
        }

        return true;
    }


    public static boolean dfs(int curr, ArrayList<ArrayList<Integer>> adj, boolean[] visited,
                    boolean[] pathVisited){
            if(pathVisited[curr]) return true;

            if(visited[curr]) return true;

            pathVisited[curr] = true;

            for(int dep: adj.get(curr)){
                if(!visited[dep]){
                    if(dfs(dep, adj, visited, pathVisited) == true) return true;
                }
                else if(pathVisited[dep]) return true;
            }

            pathVisited[curr] = false;
            visited[curr] = true;
            return false;
        }
}