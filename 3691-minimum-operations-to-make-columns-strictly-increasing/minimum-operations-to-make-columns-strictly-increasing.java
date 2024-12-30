class Solution {
    public int minimumOperations(int[][] grid) {
        int count = 0, n = grid.length, m = grid[0].length;

        for(int c = 0; c < m; c ++){
            for(int r = 1; r < n; r ++){
                if(grid[r][c] <= grid[r - 1][c]){
                    count += grid[r - 1][c] - grid[r][c] + 1;
                    grid[r][c] = grid[r - 1][c] + 1;
                }
            }
        }

        return count;
    }
}