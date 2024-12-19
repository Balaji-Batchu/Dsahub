class Solution {
    public int[][] updateMatrix(int[][] mat) {

        int n = mat.length, m = mat[0].length;
        boolean[][] visited = new boolean[n][m];
        int[][] ans = new int[n][m];
        Deque<Pair> dq = new ArrayDeque<>();

        for(int x = 0; x < n; x ++){
            for(int y = 0; y < m; y ++){
                if(mat[x][y] == 0){
                    visited[x][y] = true;
                    dq.add(new Pair(x, y, 0));
                }
            }
        }

        int[] rowind = {-1, 0, 1, 0};
        int[] colind = {0, +1, 0, -1};
        while(! dq.isEmpty()){
            Pair pair = dq.poll();
            ans[pair.row][pair.col] = pair.distance;

            for(int i = 0; i < 4; i ++){
                int nrow = pair.row + rowind[i];
                int ncol = pair.col + colind[i];

                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && !visited[nrow][ncol]){
                    visited[nrow][ncol] = true;
                    dq.add(new Pair(nrow, ncol, pair.distance + 1));
                }
            }
        }

        return ans;
    }
}




class Pair{
    int row;
    int col;
    int distance;

    Pair(int row, int col, int distance){
        this.row = row;
        this.col = col;
        this.distance = distance;
    }
}