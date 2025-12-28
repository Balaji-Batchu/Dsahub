class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int ans = 0;

        for(int n = 0; n < rows; n ++) {
            for(int m = 0; m < cols; m ++) {
                if(grid[n][m] < 0) {
                    ans += (cols - m) * (rows - n);
                    cols = m;
                }
            }
        }

        return ans;
    }
}