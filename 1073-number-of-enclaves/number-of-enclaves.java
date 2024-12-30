class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length, m = grid[0].length, ans = 0;
        boolean[][] visited = new boolean[n][m];
        Deque<int[]> dq = new ArrayDeque<>();

        for(int x = 0; x < n; x ++){
            for(int y = 0; y < m; y ++){
                if(x == 0 || y == 0 || x == n - 1 || y == m - 1){
                    if(grid[x][y] == 1){
                        dq.add(new int[]{x, y});
                        // visited[x][y] = true;
                    }
                }
            }
        }

        while(!dq.isEmpty()){
            int[] current = dq.poll();
            int row = current[0], col = current[1];

            if(row >= 0 && row < n && col >= 0 && col < m 
                                && !visited[row][col] && grid[row][col] == 1){
                    
                    dq.add(new int[]{row, col - 1});
                    dq.add(new int[]{row - 1, col});
                    dq.add(new int[]{row, col + 1});
                    dq.add(new int[]{row + 1, col});
                    visited[row][col] = true;
                }
            }

            System.out.println(Arrays.deepToString(visited));

        for(int x = 0; x < n; x ++){
            for(int y = 0; y < m; y ++){
                if(grid[x][y] == 1 && !visited[x][y]) ans ++;
            }
        }

        return ans;

    }
}