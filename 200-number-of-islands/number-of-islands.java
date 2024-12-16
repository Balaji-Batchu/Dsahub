class Solution {
    public int numIslands(char[][] grid) {
        
        int rows = grid.length, cols = grid[0].length, count = 0;
        boolean[][] visited = new boolean[rows][cols];

        for(int x = 0; x < rows; x ++){
            for(int y = 0; y < cols; y ++){
                if(grid[x][y] == '1' && visited[x][y] != true){
                    count ++;
                    dfs(x, y, visited, grid, rows, cols);
                }
            }
        }

        return count;
    }

    public static void dfs(int row, int col, boolean[][] visited, char[][] grid, 
                                                            int n, int m){
        
        if((row >= 0 && row < n) && (col >= 0 && col < m)){
            if(grid[row][col] == '1' && visited[row][col] != true){
                visited[row][col] = true;
                dfs(row, col - 1, visited, grid, n, m);
                dfs(row - 1, col, visited, grid, n, m);
                dfs(row, col + 1, visited, grid, n, m);
                dfs(row + 1, col, visited, grid, n, m);
            }
        }
    }
}