class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int x = 0; x < m; x ++){
            for(int y = 0; y < n; y ++){
                dp[x][y] = -1;
            }
        }
        return helper(0, 0, m - 1, n - 1, dp);
    }


    public int helper(int x, int y, int m, int n, int[][] dp){
        System.out.println("x :" + x + " y :" + y);
        if(x > m || y > n) return 0;

        if(x == m && y == n){
            System.out.println("YUPPPPPPP");
            return 1;
        } 

        if(dp[x][y] != -1){
            return dp[x][y];
        }

        int right = helper(x + 1, y, m, n, dp);
        int down = helper(x, y + 1, m, n, dp);

        dp[x][y] = right + down;
        return dp[x][y];
    }
}