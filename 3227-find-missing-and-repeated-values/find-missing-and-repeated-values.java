class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid[0].length * grid.length;
        int[] seq = new int[n + 1];
        int[] ans = new int[2];

        for(int x = 0; x < grid[0].length; x ++){
            for(int y = 0; y < grid.length; y ++){
                int curr = grid[x][y];
                if(seq[curr] != 0) ans[0] = curr;
                seq[curr] = 1;
            }
        }

        for(int x = 1; x <= n; x++){
            if(seq[x] == 0){
                ans[1] = x;
            }
        }

        return ans;
    }
}